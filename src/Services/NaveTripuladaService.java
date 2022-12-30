package Services;

import Entities.NaveTripulada;
import Entities.NaveNoTripulada;

import java.util.Scanner;

/**
 * @author Pablo Hernán Gatti
 * Función crearNaveTripulada: Se encarga de la creación de la nave espacial tripulada. Hereda de NaveEspacialService y de NaveEspacialNoTipulada
 * Función ingresarTripulacion: Se ingresa la capacidad de tripulantes a la nave espacial tripulada
 * Función ingresarTareasDeTripulacion: Se asigna una mision a los tripulantes de la nave espacial tripulada
 */

public class NaveTripuladaService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public NaveTripulada crearNaveTripulada(){
        NaveNoTripuladaService naveEspacialNT = new NaveNoTripuladaService();
        NaveNoTripulada naveEspacialNT1 = naveEspacialNT.crearNaveNoTripulada();

        return new NaveTripulada(naveEspacialNT1.getNombre(), naveEspacialNT1.getPeso(), naveEspacialNT1.getAltura(), naveEspacialNT1.getEmpuje(), naveEspacialNT1.getOrbita());
    }

    /* Esta función podría haberse combinado con la creación de la nave para también diferenciarse de la nave no tripulada,
       pero el enunciado decía que por cada nave había que tener dos funciones, por eso se creo aparte
    * */
    public int ingresarTripulacion(){
        int tripulacion;

        System.out.println("Indique la cantidad de tripulación de la nave:");
        tripulacion=scanner.nextInt();
        return tripulacion;

    }

    public String ingresarTareasDeTripulacion(){
        int opcion;
        String tareaTripulacion = "";
        do {
            System.out.println("Indique la tarea de la tripulación:");
            System.out.println("1 --- Reparación");
            System.out.println("2 --- Mantenimiento");
            System.out.println("3 --- Investigación");

            opcion=scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion){
            case 1:
                tareaTripulacion = "Reparación";
                break;
            case 2:
                tareaTripulacion = "Mantenimiento";
                break;
            case 3:
                tareaTripulacion = "Investigación";
                break;

        }
        return tareaTripulacion;

    }
}
