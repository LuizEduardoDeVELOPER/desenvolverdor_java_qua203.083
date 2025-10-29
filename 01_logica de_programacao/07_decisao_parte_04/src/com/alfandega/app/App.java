package com.alfandega.app;

import java.util.Scanner;


public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

// instancia a classe Scanner 
Scanner leia = new Scanner(System.in);


// declaração de variaveis

String nome;
String resultado;
Double valor;


System.out.println("informe o nome do passageiro:");
nome = leia.hasNextLine();LL
System.out.println("Informe o valor da bagagem:");
valor = leia.nextDouble();





// verifica o valor

resultado = (valor <=1000) ? "esta liberado" : "esta retido";


//mostra o resultado
System.out.println("nome + resultado");


//fecha objeto leia
leia.close();
    }
}
