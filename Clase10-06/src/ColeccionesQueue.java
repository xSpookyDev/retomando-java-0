import java.util.LinkedList;
import java.util.Queue;

public class ColeccionesQueue {
    public static void main(String[] args) {

        Queue continentes = new LinkedList<>();
        continentes.add("Africa");
        continentes.add("America");
        continentes.add("Europa");
        continentes.add("Asia");
        continentes.add("Antartida");

        System.out.println(continentes);
        continentes.remove("Africa");
        System.out.println(continentes);

        continentes.poll();
        System.out.println(continentes);

        System.out.printf("El primero es %s\n", continentes.peek());

        System.out.printf("si utilizamos element %s \n ", continentes.element());



    }
}
