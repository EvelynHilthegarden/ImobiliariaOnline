import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Login{
    private List<Colaborador> colaboradoresCadastrados;
    private List<Cliente> clientesCadastrados;
    public Colaborador(String acessoAdm, String chaveDeAcessoColaborador){
        super(acessoAdm, chaveDeAcessoColaborador);
    }

    // Cadastro de alguns colaboradores
    Colaborador colaboradoresCadastrados = new ArrayList<>();
        colaboradoresCadastrados.add(new Colaborador("Colaborador1", "2023001"));
        colaboradoresCadastrados.add(new Colaborador("Colaborador2", "2023002"));


    public void adicionarCliente(){
        clientesCadastrados = new ArrayList<>();

        //Simulando alguns clientes cadastrados
        clientesCadastrados.add(new Cliente("0001/2023", "senha123"));
        clientesCadastrados.add(new Cliente("0002/2023", "abc123"));

    }
    public void selecionarProcesso(){

    }
    public void selecionarEtapaAtual(){

    }
    public void selecionarEtapa(){

    }
    public void adicionarEtapa(){

    }
    public void excluirEtapa(){

    }
    public void criarProcesso(){

    }
    public void excluirProcesso(){

    }
}
