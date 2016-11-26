package estudo;

/**
 * Created by GV on 23/11/2016.
 */
public class HelloWorld {

    // This is a comment
    /* I can write here */
    /** This is a  doc comment */
    static void nomeDoMetodo() {
        System.out.println("Runnning method...");
//        This is really helpful
    }

    static void thisIsAMethod() {} // Camel Case like

    public static void main(String[] args) {
        System.out.println("Hey!!");
        nomeDoMetodo();

        int var = 10;
        double t = 1.3;
        char c = 'c';
//        long float byte short
        String s = "This is a string";
        float f = (float) 1.4;
        boolean b = false;
        long l = 1_000_000_000L;

        String ss = "10";
        Integer i = Integer.parseInt(ss);
//        System.out.println("A " + "B");
        System.out.println("i = " + i);

        System.out.println(3 % 2);

        int aa = 10;

        System.out.println(aa++); // pos incremento
        System.out.println(++aa); // pre incremento

        boolean bol = 10 == 11;
        System.out.println("bol = " + bol);

        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!y);

        String g = x ? "X" : "Y";


        int thisIsABigName = 0; // Camel Case pattern
        final int THIS_IS_A_CONSTANT = 10; // Snake upper case

    }

}
