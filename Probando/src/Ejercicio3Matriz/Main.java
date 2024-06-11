package Ejercicio3Matriz;

public class Main {
    //a partir de un array de numeros de 5 posiciones con los siguientes valores {1,2,3,4,5} guardar los valores de este array en otro array
    //distinto pero con valores invertidos,
    public static void main(String[] args) {

        int[] matriz1 = {1,2,3,4,5};

        int[] matriz2 = new int[matriz1.length];

        //mostramos la primera matriz

        for (int i : matriz1){
            System.out.println("Matriz1: "+ i);
        }
        int contador =matriz1.length-1;

        for (int i = 0; contador >= 0; i++) {
            matriz2[i]= matriz1[contador];
            contador --;
            System.out.println("Matriz2: "+ matriz2[i]);
        }

    }
}
