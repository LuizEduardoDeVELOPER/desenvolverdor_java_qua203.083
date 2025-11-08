package com.heranca.models;

public class PessoaFisica {
    //atributos 
    public String mome;
    public String cpf;
    public int idade;

    public PessoaFisica(String mome, String cpf, int idade, String email, String telefone) {
        
        super(email, telefone); 
        this.mome = mome;
        this.cpf = cpf;
        this.idade = idade;

    }
        public void exibirDados() {
System.out.println("Nome: + this.nome");
System.out.println("CPF: + this.nome");
System.out.println("idade: + this.nome");
super.exibirDados();
        }
    

}
