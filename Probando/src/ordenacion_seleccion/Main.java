package ordenacion_seleccion;

public class Main {
    public static void main(String[] args) {

        int[] matriz = {3,4,1,5,2};

        System.out.println("\n matriz sin ordenar");

        for (int elemento: matriz){
            System.out.println("" + elemento);
        }
        System.out.println(" ");



        ordenacionSeleccion(matriz);
        System.out.println("\n matriz ordenada");

        for (int elemento: matriz){
            System.out.println("" + elemento);
        }
        System.out.println(" ");
    }

    private static void ordenacionSeleccion(int[] matriz) {

        //el primer bucle for empieza desde el primer elemento hasta el penultimo elemento
        for (int i = 0; i < matriz.length-1; i++) {
                //este bucle se utiliza para buscar el elemento mas pequeño de la seleccion desordenada
            for (int j = i+1; j < matriz.length; j++) {
                //empieza en i + 1 para poder obtener el valor de la derecha osea el siguiente elemento
                if (matriz[i]>matriz[j]){
                    //si el elemento actual es menor al elemento anterior
                    //se guarda dentro del auxiliar el elemento mas pequeño

                    int aux =matriz[i];

                    //finalmente intercambiamos los valores de sitio
                    matriz[i] = matriz[j];
                    matriz[j ]= aux;
                }
            }
        }
    }
}
