package Services;

import Entities.NaveEspacial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Pablo Hernán Gatti
 * Función crearNaveEspacial: Se encarga de la creación de la nave espacial. Sólo se usa heredada
 * Función elegirNaveEspacial: Busca una nave por nombre, se utiliza de manera secundaria
 *
 */

public class NaveEspacialService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public NaveEspacial crearNaveEspacial() {
        String nombre;
        double peso; // en toneladas
        double altura; // en metros
        double empuje; // en toneladas

        System.out.println("Ingrese nombre de la nave:");
        nombre = scanner.next();
        System.out.println("Ingrese el peso (en toneladas):");
        peso = scanner.nextDouble();
        System.out.println("Ingrese la altura (en metros):");
        altura = scanner.nextDouble();
        System.out.println("Ingrese el empuje (en toneladas):");
        empuje = scanner.nextInt();

        return new NaveEspacial(nombre, peso, altura, empuje);

    }

    public String elegirNaveEspacial(ArrayList<NaveEspacial> navesEspaciales, String tipoNave) {
        String nombre;
        NaveEspacial busqueda;
        for (NaveEspacial naves : navesEspaciales) {
            if (naves.getClass().getName().equalsIgnoreCase("Entities." + tipoNave)) {
                System.out.println(naves);
            }
        }
        System.out.println("Ingrese el nombre de la nave:");
        nombre = scanner.next();

        busqueda = navesEspaciales.stream().filter(naveEspacial -> naveEspacial.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);

        if (busqueda == null) {
            System.out.println("La nave no fue encontrada");
            return "no encontrado";

        } else return busqueda.getNombre();
    }
}