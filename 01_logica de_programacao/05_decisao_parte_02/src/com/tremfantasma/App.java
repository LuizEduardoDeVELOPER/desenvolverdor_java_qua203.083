package com.tremfantasma;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instancia a classe Scanner 
Scanner leia= new Scanner (System.in);

// Declaração das variaveis 
String nome;
int idade;
double altura; 

//entrada de dados
System.out.println("informe o nome");
nome = leia.nextLine();
System.out.println("informe o a idade");
idade = leia.nextInt();
System.out.println("informe a altura em metros");
altura = leia.nextDouble();

// estrtutura de decisao 

if (idade >= altura>= 1.5) {
    System.out.println( nome + "Não foi autorizado");
}

//fecha objeto scanner

leia.close();

    }
}
