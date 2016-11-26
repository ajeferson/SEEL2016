package estudo;

/**
 * Created by ajeferson on 24/11/16.
 */
public class SwitchCase {

    public static void main(String[] args) {

        /*
        * switch(variavel) {
        * case conditional:
        * break;
        * }
        * default:
        * break;
        * */

        int a = 10;

        switch (a) {
            case 10:
                System.out.println("Igual a 10");
                break;
            case 20:
                System.out.println("Igual a 20");
                break;
            default:
                System.out.println("Nada dos anteriores");
                break;
        }

    }

}
