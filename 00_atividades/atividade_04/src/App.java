

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// instancia a classe Scanner 
 Scanner leia = new Scanner (System.in);

 //declaração de variaveis

 String [] salas = new String[5];
 String nome;
 String sala;
 int idade;
 int idadeMinima = 0;

 //inicializar o array 
 salas [0] =" A roda Quadrada";
 salas [1] = " A volta dos Que Não Foram";
 salas [2] = " Poeira em alto mar";
 salas [3] = "  As tranças do Rei Careca";
 salas [4] = " A vigança do Peixe Frito";

 // entrada de dados 
 System.out.println("Informe o nome");
 nome = leia.nextLine();
 System.out.println("Informe a idade");
 idade = leia.nextInt(); 

// limpeza de buffer

leia.nextLine();
// loop
do {
// Menu
System.out.println("Sala 1 - " + salas [0] + " - livre");
System.out.println("Sala 2 - " + salas [1] + " - 12 anos");
System.out.println("Sala 3 - " + salas [2] + " - 14 anos");
System.out.println("Sala 4 - " + salas [3] + " - 16 anos");
System.out.println("Sala 5 - " + salas [4] + " - 18 anos");
sala = leia.nextLine();
} while (idade < idadeMinima);



// FEChA OBEJETO

leia.close();


}
}
