public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        // Se inicializa el constructor de la superclase con 2 lados
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectángulo: " + super.toString() + "\nLado 1: " + lado1 + "\n Lado 2: " + lado2;
    }

    @Override
    public double mostrarArea() {
        return lado1 * lado2;
    }

}
