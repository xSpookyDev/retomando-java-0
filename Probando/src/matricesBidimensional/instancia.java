package matricesBidimensional;

public class instancia {
    public static void main(String[] args) {

        int [][] listaNumeros = {{1,2,3,4},{1,4,21},{3,41,414,51},{123,412,551}};



        System.out.println("tamanio filas :"+ listaNumeros.length);
        System.out.println("Tamanio  primera columnas :"+ listaNumeros[0].length);
        System.out.println("Tamanio  segunda columnas :"+ listaNumeros[1].length);
        System.out.println("Tamanio  primera columnas :"+ listaNumeros[2].length);


        for (int i = 0; i <listaNumeros.length ; i++) {
            System.out.println(" ");
            for (int j = 0; j <listaNumeros[0].length; j++) {
                System.out.print(listaNumeros[i][j]+ " ");
            }
        }


    }





}
