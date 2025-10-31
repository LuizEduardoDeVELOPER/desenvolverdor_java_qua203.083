package com.contador.app;

import java.util.Scanner;
 

public class App {
    public static void main(String[] args) throws Exception {
// instancia a Scanner   

Scanner leia = new Scanner((System.in));


// entrada de dados 

System.out.println ("Informe um numero inteiro");
// declaração de variavel 
int n = leia.nextInt();

// loop ou Laço de repetição
while (n>= 0) {
    System.out.println(n);
    n-- ;
}

// fecha objeto Leia
 leia.close();
}
}
