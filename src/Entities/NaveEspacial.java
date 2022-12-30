package Entities;

public class NaveEspacial {

    protected String nombre;
    protected double peso; // en toneladas
    protected double altura; // en metros
    protected double empuje; // en toneladas

    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, double peso, double altura, double empuje) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.empuje = empuje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getEmpuje() {
        return empuje;
    }

    public void setEmpuje(double empuje) {
        this.empuje = empuje;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                '}';
    }
}
