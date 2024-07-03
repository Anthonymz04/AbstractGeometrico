package ec.puce.edu.abstracts;

public abstract class FiguraGeometrica {

    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método para comparar áreas
    public boolean mayorQue(FiguraGeometrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    // Método toString para representar la figura como cadena
    @Override
    public String toString() {
        return "FiguraGeometrica con área: " + calcularArea();
    }

    // Método main para probar las funcionalidades
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3, 8);
        Triangulo triangulo = new Triangulo(4, 7);
        Circulo circulo = new Circulo(6);

        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

        System.out.println("¿El rectángulo es mayor que el triángulo? " + (rectangulo.mayorQue(triangulo) ? "verdadero" : "falso"));
        System.out.println("¿El círculo es mayor que el rectángulo? " + (circulo.mayorQue(rectangulo) ? "verdadero" : "falso"));
    }
}
