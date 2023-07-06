import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Metodo Ejercicio 1
    public static double gananciaDiaria(double ventaDiaria, double porcentajeGanancia) {
        return porcentajeGanancia / 100 * ventaDiaria;
    }

    // Metodo Ejercicio 2
    public static String obtenerDescuento(int numeroDeProductos) {
        if (numeroDeProductos <= 10) {
            return "0%";
        } else if (numeroDeProductos <= 20) {
            return "10%";
        } else if (numeroDeProductos <= 30) {
            return "20%";
        } else {
            return "30%";
        }
    }

    // Metodo Ejercicio 3
    public static double numeroMenor() {
        double[] numeros = new double[5];

        System.out.println("Por favor, ingrese 5 numeros separados por un espacio: ");
        String[] strNumeros = new Scanner(System.in).nextLine().split(" ");

        try {
            for (int i = 0; i < 5; i++) {
                numeros[i] = Double.parseDouble(strNumeros[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Solo se permiten caracteres numericos.");
        }

        double min = numeros[0];

        for (double n : numeros) {
            if (n < min) {
                min = n;
            }
        }

        return min;
    }

    // Metodo Ejercicio 4
    public static void harinaDiaria(int numPedidos, double harinaPorPedido) {
        System.out.println(numPedidos * harinaPorPedido + " kg");
        System.out.println("Solo se permiten caracteres numericos.");
    }

    // Metodo Ejercicio 5
    public static void esPrimo(int numero) {
        boolean alerta = true;

        switch (numero) {
            case 1 -> System.out.println("1 no es un numero primo.");
            case 2 -> System.out.println("2 es un numero primo.");
            default -> {
                for (int m = 2; m <= numero / 2; m++) {
                    if (numero % m == 0) {
                        alerta = false;
                        break;
                    }
                }
            }
        }

        if (alerta) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }

    // Metodo Ejercicio 6
    public static void diploma() {
        System.out.println("Por favor, ingrese los datos que se solicitan.");

        System.out.println("Universidad: ");
        String universidad = new Scanner(System.in).nextLine();

        System.out.println("Nombre del alumno: ");
        String alumno = new Scanner(System.in).nextLine();

        System.out.println("Semestre en el que se ubica: ");
        String semestre = new Scanner(System.in).nextLine();

        System.out.println("Carrera: ");
        String carrera = new Scanner(System.in).nextLine();

        System.out.println("Mensaje de estímulo: ");
        StringBuilder mensaje = new StringBuilder();
        while (true) {
            String linea = new Scanner(System.in).nextLine();
            if (linea.equals("")) {
                break;
            }
            mensaje.append(linea).append("\n");
        }

        System.out.println(mensaje);
        System.out.println("La " + universidad + " otorga un reocnocimiento al" +
                "\n esfuerzo y dedicacion al alumno \"" + alumno + "\" " + "quien cursa" +
                "\n el \"" + semestre + "\" " + "de la carrera \"" + carrera + "\".");
    }

    public static void main(String[] args) {

        // 1
        double ganancia = gananciaDiaria(23456.68, 43);
        System.out.println(ganancia);

        // 2
        String descuento = obtenerDescuento(23);
        System.out.println(descuento);

        // 3
        double min = numeroMenor();
        System.out.println(min);

        // 4
        harinaDiaria(17, 2.34);

        // 5
        esPrimo(131);

        // 6
        diploma();
    }

}