import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class TelaDoCliente extends JFrame {
    JButton b1 = new JButton("Assinatura do contrato");
    JButton b2 = new JButton("Pagamento de taxa da Engenharia");
    JButton b3 = new JButton("Vistoria do Engenheiro");
    JButton b4 = new JButton("Laudo de Avaliação");
    JButton b5 = new JButton("Débito do FGTS");
    JButton b6 = new JButton("Conformidade");
    JButton b7 = new JButton("Entrega de Chaves");
    JButton b8 = new JButton("Liberação de Recursos aos Vendedores");
    JButton b9 = new JButton("Registro do Contrato de Financiamento");
    JButton b10 = new JButton("Taxa de Registro");
    JButton b11 = new JButton("Taxa de ITBI");
    JButton b12 = new JButton("Entrega de Chaves");

    public TelaDoCliente(){

        setLayout(new GridLayout(2,6, 10 ,10));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);

        setTitle("Processo de Compra de Imóvel");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
