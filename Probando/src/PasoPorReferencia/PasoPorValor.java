package PasoPorReferencia;

public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = "+ x);

        cambiarValor(x);

        System.out.println("X despues de cambiar valor: "+ x);
    }

    public static void cambiarValor(int x){
        System.out.println("Valor del parametro: "+ x);

        x= 20;

        System.out.println("Valor despues de modificar x: "+ x);

    }
}
