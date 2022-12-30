package Entities;

public class NaveTripulada extends NaveEspacial {

    private double orbita; // en km

    public NaveTripulada() {
    }

    public NaveTripulada(double orbita) {
        this.orbita = orbita;
    }

    public NaveTripulada(String nombre, double peso, double altura, double empuje, double orbita) {
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
        return "NaveTripulada{" +

                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                ", orbita=" + orbita + " kilómetros" +
                '}';
    }
}
