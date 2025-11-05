package com.objeto.app;

public class Pessoa {
//atributos

public String nome;
public String cpf;
public int idade;
public double altura;
// métodos
public String email;

//metodo 
public void exibirDados () {

System.out.println("DADOS DO USUÁRIO:\n");
System.out.println("nome:" + this.nome);
System.out.println("CPF:" + this.cpf);
System.out.println("E-mail:" + this.email);
System.out.println("Idade:" + this.idade);
System.out.println("Altura:" + this.altura + "m");



}

}
