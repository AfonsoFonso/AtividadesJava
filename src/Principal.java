import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private List<Animal> zoologico;
    private Scanner entrada;

    public Principal() {
        zoologico = new ArrayList<>();
        entrada = new Scanner(System.in);
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cachorro");
            System.out.println("2. Cadastrar Papagaio");
            System.out.println("3. Cadastrar Morcego");
            System.out.println("4. Listar todos os animais");
            System.out.println("5. Listar animais voadores");
            System.out.println("6. Listar animais não voadores");
            System.out.println("7. Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCachorro();
                    break;
                case 2:
                    cadastrarPapagaio();
                    break;
                case 3:
                    cadastrarMorcego();
                    break;
                case 4:
                    listarTodosAnimais();
                    break;
                case 5:
                    listarAnimaisVoadores();
                    break;
                case 6:
                    listarAnimaisNaoVoadores();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    private void cadastrarCachorro() {
        System.out.print("Digite o nome do cachorro: ");
        String nome = entrada.nextLine();
        Animal cachorro = new Cachorro(nome);
        zoologico.add(cachorro);
        System.out.println(nome + " foi registrado como Cachorro.");
    }

    private void cadastrarPapagaio() {
        System.out.print("Digite o nome do papagaio: ");
        String nome = entrada.nextLine();
        Animal papagaio = new Papagaio(nome);
        zoologico.add(papagaio);
        System.out.println(nome + " foi registrado como Papagaio.");
    }

    private void cadastrarMorcego() {
        System.out.print("Digite o nome do morcego: ");
        String nome = entrada.nextLine();
        Animal morcego = new Morcego(nome);
        zoologico.add(morcego);
        System.out.println(nome + " foi registrado como Morcego.");
    }

    private void listarTodosAnimais() {
        System.out.println("Todos os Animais:");
        for (Animal animal : zoologico) {
            animal.emitirSom();
        }
    }

    private void listarAnimaisVoadores() {
        System.out.println("Animais Voadores:");
        for (Animal animal : zoologico) {
            if (animal instanceof Voador) {
                ((Voador) animal).voar();
            }
        }
    }

    private void listarAnimaisNaoVoadores() {
        System.out.println("Animais Não Voadores:");
        for (Animal animal : zoologico) {
            if (!(animal instanceof Voador)) {
                animal.emitirSom();
            }
        }
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.menu();
    }
}