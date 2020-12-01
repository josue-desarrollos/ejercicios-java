package ACTIVID13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Activi13 {

    static List<String> Lis = new ArrayList();
    public static void main(String[] args) {
        Lis.add("Andres");
        Lis.add("Eric");
        Lis.add("Marc");
        Lis.add("Ivan");
        Lis.add("Saul");
        Lis.add("Marcos");
        Lis.add("Leslie");
        Lis.add("Luis");
        Lis.add("Armando");
        Lis.add("Ernesto");
        Lis.add("Enrique");
        System.out.println ("\n Lista de estudiantes:" + Lis );
        Collections.sort(Lis);
        System.out.println("\n En Orden alfabetico con sort:" +Lis);
        Lis.sort(Comparator.comparingInt(String::length));
        System.out.println("\n En Orden por longitud con lamda:" +Lis);
        Lis.sort((String p1 ,String p2) -> p1.compareTo(p2));
        System.out.println("\n En Orden alfabetico con lamda:" +Lis);
        Lis.sort((p1, p2) -> {
            byte result;
            if (p1.length() > p2.length()) {
                result = 1;
            } else if (p1.length() < p2.length()) {
                result = -1;
            } else {
                result = 0;
            }
            return 0;
        });
        System.out.println("\n En Orden alfabetico con referencia:" +Lis);
    }
}
