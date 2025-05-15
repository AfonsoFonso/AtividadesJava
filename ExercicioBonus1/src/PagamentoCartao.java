public class PagamentoCartao extends Pagamento implements Reembolsavel {

    public PagamentoCartao(double valor, String data) {
        super(valor, data);
    }

    @Override
    public void processar() {
        System.out.println("Cartão: processando R$" + getValor() + " em " + getData());
    }

    @Override
    public double reembolsar() {
        return getValor() * 0.05;
    }
}