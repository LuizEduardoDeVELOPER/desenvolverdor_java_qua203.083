package com.heranca.models;

public class PessoaJuridica extends Pessoa{
    //atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;



    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj String email, String telefone) {
        super(email, telefone);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;

        publi void exibirDados(){
System.out.println("Razão social" + this.razaoSocial);
System.out.println("Nome da empresa" + this.nomeFantasia);
System.out.println("Razão social" + this.cnpj);
super.exibirDados(); 

        }
    }

}
