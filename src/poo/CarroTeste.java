package poo;

/**
 * Created by ajeferson on 24/11/16.
 */
public class CarroTeste {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.setMarca("Ferrari");
        System.out.println(c.getMarca());
        c.setAno(-111);
        System.out.println(c.getAno());
    }

}
