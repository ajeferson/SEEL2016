package estudo;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by GV on 23/11/2016.
 */
public class InputOutput {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        System.out.println("Digite alguma coisa:");
//        String str = s.nextLine();
//        System.out.println("str = " + str);]

//        System.out.println("Digite um numero:");
//        String ss = s.nextLine();
//        int i = Integer.parseInt(ss);
//        System.out.println("i = " + i);

        String ss = JOptionPane.showInputDialog(null, "Digite alguma coisa");
        System.out.println("ss = " + ss);

    }

}
