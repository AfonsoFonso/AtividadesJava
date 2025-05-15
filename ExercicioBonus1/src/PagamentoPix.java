public class PagamentoPix extends Pagamento implements Reembolsavel {

    public PagamentoPix(double valor, String data) {
        super(valor, data);
    }

    @Override
    public void processar() {
        System.out.println("PIX: processando R$" + getValor() + " em " + getData());
    }

    @Override
    public double reembolsar() {
        return getValor() * 0.02;
    }
}