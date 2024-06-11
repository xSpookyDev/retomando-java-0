package Ejercicio7Matrizx;

public class Main {
    public static void main(String[] args) {

        String[] nombres = {"victor", "Juan", "andrea", "dimitru", "higor", "vladislav"};
        int [] edad = {31,41,12,31,41,14};
        char[] sexo = {'h', 'h','m','h','h','h'};


        System.out.println("Mostrar los datos: ");

        for (int i = 0; i <nombres.length ; i++) {
            System.out.println("nombre: "+ nombres[i]+ " Edad: "+edad[i]+  " sexo: "+ sexo[i]);

        }

    }
}
