import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        String nome = "";
        int idade = 0;
        double peso = 0.0;
        double altura = 0.0;

        // --- 1. Coleta de Dados Usando JOptionPane ---

        // Nome
        nome = JOptionPane.showInputDialog(
            null,
            "CRIANDO PESSOA\n\nDigite o nome:",
            "Entrada",
            JOptionPane.QUESTION_MESSAGE
        );
        if (nome == null) {
            return; // Usuário cancelou
        }

        // Idade
        try {
            String inputIdade = JOptionPane.showInputDialog(
                null,
                "Digite a idade:",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE
            );
            if (inputIdade == null) return;
            idade = Integer.parseInt(inputIdade);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida. Usando 0.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Peso
        try {
            String inputPeso = JOptionPane.showInputDialog(
                null,
                "Digite o peso (em kg, ex: 65.5):",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE
            );
            if (inputPeso == null) return;
            // Garante que aceita tanto ponto quanto vírgula
            peso = Double.parseDouble(inputPeso.replace(',', '.'));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Peso inválido. Usando 0.0.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Altura
        try {
            String inputAltura = JOptionPane.showInputDialog(
                null,
                "Digite a altura (em metros, ex: 1.70):",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE
            );
            if (inputAltura == null) return;
            altura = Double.parseDouble(inputAltura.replace(',', '.'));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Altura inválida. Usando 0.0.", "Erro", JOptionPane.ERROR_MESSAGE);
        }


        // --- 2. Processamento (Criação do Objeto) ---

        // Cria o objeto Pessoa usando o construtor
        Pessoa novaPessoa = new Pessoa(nome, idade, peso, altura);

        // Calcula o IMC usando o método encapsulado
        double imcCalculado = novaPessoa.calcularIMC();

        // --- 3. Exibição do Resultado ---

        String resultado = String.format(
            "--- Dados da Pessoa Criada ---\n" +
            "Nome: %s\n" +
            "Idade: %d anos\n" +
            "Peso: %.2f kg\n" +
            "Altura: %.2f m\n" +
            "IMC Calculado: %.2f",
            novaPessoa.getNome(),
            novaPessoa.getIdade(),
            peso,
            altura,
            imcCalculado
        );

        JOptionPane.showMessageDialog(
            null,
            resultado,
            "Pessoa Criada com Sucesso",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
//TODO: atividade 05

// recrie o programa do IMC, desta vez usando os conceitos de orientação a Obejtos, encapsulamento e interface gráfica com JOptionpane. 
// ao terminar, gere o executável