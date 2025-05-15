public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor, String data) {
        super(valor, data);
    }

    @Override
    public void processar() {
        System.out.println("Boleto: processando R$" + getValor() + " em " + getData());
    }
}