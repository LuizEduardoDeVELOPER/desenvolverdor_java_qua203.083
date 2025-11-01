package com.novacalculadora.app;

    import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        // instancia scanner

Scanner leia = new Scanner((System.in));


//Declaração de variaveis 

double x;
double y;
double resultado = 0.0;
String operacao;

// FIXEME: loop 
do { 
    // menu

    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    System.out.println("5 - Resto da divisão");
    System.out.println("6 - Potencia");
    System.out.println("7 - Sair do programa");
    System.out.println("Informe a opção Desejada:");
    operacao = leia.nextLine();


if (!operacao.equals ("7"))  {
    // entrada de dados
System.out.println("informe o valor de x:");
x = leia.nextDouble();
System.out.println("informe o valor de y:");
y = leia.nextDouble();


leia.nextLine(); // todo

switch (operacao) {
    case "1":
    resultado = x+y;    
        break;
 case "2":    
     resultado = x-y;    

        break;
 case "3":    
     resultado = x*y;    

        break;
   case "4":    
       resultado = x/y;    

        break;
   case "5":    
   resultado = x%y;
        break;   
    case "6": 
    resultado = Math.pow(x,y);  
        break;       
        default:
        System.out.println("Operador invalido"); 
}
// mostrar resultado
System.out.println("Resultado:" + resultado);
}



  }  while(!operacao.equals("7"));


// FECHA OBJETO
leia.close();
    }
}
