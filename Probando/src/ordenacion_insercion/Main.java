package ordenacion_insercion;

public class Main {
    public static void main(String[] args) {

        int [] matriz = {5,3,4,1 ,4,2};

        System.out.println("\nMatriz sin ordenar : ");
        for (int i : matriz){
            System.out.print(" "+ i);
        }
        System.out.println(" ");

        ordenacionInsercion(matriz);

        System.out.println("\nMatriz ordenada : ");
        for (int i : matriz){
            System.out.print(" "+ i);
        }
    }

    private static void ordenacionInsercion(int[] matriz) {
        //bucle para las pasadas
        // empezamos en j - 1, ya que el primer elemento se considera por defecto

        for (int i = 1; i < matriz.length ; i++) {

            //el elemento no clasificado se guarda en la variable, es decir la valor de elemento actual
            int aux = matriz[i];

            int j =  i-1; //obtenemos el valor de i, y le restanos 1 para obtener la posicion anterior del bucle

            //bucle while, se encarga de desplazar los elementos de la seleccion ordenada que son mayores que el elemento seleccionado(variable aux)
            while ((j>-1)&&(matriz[j]> aux)){
                //si la posicion actual es mayor que -1
                //y si el numero de la matriz en la posicion j es que sea mayor que el elemento sin clasificar de la variable aux
                matriz[j+1] = matriz[j];
                //indicamos otra vez la posicion actual (matriz [j + 1]
                j--;

            }
            matriz[j+1] = aux; //restamos -1 al j para volver a la posicion anterior
            //asignamos el valor actual, en la siguiente posicion de la matriz

            j--;//restamos -1 al j para volver a la posicion anterior
            System.out.println("matriz ordanada parcialmente");
            for (int elemento : matriz){
                System.out.print(" "+ elemento);
        }
            System.out.println(" ");

    }

}}
