package PracticaMetodos;

public class Main {

    public static void main(String[] args) {
        Utilidades utilidades= new Utilidades();

        utilidades.sumar2Numeros(2,4);
        double resultado;

        resultado = Utilidades.sumar2Numeros(2,3);

        System.out.println("La suma de los dos numeros es = "+ utilidades.sumar2Numeros(2,4));
    }
}
