package estudo;

import java.util.Scanner;

/**
 * Created by ajeferson on 24/11/16.
 */
public class Conditionals {

    public static void main(String[] args) {
        /*
        * if(condition1) {
        * } else if(condition2) {
        * } else {
        * }
        * */

        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String input = s.nextLine(); // Asking user for input
        int number = Integer.parseInt(input); // Converting to int

        if(number < 0) {
            System.out.println("É negativo!");
        } else if(number == 0) {
            System.out.println("Igual a zero!");
        } else {
            System.out.println("É positivo!");
        }

        s.close(); // Closing the scanner

    }

}
