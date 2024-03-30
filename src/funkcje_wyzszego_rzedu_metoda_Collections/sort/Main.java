package funkcje_wyzszego_rzedu_metoda_Collections.sort;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> lista = new ArrayList<>();
        {
            lista.add("Ewelina");
            lista.add("Stanisław");
            lista.add("Daniel");
            lista.add("Małgorzata");

            System.out.println("Lista przed sortowaniem. ");
            System.out.print(lista);

            Collections.sort(lista, (String a, String b) -> //funkcja wyzszego rzedu
            {
                return a.compareTo(b); //Metoda compareTo() porownuje dwa obiekty
            });

            System.out.println("\nlista po sortowaniu. ");
            System.out.print(lista);

        }
    }
}
