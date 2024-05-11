import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public void hashSet() {

        System.out.println("Bienvenidos al party de los super heroes HashSet");

        Set<String> superHeroes = new HashSet<>();
        superHeroes.add("Superman");
        superHeroes.add("Hombre Araña");
        superHeroes.add("Hulk");
        superHeroes.add("Mujer Maravilla");
        superHeroes.add("Ironman");
        superHeroes.add("Ant");
        superHeroes.add("Batichica");
        superHeroes.add("Batichica");
        superHeroes.add("Batichica");

        superHeroes.remove("Ironman");

        if (!superHeroes.contains("Ironman")) {
            System.out.println("Ironman se fue de la fiesta");
        }

        System.out.println("Estos son los "+superHeroes.size()+" Super heroes que quedan en la Fiesta");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }

    }

    public void treeSet() {

        System.out.println("Bienvenidos al party de los super heroes TreeSet");

        Set<String> superHeroes = new TreeSet<>();
        superHeroes.add("Superman");
        superHeroes.add("Hombre Araña");
        superHeroes.add("Hulk");
        superHeroes.add("Mujer Maravilla");
        superHeroes.add("Ironman");
        superHeroes.add("Ant");
        superHeroes.add("Batichica");
        superHeroes.add("Batichica");
        superHeroes.add("Batichica");

        superHeroes.remove("Ironman");

        if (!superHeroes.contains("Ironman")) {
            System.out.println("Ironman se fue de la fiesta");
        }

        System.out.println("Estos son los "+superHeroes.size()+" Super heroes que quedan en la Fiesta");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }

    }

    public void linkedHashSet() {

        System.out.println("Bienvenidos al party de los super heroes LinkedHashSet");

        Set<String> superHeroes = new LinkedHashSet<>();
        superHeroes.add("Superman");
        superHeroes.add("Hombre Araña");
        superHeroes.add("Hulk");
        superHeroes.add("Mujer Maravilla");
        superHeroes.add("Ironman");
        superHeroes.add("Ant");
        superHeroes.add("Batichica");
        superHeroes.add("Batichica");
        superHeroes.add("Batichica");

        superHeroes.remove("Ironman");

        if (!superHeroes.contains("Ironman")) {
            System.out.println("Ironman se fue de la fiesta");
        }

        System.out.println("Estos son los "+superHeroes.size()+" Super heroes que quedan en la Fiesta");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }

    }
}
