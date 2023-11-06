import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Mutantes mut= new Mutantes();
        Mutante2D mut2 = new Mutante2D();

        String[][] dna = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "T", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "T", "A", "T"},
                {"T", "C", "A", "C", "T", "G"}
        };

        String[][] dna2 = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "C", "T", "T", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "T", "A", "T"},
                {"T", "C", "A", "C", "T", "G"}
        };

        int opc = 1;
        while (opc != 0) {
            System.out.println("1 - Ejercicio 1: Test de mutantes \n" +
                    "2 - Ejercicio 2: Buscar coincidencia en nombre y apellido\n"+
                    "3 - Lo mismo que el 1 pero 2D\n" +
                    "0 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ejercicio 1: Test de mutante");
                    mut.determinarMutante(dna);
                    mut.determinarMutante(dna2);
                    break;
                case 2:
                    System.out.println("Ejercicio 2: Buscar coincidencia en nombre y apellido");
                    buscarNombre();
                    break;
                case 3:
                    System.out.println("Lo mismo que el 1 pero con un array\n");
                    mut2.buscarMutante();
                    //Mutante2D.buscarMutante();
                    break;
                case 0:
                    System.out.println("Parando ejecucion...");
                    break;
                default:
                    System.out.println("Opcion no definida, Ingrese otra opcion ");
            }
        }
    }
    public static void buscarNombre(){
        // Crear una matriz de nombres y apellidos
        String[][] matrizNombres = {
                {"Juan", "Perez"},
                {"María", "Lopez"},
                {"Carlos", "González"},
                {"Ana", "Martínez"},
                {"Rayo", "McQueen"},
                {"Sapo", "Pepe"}
        };

        // Pedir al usuario la letra o palabra a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una letra o palabra a buscar: ");
        String busqueda = scanner.next();

        // Llamar a la función para buscar la letra o palabra
        buscarEnMatriz(matrizNombres, busqueda);

    }

    // Función para buscar la letra o palabra en la matriz
    public static void buscarEnMatriz(String[][] matriz, String busqueda) {
        boolean encontrado = false;

        // Recorre la matriz y busca la coincidencia en cada nombre y apellido
        for (String[] nombresApellidos : matriz) {
            for (String nombreApellido : nombresApellidos) {
                if (nombreApellido.toLowerCase().contains(busqueda.toLowerCase())) {
                    System.out.println("Coincidencia encontrada: " + nombreApellido);
                    encontrado = true;
                }
            }
        }
        // Si no se encuentra ninguna coincidencia
        if (!encontrado) {
            System.out.println("No se encontraron coincidencias.");
        }
    }
}