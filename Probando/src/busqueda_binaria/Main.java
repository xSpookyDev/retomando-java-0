package busqueda_binaria;

public class Main {
    public static void main(String[] args) {

        int[] matrix= {1,2,3,4,5,6,7,8,9,10};

        int resultado = busquedaBinaria(matrix,3);

        if (resultado != -1){
            System.out.println("El elemento se ha encontrado en el indice: "+ resultado);
        }else {
            System.out.println("No se ha encontrado ningun elemento"+ resultado);
        }

    }
    public static int busquedaBinaria(int matriz[], int numeroBuscar){
        int inicio = 0; //el primer elemento de la matriz (indice)
        int fin = matriz.length -1; // el elemento final de la matriz (indice)

        //recorremos la matriz
        while (inicio <= fin){

            int medio = (inicio + fin) / 2;

            if(matriz[medio]== numeroBuscar){
                return medio;
            } else if (matriz[medio]< numeroBuscar) {
                inicio =medio+1;
            }else {
                fin = medio -1;
            }
        }
        return -1;
    }
}
