import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaDoCliente extends JFrame {
        private JButton b1 = new JButton("Assinatura do contrato");
        private JButton b2 = new JButton("Pagamento de taxa da Engenharia");
        private JButton b3 = new JButton("Vistoria do Engenheiro");
        private JButton b4 = new JButton("Laudo de Avaliação");
        private JButton b5 = new JButton("Débito do FGTS");
        private JButton b6 = new JButton("Conformidade");
        private JButton b7 = new JButton("Entrega de Chaves");
        private JButton b8 = new JButton("Liberação de Recursos aos Vendedores");
        private JButton b9 = new JButton("Registro do Contrato de Financiamento");
        private JButton b10 = new JButton("Taxa de Registro");
        private JButton b11 = new JButton("Taxa de ITBI");
        private JButton b12 = new JButton("Entrega de Chaves");
        private int headerHeight = 60;

        public TelaDoCliente() {
            setTitle("Processo de Compra de Imóvel");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);


            JPanel headerPanel = new JPanel() {
                @Override
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


            buttonPanel.add(b1);
            buttonPanel.add(b2);
            buttonPanel.add(b3);
            buttonPanel.add(b4);
            buttonPanel.add(b5);
            buttonPanel.add(b6);
            buttonPanel.add(b12);
            buttonPanel.add(b11);
            buttonPanel.add(b10);
            buttonPanel.add(b9);
            buttonPanel.add(b8);
            buttonPanel.add(b7);


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

            //Faixa laranja no topo da tela
            this.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    headerPanel.setPreferredSize(new Dimension(getWidth(), headerHeight));
                    headerPanel.revalidate();
                }
            });


            add(contentPanel);

            pack(); // Ajusta automaticamente o tamanho da janela (fé em deus, mão na bíblia)
            setVisible(true);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new TelaDoCliente();
            });
        }
    }
