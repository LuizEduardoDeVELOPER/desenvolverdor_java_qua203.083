
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //instancia o Scanner
Scanner leia = new Scanner (System.in);

 // Declaração de variveis 
String nome;
String resultado;
Double peso;
double altura;
double imc;


// Entrada de dados
System.out.println("Informe seu nome:");
nome = leia.nextLine();
System.out.println("Informe o peso em kg:");
peso = leia.nextDouble();
System.out.println("Informe sua altura:");
altura = leia.nextDouble();

//calcular o imc
imc = peso/Math.pow(altura, 2);

//Exibi o imc da tela 

System.out.println( nome + " , seu imc é" + imc + ".");

//exibe diagnóstico 

resultado = (imc < 18.5) ? "está abaixo do peso": 
(imc < 25) ? " está no peso ideial":
(imc <30) ? "está acima do peso":
( imc < 35) ? "esta obeso":
(imc < 40) ?  " está com obsidade nivel 2":
"está com obesidade morbida";

// ebibe o resultado 

System.out.println(nome + resultado +".");

//fecha objeto leia 
leia.close();
    }
}
