public class Papagaio extends Animal implements Voador {
    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Squawk!");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }
}