import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Pagamento> extrato = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Pagamento no Cartão");
            System.out.println("2. Cadastrar Pagamento no Boleto");
            System.out.println("3. Cadastrar Pagamento via PIX");
            System.out.println("4. Listar todos os pagamentos");
            System.out.println("5. Listar só os reembolsáveis e exibir reembolso");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    double valorCartao = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a data: ");
                    String dataCartao = scanner.nextLine();
                    extrato.add(new PagamentoCartao(valorCartao, dataCartao));
                    break;

                case 2:
                    System.out.print("Digite o valor: ");
                    double valorBoleto = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a data: ");
                    String dataBoleto = scanner.nextLine();
                    extrato.add(new PagamentoBoleto(valorBoleto, dataBoleto));
                    break;

                case 3:
                    System.out.print("Digite o valor: ");
                    double valorPix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a data: ");
                    String dataPix = scanner.nextLine();
                    extrato.add(new PagamentoPix(valorPix, dataPix));
                    break;

                case 4:
                    System.out.println("Listando todos os pagamentos:");
                    for (Pagamento pagamento : extrato) {
                        pagamento.processar();
                    }
                    break;

                case 5:
                    System.out.println("Listando pagamentos reembolsáveis:");
                    for (Pagamento pagamento : extrato) {
                        if (pagamento instanceof Reembolsavel) {
                            Reembolsavel reembolsavel = (Reembolsavel) pagamento;
                            pagamento.processar();
                            System.out.println("Reembolso: R$" + reembolsavel.reembolsar());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanner.close();
    }
}