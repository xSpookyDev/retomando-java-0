package Ejercicio4Matriz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] matriz = new int[10];

        //rellenar matriz on clase Arrays

        Arrays.fill(matriz, 4,8,7);


        for (int i : matriz)
        System.out.println(""+ i);
    }
}
