package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
Pessoa usuario = new Pessoa();

// entrada de dados 
usuario.setNome(JOptionPane.showInputDialog("Informe seu nome"));

usuario.setIdade( Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));

usuario.setCpf(JOptionPane.showInputDialog("Infome seu CPF"));
usuario.setEmail(JOptionPane.showInputDialog("Infome seu E-mail"));
usuario.setTelefone(JOptionPane.showInputDialog("Infome seu Telefone"));

// saida de dados

JOptionPane.showMessageDialog(
  null,
  "DADOS DO USUÁRIO:\n "  + usuario.getNome() +
  "\n Idade" + usuario.getIdade() +
  "\n CPF" + usuario.getCpf() +
  "\nE-mail" + usuario.getEmail() +
  "\nTelefone" + usuario.getTelefone() 



);
    }
}
