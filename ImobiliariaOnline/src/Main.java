import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaDeLogin telaLogin = new TelaDeLogin();
            telaLogin.setVisible(true);

            SwingUtilities.invokeLater(() -> {
                new TelaDoColaborador();
            });
        });
    }
}