import java.util.List;
import java.util.ArrayList;
public class Colaborador extends Login {
    private List<Colaborador> colaboradoresCadastrados;
    private List<Cliente> clientesCadastrados;


    public Colaborador(String acessoAdm, String chaveDeAcessoColaborador) {
        super(acessoAdm, chaveDeAcessoColaborador);

        colaboradoresCadastrados = new ArrayList<>();

        // Adicionando colaboradores à lista
        colaboradoresCadastrados.add(new Colaborador("Colaborador1", "2023001"));
        colaboradoresCadastrados.add(new Colaborador("Colaborador2", "2023002"));
    }

    public void adicionarCliente() {
        clientesCadastrados = new ArrayList<>();

        // Simulando alguns clientes cadastrados
        clientesCadastrados.add(new Cliente("0001/2023", "senha123"));
        clientesCadastrados.add(new Cliente("0002/2023", "abc123"));
    }

    public void selecionarProcesso() {
        // Implemente o código para selecionar um processo
    }

    public void selecionarEtapaAtual() {
        // Implemente o código para selecionar a etapa atual
    }

    public void selecionarEtapa() {
        // Implemente o código para selecionar uma etapa
    }

    public void adicionarEtapa() {
        // Implemente o código
    }
}
