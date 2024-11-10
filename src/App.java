import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        llenarPoligono();
        mostrarDatos();
    }

    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Ingrese el polígono que desee: ");
                System.out.println("1. Triángulo\n2. Rectángulo");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }
            System.out.println("Desea introducir otro polígono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println();
        } while (respuesta == 's' || respuesta == 'S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.println("Ingrese el valor del lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado 2: ");
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado 3: ");
        lado3 = entrada.nextDouble();

        poligonos.add(new Triangulo(lado1, lado2, lado3));
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.println("Ingrese el valor del lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado 2: ");
        lado2 = entrada.nextDouble();

        poligonos.add(new Rectangulo(lado1, lado2));
    }

    public static void mostrarDatos() {
        for (Poligono poligono : poligonos) {
            System.out.println(poligono.toString());
            System.out.println("Área: " + poligono.mostrarArea());
            System.out.println();
        }
    }
}
