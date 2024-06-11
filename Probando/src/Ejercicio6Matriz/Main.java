package Ejercicio6Matriz;

public class Main {
    public static void main(String[] args) {

        int[] matriz = {4,5,1,421,41,44,51};
        System.out.println("MAtriz sin ordenar ");
        for (int i : matriz){
            System.out.println(i+ " ");
        }
        System.out.println("");

        ordenarBurbuja(matriz);
        System.out.println("matriz ordenada");

        for (int i: matriz){
            System.out.println(i+ "");
        }
        System.out.println();
    }

    private static void ordenarBurbuja(int[] matriz){
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            //bucle para comparar los valores
            for (int j = 1; j < matriz.length; j++) {
                if (matriz[j] < matriz[j-1]){
                    aux = matriz[j];
                    matriz[j] = matriz[j-1];
                    matriz[j-1]= aux;
                }
            }
        }
    }
}
