package Entities;

public class NaveNoTripulada extends NaveEspacial {

    private double orbita; // en km

    public NaveNoTripulada() {
    }

    public NaveNoTripulada(double orbita) {
        this.orbita = orbita;
    }

    public NaveNoTripulada(String nombre, double peso, double altura, double empuje, double orbita) {
        super(nombre, peso, altura, empuje);
        this.orbita = orbita;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    @Override
    public String toString() {
        return "NaveNoTripulada{" +

                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                ", orbita=" + orbita + " kilómetros" +
                '}';
    }
}
