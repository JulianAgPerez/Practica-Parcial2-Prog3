public class Mutantes {

    //String[] dna={"ATGCGA","CAGTGC","TTATGT","AGAAGGG","CCCCTA","TCACTG"};
    //Si hay 4  letras iguales o mas en sucesion es mutante (ya sea oblicua, horizontal o vertical)
public static void determinarMutante(String[][] dna){
    boolean esMutante = isMutant(dna);
        if (esMutante) {
            System.out.println("El ADN pertenece a un mutante.");
        } else {
            System.out.println("El ADN no pertenece a un mutante.");
        }
    }

    public static boolean isMutant(String[][] dna) {
        int n = dna.length; // Tamaño de la matriz nxn

        // Verificar horizontal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 3; j++) {
                if (dna[i][j].equals(dna[i][j + 1]) &&
                        dna[i][j].equals(dna[i][j + 2]) &&
                        dna[i][j].equals(dna[i][j + 3])) {
                    return true; // Mutante encontrado
                }
            }
        }

        // Verificar vertical
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n; j++) {
                if (dna[i][j].equals(dna[i + 1][j]) &&
                        dna[i][j].equals(dna[i + 2][j]) &&
                        dna[i][j].equals(dna[i + 3][j])) {
                    return true; // Mutante encontrado
                }
            }
        }

        // Verificar diagonales principales
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n - 3; j++) {
                if (dna[i][j].equals(dna[i + 1][j + 1]) &&
                        dna[i][j].equals(dna[i + 2][j + 2]) &&
                        dna[i][j].equals(dna[i + 3][j + 3])) {
                    return true; // Mutante encontrado
                }
            }
        }

        // Verificar diagonales secundarias
        for (int i = 0; i < n - 3; i++) {
            for (int j = n - 1; j >= 3; j--) {
                if (dna[i][j].equals(dna[i + 1][j - 1]) &&
                        dna[i][j].equals(dna[i + 2][j - 2]) &&
                        dna[i][j].equals(dna[i + 3][j - 3])) {
                    return true; // Mutante encontrado
                }
            }
        }

        return false; // No se encontraron mutantes
    }
}
