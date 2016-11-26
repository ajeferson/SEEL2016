package estudo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ajeferson on 24/11/16.
 */
public class Vectors {

    public static void main(String[] args) {

        // 1 98 32 32 9
        int[] nome = new int[5]; // Arrays são indexados em 0
        nome[0] = 98;
        nome[1] = 11;
        nome[2] = 131;
        nome[3] = 141;
        nome[4] = 1189;
        System.out.println(nome[1]);
        System.out.println("Tamanho do vetor: " + nome.length);
        System.out.println(Arrays.toString(nome));

//        Arrays.sort // Ordena o array
//        Arrays.binarySearch // Procura um elemento dentro do array

        int[] vetor = {1, 4, 78, 10, 40};
        System.out.println(vetor[1]);  // Printa o 4

        // Formas de declaração de vetores
        int[] dec0;
        int [] dec1;
        int []dec2;
        int dec3[];

        ArrayList<String> strs = new ArrayList<>();
        strs.add("A");
        strs.add("B");
        System.out.println("strs = " + strs);
        System.out.println(strs.get(0)); // Pega um elemento em específico
        strs.clear(); // Apaga todos os elementos
        System.out.println(strs); // Arraylist deve estar vazio



    }

}
