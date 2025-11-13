public class Pessoa {
    // Atributos privados (Encapsulamento)
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters (Interface pública)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    // ... adicione Getters/Setters para peso e altura se necessário ...
   
/**
 * Método Setter para alterar a idade da pessoa.
 * @param novaIdade O novo valor da idade.
 */
public void setIdade(int novaIdade) {
    // É uma boa prática incluir uma validação (ex: idade não pode ser negativa)
    if (novaIdade >= 0) {
        this.idade = novaIdade;
    } else {
        System.out.println("Erro: A idade não pode ser negativa.");
    }
}

// ... outros métodos ...

    // Método de Negócio (exemplo)
    public double calcularIMC() {
        // Fórmula do IMC: peso / (altura * altura)
        return this.peso / (this.altura * this.altura);
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("IMC: " + calcularIMC());
    }
}