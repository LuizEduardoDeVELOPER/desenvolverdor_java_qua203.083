import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// --- CLASSES BASEADAS NO SEU DIAGRAMA ---
class Pessoa {
    long idPessoa;
    String email;
    String telefone;

    Pessoa(long id, String email, String tel) {
        this.idPessoa = id;
        this.email = email;
        this.telefone = tel;
    }
}

class PessoaFisica extends Pessoa {
    String nome;
    String cpf;

    PessoaFisica(long id, String email, String tel, String nome, String cpf) {
        super(id, email, tel);
        this.nome = nome;
        this.cpf = cpf;
    }
}

// --- CLASSE DA INTERFACE ---
public class Main {
    public static void main(String[] args) {
        // Configuração da Janela
        JFrame janela = new JFrame("Cadastro UML - Pessoa Física");
        janela.setSize(450, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new GridLayout(7, 2, 10, 10));

        // Componentes do Formulário
        janela.add(new JLabel(" ID da Pessoa:"));
        JTextField txtId = new JTextField();
        janela.add(txtId);

        janela.add(new JLabel(" Nome:"));
        JTextField txtNome = new JTextField();
        janela.add(txtNome);

        janela.add(new JLabel(" E-mail:"));
        JTextField txtEmail = new JTextField();
        janela.add(txtEmail);

        janela.add(new JLabel(" Telefone:"));
        JTextField txtTel = new JTextField();
        janela.add(txtTel);

        janela.add(new JLabel(" CPF:"));
        JTextField txtCpf = new JTextField();
        janela.add(txtCpf);

        janela.add(new JLabel("")); // Espaço vazio
        JButton btnCadastrar = new JButton("Cadastrar no Sistema");
        janela.add(btnCadastrar);

        // Ação ao clicar no botão
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. Captura os dados da tela
                    long id = Long.parseLong(txtId.getText());
                    String nome = txtNome.getText();
                    String email = txtEmail.getText();
                    String tel = txtTel.getText();
                    String cpf = txtCpf.getText();

                    // 2. Cria o objeto baseado no seu diagrama UML
                    PessoaFisica novaPessoa = new PessoaFisica(id, email, tel, nome, cpf);

                    // 3. Exibe o resultado visualmente confirmando a criação do objeto
                    String resumo = "✅ Objeto 'PessoaFisica' criado!\n\n" +
                                    "ID: " + novaPessoa.idPessoa + "\n" +
                                    "Nome: " + novaPessoa.nome + "\n" +
                                    "E-mail: " + novaPessoa.email + "\n" +
                                    "CPF: " + novaPessoa.cpf;

                    JOptionPane.showMessageDialog(janela, resumo, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janela, "Erro: O ID deve ser um número!", "Erro de Digitação", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Centraliza e mostra a janela
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}