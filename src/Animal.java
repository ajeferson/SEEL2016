/**
 * Created by ajeferson on 25/11/16.
 */
public abstract class Animal {

    private double peso;
    private int idade;

    /* nomeDaClasse(params) */
    /* tipoRetorno nomeDometoo(params) {} */

    /* Construtores */

    public Animal(double peso, int idade) {
        this.peso = peso;
        this.idade = idade;
    }

    public Animal() {}


    /*
    * Youtube - Java Universidade XTI;
    * Facebook: Alan Jeferson
    * Email: alan.jeferson11@gmail.com
    * */

    /* Getters and setters */

    public int getIdate() {
        return this.idade;
    }

    public void setIdate(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mover() {
        System.out.println("Movendo...");
    }

    public void andar() {
        System.out.println("Andando indefinidamente...");
    }

    public void andar(int metros) {
        System.out.println("Andando " + metros + " metros...");
    }

    // Abstrac - obriga as classes filhas a implementarem
    public abstract void dormir();

    // final - impede a sobrescrita de método
    public final void respirar() {
        System.out.println("Respirando...");
    }

}
