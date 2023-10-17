import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaDeLogin extends JFrame {
    private JRadioButton clienteRadio;
    private JRadioButton colaboradorRadio;

    public TelaDeLogin() {
        setTitle("Login");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Barra laranja
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.decode("#FF8210"));
        headerPanel.setPreferredSize(new Dimension(getWidth(), 40));

        // Painel para o conteúdo central
        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(Color.WHITE); // Fundo branco

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);


        JLabel labelTitulo = new JLabel("Imobiliária Online");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 40));

        // Painel para botões de rádio (cliente e colaborador)
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.X_AXIS));
        radioPanel.setBackground(Color.WHITE); // Fundo branco

        ButtonGroup radioGroup = new ButtonGroup();

        clienteRadio = new JRadioButton("Cliente");
        clienteRadio.setBackground(Color.WHITE); // Fundo branco
        radioGroup.add(clienteRadio);

        colaboradorRadio = new JRadioButton("Colaborador");
        colaboradorRadio.setBackground(Color.WHITE); // Fundo branco
        radioGroup.add(colaboradorRadio);

        JPanel camposPanel = new JPanel(new GridBagLayout());
        camposPanel.setBackground(Color.WHITE); // Fundo branco

        gbc.anchor = GridBagConstraints.WEST; // Alinhar à esquerda

        JLabel labelUsuario = new JLabel("USUÁRIO");
        gbc.gridx = 0;
        gbc.gridy = 0;
        camposPanel.add(labelUsuario, gbc);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setPreferredSize(new Dimension(300, 40)); // Tamanho fixo
        gbc.gridy = 1;
        camposPanel.add(campoUsuario, gbc);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel labelSenha = new JLabel("SENHA");
        gbc.gridy = 2;
        camposPanel.add(labelSenha, gbc);
        labelSenha.setFont(new Font("Arial", Font.BOLD, 14));

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setPreferredSize(new Dimension(300, 40)); // Tamanho fixo
        gbc.gridy = 3;
        camposPanel.add(campoSenha, gbc);

        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPanel.add(labelTitulo, gbc);

        gbc.gridy = 1;
        contentPanel.add(radioPanel, gbc);

        gbc.gridy = 2;
        contentPanel.add(Box.createRigidArea(new Dimension(0, 20)), gbc);

        gbc.gridy = 3;
        contentPanel.add(camposPanel, gbc);

        radioPanel.add(Box.createRigidArea(new Dimension(10, 0))); // Espaço
        radioPanel.add(clienteRadio);
        radioPanel.add(Box.createRigidArea(new Dimension(10, 0))); // Espaço
        radioPanel.add(colaboradorRadio);

        JButton botaoLogin = new JButton("Fazer Login");
        botaoLogin.setPreferredSize(new Dimension(132, 40));
        botaoLogin.setBackground(Color.decode("#FF8210")); // Fundo laranja
        botaoLogin.setForeground(Color.WHITE); // Fonte branca
        botaoLogin.setFont(new Font("Arial", Font.BOLD, 14)); // Texto em negrito
        gbc.gridy = 4;
        contentPanel.add(botaoLogin, gbc);

        add(headerPanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);

    //Validação de Senha
    botaoLogin.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            String usuario = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());

            if (clienteRadio.isSelected()) {
                // Verificar a senha para o cliente
                if (validarSenhaCliente(usuario, senha)) {
                    // Senha correta, ação de login bem-sucedida para o cliente
                    JOptionPane.showMessageDialog(TelaDeLogin.this, "Login bem-sucedido como cliente!");
                } else {
                    // Senha incorreta, exibir mensagem de erro
                    JOptionPane.showMessageDialog(TelaDeLogin.this, "Falha no login. Verifique suas credenciais.");
                }
            } else if (colaboradorRadio.isSelected()) {
                // Verificar a senha para o colaborador
                if (validarSenhaColaborador(usuario, senha)) {
                    // Senha correta, ação de login bem-sucedida para o colaborador
                    JOptionPane.showMessageDialog(TelaDeLogin.this, "Login bem-sucedido como colaborador!");
                } else {
                    // Senha incorreta, exibir mensagem de erro
                    JOptionPane.showMessageDialog(TelaDeLogin.this, "Falha no login. Verifique suas credenciais.");
                }
            } else {
                // Nenhum tipo de usuário selecionado, exibir mensagem de erro
                JOptionPane.showMessageDialog(TelaDeLogin.this, "Selecione o tipo de usuário (cliente ou colaborador).");
            }
        }
    });
}

    private boolean validarSenhaCliente(String usuario, String senha) {
        // Lógica de validação de senha para o cliente
        // Substitua esta lógica pela sua validação real
        if (usuario.equals("cliente") && senha.equals("senha_cliente")) {
            return true;
        }
        return false;
    }

    private boolean validarSenhaColaborador(String usuario, String senha) {
        // Lógica de validação de senha para o colaborador
        // Substitua esta lógica pela sua validação real
        if (usuario.equals("colaborador") && senha.equals("senha_colaborador")) {
            return true;
        }
        return false;
    }

}