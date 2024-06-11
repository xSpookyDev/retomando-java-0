package busqueda_secuencial;

public class Main {
    public static void main(String[] args) {

        int [] matriz = {5,76,3,523,7,12,64,3,1,99};

        String resultado= busquedaSecuencial(matriz,3);
        if (!resultado.equals("-1")){
            System.out.println("Se ha encotrado el elemento en la posicion: "+ resultado);

        }else {
            System.out.println("No se ha encontrado ningun elemento");
        }
    }

   /* private static int busquedaSecuencial(int[] matriz, int numeroBuscar){
        //bucle para recorrer la matriz de principio a fin
        for (int i = 0; i < matriz.length; i++) {
            //buscamos el numer que queremos en la matriz
            if (matriz[i]== numeroBuscar){
                //si encontramos el numero, devolvemos su posicion, el indice
                return i;
            }
        }
        //si no encuentra, devuelve un -1
        return -1;
    }*/

   private static String busquedaSecuencial(int[] matriz, int numeroBuscar){
       String posiciones =""; //almacenamos las posiciones de los elementos que coincidan con la busqueda
       //bucle para recorrer la matriz de principio a fin
       for (int i = 0; i < matriz.length; i++) {
           //buscamos el numer que queremos en la matriz
           if (matriz[i]== numeroBuscar){
               //si encontramos el numero, devolvemos su posicion, el indice
              posiciones += i+ ", ";
           }
       }
       if (!posiciones.equals("")){
           return posiciones;
       }
       //si no encuentra, devuelve un -1
       return "-1";
   }
}
