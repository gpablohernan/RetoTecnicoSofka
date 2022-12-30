package Services;

import Entities.VehiculoLanzadera;
import Entities.NaveEspacial;
import java.util.Scanner;

/**
 * @author Pablo Hernán Gatti
 * Función crearVehiculoLanzadera: Se encarga de la creación del vehículo lanzadera. Hereda de NaveEspacialService
 * Función indexarCargaUtil: Se asigna la carga que llevará la nave entre tres opciones
 * Función cargarCombustible: Se carga la nave con tres opciones distintas de combustible
 */

public class VehiculoLanzaderaService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public VehiculoLanzadera crearVehiculoLanzadera() {
        NaveEspacialService naveEspacial = new NaveEspacialService();
        NaveEspacial naveEspacial1 = naveEspacial.crearNaveEspacial();

        double carga; // en toneladas
        double potencia; // en caballos

        System.out.println("Ingrese la carga (en toneladas):");
        carga = scanner.nextDouble();
        System.out.println("Ingrese la potencia (en caballos):");
        potencia = scanner.nextDouble();

        return new VehiculoLanzadera(naveEspacial1.getNombre(), naveEspacial1.getPeso(), naveEspacial1.getAltura(), naveEspacial1.getEmpuje(), carga, potencia);
    }

    public String indexarCargaUtil() {
        int opcion;
        String cargaUtil = "";
        do {
            System.out.println("Indique la carga que llevará la nave:");
            System.out.println("1 --- Satélite Artificial");
            System.out.println("2 --- Sonda");
            System.out.println("3 --- Nave Tripulada");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion) {
            case 1:
                cargaUtil = "Satélite Artificial";
                break;
            case 2:
                cargaUtil = "Sonda";
                break;
            case 3:
                cargaUtil = "Nave Tripulada";
                break;
        }
        return cargaUtil;

    }

    public String cargarCombustible() {
        int opcion;
        String combustible = "";
        do {
            System.out.println("Indique el combustible que cargará la nave:");
            System.out.println("1 --- Químico sólido");
            System.out.println("2 --- Propelente líquido");
            System.out.println("3 --- Químico sólido y Propelente líquido");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion) {
            case 1:
                combustible = "Químico sólido";
                break;
            case 2:
                combustible = "Propelente líquido";
                break;
            case 3:
                combustible = "Químico sólido y Propelente líquido";
                break;
        }
        return combustible;

    }

}
