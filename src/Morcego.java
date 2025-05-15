public class Morcego extends Animal implements Voador {
    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Screech!");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando à noite.");
    }
}