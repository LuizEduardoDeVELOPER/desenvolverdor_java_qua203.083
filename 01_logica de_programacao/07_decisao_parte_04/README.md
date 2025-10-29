## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:


Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Atualizar runtime para Java 21 (LTS)

Este projeto não usa Maven/Gradle detectáveis no repositório — é um projeto simples com código-fonte em `src/` e saída em `bin/`.

Se a ferramenta automática de upgrade não estiver disponível (limitação de plano), siga estes passos manuais para atualizar o runtime para Java 21 no Windows (PowerShell):

1) Instalar JDK 21
	- Opções populares: Eclipse Temurin (Adoptium), Microsoft Build of OpenJDK, Amazon Corretto, Azul Zulu.
	- Baixe do site do fornecedor e instale normalmente (ex.: https://adoptium.net/).

2) Verificar instalação (abra PowerShell):

```powershell
java -version
javac -version
```

Deve retornar algo como `openjdk 21.0.x`.

3) Ajustar variáveis de ambiente (opcional, persistente):

```powershell
# Substitua pelo caminho real da sua instalação do JDK 21
setx JAVA_HOME "C:\\Program Files\\Eclipse Adoptium\\jdk-21" -m
setx PATH "$env:JAVA_HOME\\bin;$env:PATH" -m
```

Feche e reabra o terminal para as mudanças terem efeito.

4) Compilar e executar o projeto

- Usando o script incluído (recomendado):

```powershell
# No diretório do projeto
.\build-and-run.ps1
```

- Ou manualmente:

```powershell
javac --release 21 -d bin src\\*.java
java -cp bin App
```

5) Projetos com Maven/Gradle (não detectados neste repositório)

- Maven: atualize o `maven-compiler-plugin` para usar `<release>21</release>` ou `<source>21</source>` e `<target>21</target>`.
- Gradle: defina `java.toolchain.languageVersion = JavaLanguageVersion.of(21)` ou `sourceCompatibility = 21` e `targetCompatibility = 21`.

Próximos passos disponíveis
- Se preferir, posso gerar as alterações de build (pom.xml / build.gradle) se você adicionar esses arquivos ou pedir para eu criar um `pom.xml` de exemplo.
- Posso também orientar na instalação do JDK 21 passo a passo com links e capturas de tela, se desejar.

-- Fim das instruções de upgrade --
