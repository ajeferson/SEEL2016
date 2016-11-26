/**
 * Created by ajeferson on 25/11/16.
 */
public class Galinha extends Animal {

    private int ovos;
    static int ovosDaGranja = 0;

    /* Construtores */

    public Galinha(int ovos) {
        this.ovos = ovos;
        ovosDaGranja += this.ovos;
    }

    public Galinha(double peso, int idade, int ovos) {
        super(peso, idade);
        this.ovos = ovos;
        ovosDaGranja += this.ovos;
    }



    // Metodo abstrato sobrescrito
    public void dormir() {
        System.out.println("Galinha dormindo...");
    }

    /* Getters and setters */

    public int getOvos() {
        return ovos;
    }

    public void setOvos(int ovos) {
        this.ovos = ovos;
    }

    public static void metodoEstatico() {
        System.out.println("Eu sou um método estático!");
    }

}
