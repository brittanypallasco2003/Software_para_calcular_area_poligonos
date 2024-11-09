import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        llenarPoligono();

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
                // Llenar Triángulo
                case 1:

                    break;
                // Llenar Rectángulo
                case 2:
                    break;
            }
            System.out.println("Desea introducir otro polígono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println();
        } while (respuesta == 's' || respuesta == 'S');
    }
}
