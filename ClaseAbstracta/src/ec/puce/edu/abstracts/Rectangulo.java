package ec.puce.edu.abstracts;

public class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public String toString() {
        return "Rectangulo con área: " + calcularArea();
    }
}
