package Services;

import Entities.NaveNoTripulada;
import Entities.NaveEspacial;
import java.util.Scanner;

/**
 * @author Pablo Hernán Gatti
 * Función crearNaveNoTripulada: Se encarga de la creación de la nave espacial no tripulada. Hereda de NaveEspacialService
 * Función asignarTarea: Asigna una tarea a la nave espacial no tripulada, eligiendo sobre tres opciones
 * Función estudiarCuerpoCeleste: La nave espacial no tripulada estudia un cuerpo celeste entre 17 opciones
 */

public class NaveNoTripuladaService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public NaveNoTripulada crearNaveNoTripulada(){
        double orbita;

        NaveEspacialService naveEspacial = new NaveEspacialService();
        NaveEspacial naveEspacial1 = naveEspacial.crearNaveEspacial();

        System.out.println("Ingrese la orbita (en kilómetros):");
        orbita = scanner.nextDouble();

        return new NaveNoTripulada(naveEspacial1.getNombre(), naveEspacial1.getPeso(), naveEspacial1.getAltura(), naveEspacial1.getEmpuje(), orbita);
    }


    public String asignarTarea(){
        int opcion;
        String tarea = "";
        do {
            System.out.println("Indique la tarea que realizará la nave:");
            System.out.println("1 --- Abastecer a la EEI");
            System.out.println("2 --- Limpiar la EEI");
            System.out.println("3 --- Regular la elevación de la EEI");
            opcion=scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion){
            case 1:
                tarea = "Abastecer a la EEI";
                break;
            case 2:
                tarea = "Limpiar la EEI";
                break;
            case 3:
                tarea = "Regular la elevación de la EEI";
                break;
        }
        return tarea;

    }

    public String estudiarCuerpoCeleste(){
        int opcion;
        String cuerpoCeleste = "";
        do {
            System.out.println("Indique el cuerpo celeste a estudiar:");
            System.out.println("1 --- Sol");
            System.out.println("2 --- Luna");
            System.out.println("3 --- Mercurio");
            System.out.println("4 --- Venus");
            System.out.println("5 --- Tierra");
            System.out.println("6 --- Marte");
            System.out.println("7 --- Ceres");
            System.out.println("8 --- Júpiter");
            System.out.println("9 --- Saturno");
            System.out.println("10 --- Neptuno");
            System.out.println("11 --- Urano");
            System.out.println("12 --- Plutón");
            System.out.println("13 --- Haumea");
            System.out.println("14 --- Makemake");
            System.out.println("15 --- Eris");
            System.out.println("16 --- Sedna");
            System.out.println("17 --- Phattie");

            opcion=scanner.nextInt();
        } while (opcion < 1 || opcion > 17);
        switch (opcion){
            case 1:
                cuerpoCeleste = "Sol";
                break;
            case 2:
                cuerpoCeleste = "Luna";
                break;
            case 3:
                cuerpoCeleste = "Mercurio";
                break;
            case 4:
                cuerpoCeleste = "Venus";
                break;
            case 5:
                cuerpoCeleste = "Tierra";
                break;
            case 6:
                cuerpoCeleste = "Marte";
                break;
            case 7:
                cuerpoCeleste = "Ceres";
                break;
            case 8:
                cuerpoCeleste = "Júpiter";
                break;
            case 9:
                cuerpoCeleste = "Saturno";
                break;
            case 10:
                cuerpoCeleste = "Neptuno";
                break;
            case 11:
                cuerpoCeleste = "Urano";
                break;
            case 12:
                cuerpoCeleste = "Plutón";
                break;
            case 13:
                cuerpoCeleste = "Haumea";
                break;
            case 14:
                cuerpoCeleste = "Makemake";
                break;
            case 15:
                cuerpoCeleste = "Eris";
                break;
            case 16:
                cuerpoCeleste = "Sedna";
                break;
            case 17:
                cuerpoCeleste = "Phattie";
                break;
        }
        return cuerpoCeleste;

    }
}
