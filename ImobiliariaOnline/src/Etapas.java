import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Etapas {
    private Map<String, String> etapas;
    private String etapaAtual;

    public Etapas() {
        etapas = new LinkedHashMap<>();
        etapas.put("Assinatura do Contrato de Promessa de Compra e Venda", "Você assinou o contrato! Este é o momento crucial em que transformamos todas as conversas e acordos em uma formalização sólida. Estamos prontos para oficializar o compromisso que você fez para adquirir o seu novo lar.");
        etapas.put("Tarifa de Avaliação do Bem como Garantia Bancária", "Você receberá o boleto e terá até 2 dias úteis para pagamento. Lembre-se de que, ao pagar pela Caixa, a compensação ocorre em 24 horas; por outro banco, em até 72 horas. Após a compensação, solicitaremos o profissional credenciado.");
        etapas.put("Vistoria realizada pelo Engenheiro credenciado à Caixa", "O engenheiro terá 5 dias úteis para vistoriar o imóvel com o corretor, garantindo sua elegibilidade como garantia para a Caixa Econômica, por meio de uma análise técnica que assegura a adequação para habitação e a ausência de riscos.");
        etapas.put("Laudo de Avaliação do Imóvel", "O engenheiro terá um período de 5 dias úteis, após a vistoria, para registrar o laudo de avaliação no sistema, estabelecendo assim o valor de avaliação como garantia para o Banco.");
        etapas.put("Débito e Liberação do FGTS", "Neste momento, é importante que você siga o passo a passo enviado pelo WhatsApp para solicitar o débito do seu FGTS no aplicativo. Depois disso, vamos esperar pela liberação no sistema da Caixa, que geralmente acontece em até 5 dias úteis.");
        etapas.put("Assinatura dos Formulários da Caixa", "Com seu FGTS liberado, estamos preparando os formulários e entraremos em contato para agendar o melhor horário para a assinatura. Fique tranquilo, estamos muito próximos de concluir tudo!");
        etapas.put("Conformidade", "Agora, o setor de conformidade da Caixa Econômica revisará cuidadosamente a sua documentação, a dos vendedores e a do imóvel, em até 5 dias úteis, para assegurar sua integridade. Caso falte algo, solicitarão os documentos necessários.");
        etapas.put("Assinatura do Contrato de Financiamento", "É o momento tão aguardado para concretizar sua compra! Agora, vamos assinar o seu financiamento, e neste momento, você fará o pagamento das taxas operacionais da Caixa e, se houver, a entrada.");
        etapas.put("Taxa de ITBI (Imposto de Transmissão de Bens Imóveis)", "Neste momento, levamos seu contrato para iniciar o processo de solicitação do ITBI. A prefeitura realizará a avaliação do imóvel e, em breve, disponibilizará a taxa correspondente. Lembre-se do prazo de pagamento de 2 dias úteis.");
        etapas.put("Taxa de Registro do Contrato de Financiamento", "Após a avaliação do ITBI, seu contrato passará por análise cartorial para gerar as taxas pagas pelo Banese, essenciais para registrar seu contrato e garantir a propriedade do imóvel. Não esqueça do prazo de pagamento de 2 dias úteis.");
        etapas.put("Entrega das Chaves do seu Imóvel", "O momento tão esperado chegou! Estamos reunindo todos os documentos de “nada consta” das tarifas do imóvel e, em até 2 dias úteis após o pagamento das taxas de ITBI e registro, marcaremos o horário para a entrega das suas chaves!");
        etapas.put("Registro do Contrato de Financiamento", "Após a compensação das taxas, encaminhamos seu contrato para registro em cartório e você receberá um protocolo com o prazo estimado para a conclusão. Depois desse período, você terá acesso ao contrato registrado e a uma cópia completa da matrícula do imóvel. É essencial guardar esses documentos com segurança, pois comprovam a propriedade do seu imóvel.");

        etapaAtual = "Assinatura do Contrato de Promessa de Compra e Venda"; // Começa na primeira etapa

        // Criação de botões com os nomes das etapas
        for (String nomeEtapa : etapas.keySet()) {
            JButton btn = new JButton(nomeEtapa);
        }
    }

    public Map<String, String> getEtapas() {
        return etapas;
    }

    public String getEtapaAtual() {
        return etapaAtual;
    }

    public void setEtapaAtual(String etapaAtual) {
        this.etapaAtual = etapaAtual;
    }

    public boolean avancarEtapa() {
        int etapaAtualNum = Integer.parseInt(etapaAtual.replace("Etapa", ""));
        if (etapaAtualNum < etapas.size()) {
            etapaAtualNum++;
            etapaAtual = "Etapa" + etapaAtualNum;
            return true;
        }
        return false; // Não é possível avançar mais
    }

    public boolean retrocederEtapa() {
        int etapaAtualNum = Integer.parseInt(etapaAtual.replace("Etapa", ""));
        if (etapaAtualNum > 1) {
            etapaAtualNum--;
            etapaAtual = "Etapa" + etapaAtualNum;
            return true;
        }
        return false; // Não é possível retroceder mais
    }

    public int getNumeroDeEtapas() {
        return etapas.size();
    }
}
