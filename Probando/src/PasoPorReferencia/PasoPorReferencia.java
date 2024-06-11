package PasoPorReferencia;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Galleta galleta = new Galleta();

        galleta.forma = "cuadrada";
        galleta.sabor = "Chocolate";

        System.out.println("Asignamos valor: ");

        galleta.mostrarInformacion();

        cambiarValor(galleta);
    }

    public static void cambiarValor(Galleta galleta){
        System.out.println("Dentro del metodo: ");
        galleta.mostrarInformacion();
        galleta.forma ="redonda";
        galleta.sabor = "Frutilla";

    }
}
