import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class TelaDoColaborador extends JFrame {

    private JButton avancarButton;
    private JButton retrocederButton;
    private JButton adicionarEtapaButton;
    private JTextField novaEtapaTextField;

    private int headerHeight = 60;

    public TelaDoColaborador() {
        setTitle("Gestão do Processo de Compra de Imóveis");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel headerPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.decode("#FF8210"));
                g.fillRect(0, 0, getWidth(), headerHeight);
            }
        };
        headerPanel.setPreferredSize(new Dimension(getWidth(), headerHeight));


        JLabel titleLabel = new JLabel("0001 - Ecoville Park");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(Color.BLACK); // Cor preta
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(titleLabel);

        //Ajuste da fileira dos botões
        JPanel buttonPanel = new JPanel(new GridLayout(2, 6, 10, 10));



        for (Component button : buttonPanel.getComponents()) {
            if (button instanceof JButton) {
                JButton btn = (JButton) button;
                btn.setPreferredSize(new Dimension(140, 140));
                btn.setBackground(Color.decode("#5271FF"));
                btn.setForeground(Color.WHITE);
                btn.setFont(btn.getFont().deriveFont(Font.BOLD));
            }
        }
        //Espaço para centralizar o layout no meio
        JPanel topSpacePanel = new JPanel();
        topSpacePanel.setPreferredSize(new Dimension(10, 30)); // Espaço de 30 pixels na parte superior

        JPanel bottomSpacePanel = new JPanel();
        bottomSpacePanel.setPreferredSize(new Dimension(10, 30)); // Espaço de 30 pixels na parte inferior

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.add(headerPanel); // Adicione a barra laranja no topo
        contentPanel.add(topSpacePanel);
        contentPanel.add(titlePanel); // Adicione o título centralizado
        contentPanel.add(buttonPanel);
        contentPanel.add(bottomSpacePanel);

        //Ajuste da faixa laranja no topo da tela
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {headerPanel.setPreferredSize(new Dimension(getWidth(), headerHeight));
                headerPanel.revalidate();
            }
        });


        add(contentPanel);

        pack(); // Ajusta automaticamente o tamanho da janela (fé em deus, mão na bíblia)
        setVisible(true);
    }
}
