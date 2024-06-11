package clase29;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Santiago");
        ciudades.add("Iquique");
        ciudades.add("Arica");
        ciudades.add("Concepción");
        ciudades.add("La Serena");
        ciudades.add("Puerto Montt");

        ArrayList<String> otrasCiudades = new ArrayList<>();

        otrasCiudades.add("Rancagua");
        otrasCiudades.add("Punta Arenas");
        ciudades.addAll(otrasCiudades);
        System.out.print(ciudades+ "\n");
        ciudades.remove("Rancagua");
        ciudades.remove(3);
        System.out.println(ciudades);
        ciudades.set(5, "talca");
        System.out.println(ciudades);

        System.out.println(ciudades.size());

        System.out.println(ciudades.indexOf("Santiago"));
    }

}
