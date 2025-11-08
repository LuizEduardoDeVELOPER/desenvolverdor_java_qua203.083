package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.modelsCarro;
import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {
//instancia de classes 
Carro carro + new Carro();
Moto moto =  new Moto();

//declaração de variaveis
String combustivel;

//entrada de dados 

System.out.println("Informe os dados do carro\n");
System.out.println("Informe fabricante");



//padrão de combustíbel
carro.motoFlex = false;
carro.motorEletrico false;
carro.motorDiesel = false;

// usuario informa o tipo de combustivel 
System.out.println("\nInforme o tipo de combustível:\n");
System.out.println("1 - Gasolina ou Etanol");
System.out.println("2 - Tanto Gasolina como Etanol");
System.out.println("3 - Diesel");
System.out.println("4 - Elétrico");

switch (combustivel) {
case"1":
break;
case"2":
carro.motoFlex = true;
break;
case"3":
carro.motorDiesel = true;
break;
case"4":
carro.motorEletrico = true;
break; 
default: 
System.out.println("Motor inexistente.");

//entrada de dados
System.out.println("\nInforme os dados da moto:\n");
System.out.println("informe o fabricante");
moto.fabricante = leia.nextLine();
System.out.println("informe o modelo")
moto.modelo = leia.nextLine();
System.out.println("informe o cor");
moto.cor = leia.nextLine();
System.out.println("informe o ano"
moto.fabricante = leia.nextLine();
System.out.println("informe o fabricante");
moto.fabricante = leia.nextLine();


}


//fecha objeto 
leia.close();

    }

}
