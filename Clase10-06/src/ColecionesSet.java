import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColecionesSet {
    public static void main(String[] args) {

        Set<String> languagues = new HashSet<>();

        languagues.add("Java");
        languagues.add("C#");
        languagues.add("Kotlin");
        languagues.add("Python");
        languagues.add("javaSricpt");
        languagues.add("Golang");
        languagues.add("Golang");

        System.out.println(languagues);


        Set<String> programmers = new LinkedHashSet<>();

        programmers.add("Ricardo Montecinos");
        programmers.add("Larry wall");
        programmers.add("Juan pedri");
        programmers.add("James gosling");
        programmers.add("Rich Hickey");
        programmers.add("Graydon Haore");

        System.out.println(programmers);


        Set<String> capitals = new TreeSet<>();
        capitals.add("Santiago");
        capitals.add("Buenos aires");
        capitals.add("Brazilia");
        capitals.add("Asuncion");
        capitals.add("Lima");

        System.out.println(capitals);

        Set<String> capitales2 =new HashSet<>();

        capitales2.add("Caracas");
        capitales2.add("Bogota");
        capitales2.add("Quito");
        capitals.add("Montevideo");
    capitals.add("Sucre");

    Set<String>capitalesUnidas= new TreeSet<>(capitals);
    capitalesUnidas.addAll(capitales2);
        System.out.println(capitalesUnidas);


        Set<String> removerCapitales = new TreeSet<>(capitalesUnidas);
        removerCapitales.removeAll(capitals);
        System.out.println(removerCapitales);


        Set<String> interseccionDeCapitales= new HashSet<>(capitalesUnidas);
        interseccionDeCapitales.retainAll(capitales2);
        System.out.println(interseccionDeCapitales);




    }
}