/**
 * Created by ajeferson on 25/11/16.
 */
// final - proibe herança
public final class Lobo extends Animal {

    public Lobo() {
    }

    public Lobo(double peso, int idade) {
        super(peso, idade);
    }

    public void uivar() {
        System.out.println("Uivando...");
    }

    @Override
    public void mover() {
        System.out.println("Andando...");
    }

    public void dormir() {
        System.out.println("Lobo dormindo...");
    }

}
