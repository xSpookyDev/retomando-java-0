package ejercicio2Matriz;

public class Main {
    //crea un array de numeros de 100 posiciones, que contrndra los numeros del 1 al 100.
//obtener la suma de todos los numeros del array y obtener tambien la media

    public static void main(String[] args) {

        int[] matriz = new int[100];

        int suma = 0;
        double media = 0;

        for (int i = 0; i < matriz.length; i++) {
            matriz[i]= i+1;

            suma = suma+ matriz[i]; //calculamos la suma

        }

        //calculo de la media  y la suma
        System.out.println("La suma es: "+ suma);

        media = suma / matriz.length;

        System.out.println("La media es: "+ media);
    }
}