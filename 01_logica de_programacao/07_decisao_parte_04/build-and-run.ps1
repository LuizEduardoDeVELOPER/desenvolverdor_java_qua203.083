# build-and-run.ps1
# Script simples para compilar e executar o projeto Java usando o JDK configurado no sistema.
# Uso: Abra PowerShell, navegue até o diretório do projeto e rode: .\build-and-run.ps1

# Detecta JAVA_HOME ou usa java do PATH
if ($env:JAVA_HOME) {
    $javac = Join-Path $env:JAVA_HOME "bin\javac.exe"
    $java = Join-Path $env:JAVA_HOME "bin\java.exe"
} else {
    $javac = "javac"
    $java = "java"
}

Write-Host "Usando javac: $javac"
Write-Host "Usando java:  $java"

# Cria pasta bin se não existir
$binDir = Join-Path (Get-Location) "bin"
if (!(Test-Path $binDir)) { New-Item -ItemType Directory -Path $binDir | Out-Null }

# Compila todos os arquivos Java em src para bin
Write-Host "Compilando arquivos em src/ para bin/ (target Java 21 se o JDK suportar)..."
& $javac --release 21 -d $binDir (Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilação falhou (exit code $LASTEXITCODE). Tentando compilar sem --release..."
    & $javac -d $binDir (Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
    if ($LASTEXITCODE -ne 0) { throw "Compilação falhou novamente (exit code $LASTEXITCODE). Verifique o código fonte." }
}

# Descobre classe com main (heurística simples: procurar public static void main)
$mainClass = $null
Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object {
    $content = Get-Content $_.FullName -Raw
    if ($content -match "public\s+static\s+void\s+main\s*\(") {
        # Converte caminho src/foo/Bar.java -> foo.Bar
        $relative = $_.FullName.Substring((Get-Location).Path.Length + 1)
        $relative = $relative -replace "^src\\","" -replace "\\","." -replace "\.java$",""
        if (-not $mainClass) { $mainClass = $relative }
    }
}

if (-not $mainClass) { Write-Host "Não foi encontrada classe com main. Execute manualmente: java -cp bin <ClassePrincipal>"; exit 0 }

Write-Host "Executando: java -cp bin $mainClass"
& $java -cp $binDir $mainClass

exit $LASTEXITCODE
