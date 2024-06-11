package OrdenacionBurbuja;

public class Main {
    public static void main(String[] args) {



    int matriz[] ={26,50,7,9,15,27};

        System.out.println("\n Matriz sin ordenar: ");

        for (int matrizActual: matriz){
            System.out.print(" "+matrizActual);
        }

        burbuja(matriz);

        System.out.println("\n Matriz ordenada: ");

        for (int matrizActual: matriz){
            System.out.print(" "+matrizActual);
        }
    }




    public static void burbuja(int[] matriz){

        int aux;

        String pasada= " ";

        //Primer bucle para las pasadas
        for (int i = 0; i <matriz.length ; i++) {
            //segundo bucle para comparar los valores
            //(calor / posicion actual) con el valor o la posicion de la derecha

            //empezamos j = 1; para que este en el lugar de la derecha para comparar con el actual
            for (int j = 1; j < matriz.length; j++) {
                //hacemos la comparacion si el de la derecha es menor que el actual (j-1)
                if (matriz[j]< matriz[j-1]){
                    aux = matriz[j]; // le asignamos el valor de la derecha a la auxiliar
                    matriz[j] = matriz[j-1];// asignamos el valor de la izquierda a la posicion de la derecha
                   matriz[j-1]= aux; //le asignamos el valor de la auxiliar al de la izquierda

                        //esto es opcional, es para que se vean las pasadas y la ordenacion
                    System.out.println("Matriz[j]"+ matriz[j]+ " matriz [j-1]= "+ matriz[j-1] + " aux= " +aux);

                    for (int k = 0; k <matriz.length; k++) {
                        pasada += " "+ Integer.toString(matriz[k]);
                    }

                    System.out.println("Matriz matriz = {"+ pasada+ "} ");
                    pasada = "";
                }
            }
        }
    }
}
