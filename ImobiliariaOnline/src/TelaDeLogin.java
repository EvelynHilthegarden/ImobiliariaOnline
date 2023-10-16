import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List; // Importe a classe List correta

public class TelaDeLogin extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private List<Cliente> clientesCadastrados;
    private List<Colaborador> colaboradoresCadastrados;

    public TelaDeLogin() {
        super("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Simulando alguns clientes cadastrados
        clientesCadastrados = new ArrayList<>();
        clientesCadastrados.add(new Cliente("0001/2023", "senha123"));
        clientesCadastrados.add(new Cliente("0002/2023", "abc123"));

        // Simulando cadastro de alguns colaboradores
        colaboradoresCadastrados = new ArrayList<>();
        colaboradoresCadastrados.add(new Colaborador("0009/2023", "2023001"));
        colaboradoresCadastrados.add(new Colaborador("0010/2023", "2023002"));

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2));

        JLabel labelUsuario = new JLabel("Usuário:");
        JLabel labelSenha = new JLabel("Senha:");
        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();

        JButton botaoLogin = new JButton("Login");
        botaoLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });

        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(new JLabel());
        painel.add(botaoLogin);

        add(painel);
        setVisible(true);
    }

    private void realizarLogin() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        // Verificar se as credenciais correspondem a um cliente cadastrado
        boolean autenticado = false;
        for (Cliente cliente : clientesCadastrados) {
            if (cliente.getChaveDeAcesso().equals(senha) && cliente.getNumeroProcesso().equals(usuario)) {
                autenticado = true;
                JOptionPane.showMessageDialog(this, "Login bem-sucedido! Bem-vindo!");
                break;
            }
        }
        // Verifica se as credenciais pertencem a algum colaborador cadastrado
        for (Colaborador colaborador : colaboradoresCadastrados) {
            if (colaborador.getSenha().equals(senha) && colaborador.getUsuario().equals(usuario)) {
                autenticado = true;
                JOptionPane.showMessageDialog(this, "Login bem-sucedido! Bem-vindo!");
                break;
            }
        }

        if (!autenticado) {
            JOptionPane.showMessageDialog(this, "Falha no login. Verifique suas credenciais.");
        }
    }
}
