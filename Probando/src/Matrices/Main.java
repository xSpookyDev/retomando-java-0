package Matrices;

public class Main {
    public static void main(String[] args) {


        int[] listaNumeros = new int[10];

        listaNumeros[0]= 2;
        listaNumeros[1]= 4;
        listaNumeros[2]= 5;
        listaNumeros[3]=41;
        listaNumeros[4]=10;
        listaNumeros[5]=312;
        listaNumeros[6]=213212;
        listaNumeros[7]= 12;
        listaNumeros[8]=1212;
        listaNumeros[9]=111;


        //System.out.println("el valor es: "+listaNumeros.length);

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("El valor de la lista es : " +listaNumeros[i]);

        }


        int [] amigos = {123,412,41,1,312,412,312,54,1312};

        for (int i = 0; i < amigos.length; i++) {
            System.out.println("Los amigos son: "+ amigos[i]);
        }

        for (int numero: listaNumeros){
            System.out.println("hola" + numero);
        }
    }
}
