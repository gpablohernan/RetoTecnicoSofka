package Entities;

public class VehiculoLanzadera extends NaveEspacial {

    private double carga; // en toneladas
    private double potencia; // en caballos

    public VehiculoLanzadera() {
    }

    public VehiculoLanzadera(double carga, double potencia) {
        this.carga = carga;
        this.potencia = potencia;
    }

    public VehiculoLanzadera(String nombre, double peso, double altura, double empuje, double carga, double potencia) {
        super(nombre, peso, altura, empuje);
        this.carga = carga;
        this.potencia = potencia;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "VehiculoLanzadera{" +

                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                ", carga=" + carga + " kilómetros" +
                ", potencia=" + potencia + " caballos" +
                '}';
    }
}
