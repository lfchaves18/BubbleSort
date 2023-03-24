public class Main {

    public static void main(String[] args) {

        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};

        ordenarVetor(vetor); // ordena o vetor usando o Bubble Sort

        System.out.println("Vetor ordenado:");
        exibirVetor(vetor);
    }

    // função que ordena o vetor usando o Bubble Sort
    public static void ordenarVetor(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }

    // função que exibe o vetor na tela
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}