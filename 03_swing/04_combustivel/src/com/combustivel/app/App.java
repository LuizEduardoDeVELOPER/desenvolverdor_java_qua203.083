package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();

// array 

String [] opcoes = {"Informar valores", "Sair do programa"};
Object opcao; 

do {
    //entrada de dados 

opcao = JOptionPane.showInputDialog(
    null, 
    "SELECIONE UMA OPÇÃO", 
    "COMBUSTIVEL",
     0, 
     null, 
     opcoes, 
     opcoes[0]

     );
    
if (opcao != "Sair o Programa") {

    combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Iforme o valor da gasolina:")));
    combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Iforme o valor dO Etanol:")));
    
    // saida de dados
    JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel() );
    
}

    
} while (opcao != "Sair do programa");
    
    }
}
