package Ejercicio1Matriz;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int [] matriz = new int[10];

        rellenarMatriz(matriz);
        mostrarMatriz(matriz);


    }

    private static void rellenarMatriz(int[] matriz){
        for (int i = 0; i < matriz.length; i++) {
            String numeroTexto = JOptionPane.showInputDialog("Introduce un numero: ");
            matriz[i] = Integer.parseInt(numeroTexto);
        }
    }

    private static void  mostrarMatriz(int[] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("El indice: "+ i+" contiene el valor: "+ matriz[i]);
        }
    }
}
