import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TelaDoColaborador extends JFrame {

    private Etapas etapas; // Instância da classe Etapas
    private JList<String> listaEtapas; // Lista de etapas
    private JLabel descricaoEtapaLabel; // Descrição da etapa atual

    private int headerHeight = 60;

    public TelaDoColaborador() {
        setTitle("Gestão do Processo de Compra de Imóveis");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        etapas = new Etapas(); // Crie uma instância da classe Etapas

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

        JPanel buttonPanel = new JPanel(new GridLayout(2, 6, 10, 10));

        for (int i = 0; i < etapas.getNumeroDeEtapas(); i++) {
            JButton btn = new JButton("Etapa " + (i + 1));
            btn.setPreferredSize(new Dimension(140, 140));
            btn.setBackground(Color.decode("#5271FF"));
            btn.setForeground(Color.WHITE);
            btn.setFont(btn.getFont().deriveFont(Font.BOLD));
            int finalI = i;
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Atualize a etapa atual para a etapa selecionada
                    etapas.setEtapaAtual("Etapa" + (finalI + 1));
                    // Atualize a descrição da etapa atual
                    descricaoEtapaLabel.setText(etapas.getEtapaAtual());
                }
            });
            buttonPanel.add(btn);
        }

        JPanel topSpacePanel = new JPanel();
        topSpacePanel.setPreferredSize(new Dimension(10, 30));

        JPanel bottomSpacePanel = new JPanel();
        bottomSpacePanel.setPreferredSize(new Dimension(10, 30));

        listaEtapas = new JList<>(etapas.getEtapas().keySet().toArray(new String[0]));
        JScrollPane listaScrollPane = new JScrollPane(listaEtapas);

        descricaoEtapaLabel = new JLabel(etapas.getEtapaAtual());
        JScrollPane descricaoScrollPane = new JScrollPane(descricaoEtapaLabel);

        // Adicione componentes à contentPanel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.add(headerPanel);
        contentPanel.add(topSpacePanel);
        contentPanel.add(titlePanel);
        contentPanel.add(buttonPanel);
        contentPanel.add(listaScrollPane);
        contentPanel.add(descricaoScrollPane);
        contentPanel.add(bottomSpacePanel);

        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                headerPanel.setPreferredSize(new Dimension(getWidth(), headerHeight));
                headerPanel.revalidate();
            }
        });

        add(contentPanel);

        pack();
        setVisible(true);
    }
}
