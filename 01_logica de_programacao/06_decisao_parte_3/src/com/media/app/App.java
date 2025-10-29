package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//instancia classe Scanner

Scanner leia = new Scanner(System.in);


//fecha objeto leia

// declaração de variaveis 
String nome;
double nota;

//entrada de dados 

System.out.println("Informe o nome");
nome = leia.nextLine();
System.out.println("Informe a nota de 0 a 10");
nota = leia.nextDouble();



//verifica se a nota é valida 

if (nota for >= 0 && nota <=10) {
    if (nota >=7) {
        System.out.println("Está aprovado");
   
   else if (nota>=5) {
    System.out.println(nome + "Está de recuperação");

   }
   else {
    System.out.println(nome + "está reprovado");
   }
   
    }

else {
    System.out.println("Nota invalida");
}



// fecha objeto leia


leia.close();


    
}
