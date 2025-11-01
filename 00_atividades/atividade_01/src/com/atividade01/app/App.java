package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// todo atividade 

        /*
         * Crie um programa que receba do usuario:
         * nome
         * data de nascimento
         * CPF
         * E-mail
         * Telefone
         * exiba os dados na tela
         */
  // 1. Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 2. Peça e receba o Nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // nextLine() é bom para ler a linha completa, incluindo espaços

        // 3. Peça e receba a Data de Nascimento
        System.out.print("Digite sua data de nascimento (ex: dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        // 4. Peça e receba o CPF
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        // 5. Peça e receba o E-mail
        System.out.print("Digite seu E-mail: ");
        String email = scanner.nextLine();

        // 6. Peça e receba o Telefone
        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        // 7. Feche o Scanner (boa prática para liberar recursos)
        
        scanner.close();

        // 8. Exiba todos os dados na tela
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
  

        }

}
