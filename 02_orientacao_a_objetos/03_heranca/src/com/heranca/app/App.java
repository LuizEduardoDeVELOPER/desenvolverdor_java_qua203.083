package com.heranca.app;

//classe java importada
import java.util.Scanner;

import javax.swing.plaf.synth.SynthButtonUI;

//classes criadas por mim
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
        public static void main(String[] ar gs) throws Exception {
//instancia
Scanner leia = new Scanner(System.in);


PessoaFisica usuario = new PessoaFisica(
    null,
     null,
      0,
      null,
            null
);

PessoaJuridica corp = new PessoaJuridica(
 null, 
 null,
 null,
 null,
 null
 );

System.out.println("Informe os dados do usuario:\n");
System.out.println("Informe seu nome");
usuario.nome = leia.nextLine();
System.out.println("Informe cpf");
usuario.cpf = leia.nextLine();
System.out.println("Informe seu e-mail");
usuario.email = leia.nextLine();
System.out.println("Informe o telefone");
usuario.telefone = leia.nextLine();
System.out.println("Informe a idade");
usuario.nome = leia.nextInt();


//limpeza de buffer
 leia.nextLine();

 // informe os dados da empresa
 System.out.println("n/Informe o nomme da empresa:\n");
 System.out.println("Informe o nome da empresa:");
 corp.nomeFantasia = leia.nextLine();
 System.out.println("Informe a razão Social:");
 corp.razaoSocial = leia.nextLine();
 System.out.println("Informe o  CNPJ");
 corp.cnpj = leia.nextLine();
 System.out.println("Informe o e-mail:");
 corp.email = leia.nextLine();
 System.out.println("Informe o telefone:");
 corp.nomeFantasia = leia.nextLine();


//saida de dados
System.out.println("\nDADOS DO USUARIO\n");
usuario.exibirDados();
System.out.println("\nDADOS DA EMPRESA\n");
corp.exibirDados();

 // fecha objeto
leia.close();
    }
}
