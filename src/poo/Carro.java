package poo;

/**
 * Created by ajeferson on 24/11/16.
 */
public class Carro {

    private String marca;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    /* Setter */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /* Getter */
    public String getMarca() {
        return marca;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

}
