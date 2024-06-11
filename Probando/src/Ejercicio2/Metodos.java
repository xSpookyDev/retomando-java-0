package Ejercicio2;

import java.util.Scanner;

public class Metodos {


    public double pedirNumeroDouble() {
        System.out.println("Por favor ingrese el precio del producto");
        Scanner sc = new Scanner(System.in);
        double precioProducto = sc.nextDouble();
        sc.close();  // Cerramos el Scanner después de su uso
        return precioProducto;
    }

    public int pedirNumeroInt() {
        System.out.println("Por favor ingrese la cantidad de productos");
        Scanner sc = new Scanner(System.in);
        int cantidadProducto = sc.nextInt();
        sc.close();  // Cerramos el Scanner después de su uso
        return cantidadProducto;
    }

    public double calcularIva(double precioProducto) {
        double iva = 0.19;
        double ivaCalculado = precioProducto * iva;
        return ivaCalculado;
    }

    public void mostrarEnPantalla() {
        double precio = pedirNumeroDouble();
        double calculo = calcularIva(precio);
        System.out.println("El IVA del precio es: " + calculo+ "ademas el precio total seria:" + (precio-calculo));

    }
}
