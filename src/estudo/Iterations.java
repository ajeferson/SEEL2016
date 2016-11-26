package estudo;

/**
 * Created by ajeferson on 24/11/16.
 */
public class Iterations {

    public static void main(String[] args) {

        int[] array = {12, 54, 99, 17, 89, 67, 89};

        // For comum
        for(int i = 0; i < array.length; i++) { // i = 0, 1, 2, 3 ... array.length
            System.out.println(array[i]);
        }


        // Foreach
        for(int k : array) {
            System.out.println("k = " + k);
        }

        // While
        int c = 10;
        while(c > 0) {
            System.out.println("c = " + c);
            c--;
        }

        // Do while
        int d = 1;
        do {
            System.out.println("d = " + d);
            d++;
        } while(d < 10);

    }

}
