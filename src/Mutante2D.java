public class Mutante2D {
    public static void buscarMutante(){
        String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        String[] dna2 = {
                "AGCTAA",
                "CTAGAG",
                "GTAGGT",
                "TGGGAT",
                "TCCCTA",
                "CGCGCG"
        };
        msj(dna);
        msj(dna2);
    }
    public static void msj(String[] dna){
        if(isMutant(dna)){
            System.out.println("Encontre un mutancito");
        }else{
            System.out.println("Magneto va a hacer un genocidio");
        }
    }

    public static boolean isMutant(String[] dna) {
        int n = dna.length; // Tamaño de la matriz nxn
        int count = 0; // Contador de secuencias mutantes

        // Verificar horizontal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 3; j++) {
                if (dna[i].charAt(j) == dna[i].charAt(j + 1) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 2) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 3)) {
                    count++;
                }
            }
        }

        // Verificar vertical
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n; j++) {
                if (dna[i].charAt(j) == dna[i + 1].charAt(j) &&
                        dna[i].charAt(j) == dna[i + 2].charAt(j) &&
                        dna[i].charAt(j) == dna[i + 3].charAt(j)) {
                    count++;
                }
            }
        }

        // Verificar diagonales principales
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n - 3; j++) {
                if (dna[i].charAt(j) == dna[i + 1].charAt(j + 1) &&
                        dna[i].charAt(j) == dna[i + 2].charAt(j + 2) &&
                        dna[i].charAt(j) == dna[i + 3].charAt(j + 3)) {
                    count++;
                }
            }
        }

        // Verificar diagonales secundarias
        for (int i = 0; i < n - 3; i++) {
            for (int j = n - 1; j >= 3; j--) {
                if (dna[i].charAt(j) == dna[i + 1].charAt(j - 1) &&
                        dna[i].charAt(j) == dna[i + 2].charAt(j - 2) &&
                        dna[i].charAt(j) == dna[i + 3].charAt(j - 3)) {
                    count++;
                }
            }
        }

        // Si se encuentran al menos dos secuencias mutantes, retorna true
        return count >= 2;
    }

}
