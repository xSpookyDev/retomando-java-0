package Ejercicio5Matriz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] matriz = new int[10];

        //rellenamos matriz
        Arrays.fill(matriz, 9);

        //copiamos la matriz en otra
        int[] matriz2 = Arrays.copyOfRange(matriz,3,8);

        for (int i : matriz2){
            System.out.println("");
        }
    }
}
