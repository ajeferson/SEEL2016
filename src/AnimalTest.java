/**
 * Created by ajeferson on 25/11/16.
 */
public class AnimalTest {

    static void moveAnimal(Animal x) {
        x.mover();
    }

    public static void main(String[] args) {

        // Classe abastrata
//        Animal a = new Animal(60.4, 12);
//        Animal a = new Animal();
//        System.out.println(a.getPeso());
//        System.out.println(a.getIdate());

//        a.andar();
//        a.andar(10);
//        a.mover();

        Lobo l = new Lobo();
        System.out.println(l.getIdate());
        l.uivar();
        l.mover();

        Tubarao t = new Tubarao();
        System.out.println(t.getPeso());
        t.mover();

        System.out.println("Polimorfismo:");
//        moveAnimal(a); // Classe abstrata
        moveAnimal(l);
        moveAnimal(t);

        Galinha g1 = new Galinha(10.3, 1, 400);
        Galinha g2 = new Galinha(8.1, 2, 350);
        System.out.println("Galinha 1 pôs " + g1.getOvos() + " ovos");
        System.out.println("Galinha 2 pôs " + g2.getOvos() + " ovos");
        System.out.println("Ovos da granja: " + Galinha.ovosDaGranja + " ovos");
        Galinha.metodoEstatico();

    }

}
