public class App {
    public static void main(String[] args) throws Exception {
     int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um número para remover do vetor: ");
     int numeroRemover = scanner.nextInt();
        
     int indice = -1;
     for (int i = 0; i < vetor; i++) {
         if (vetor[i] == numeroRemover) {
             indice = i;
             break;
         }
     }

     if (indice == -1) {
         System.out.println("Número não encontrado no vetor.");
     } else {

         int[] vetor = new int[vetor.length - 1];
         
         for (int i = 0, j = 0; i < vetor.length; i++) {
             if (i != indice) {
                 vetor[j++] = vetor[i];
             }
         }

         System.out.println("Vetor após remoção: " + Arrays.toString(vetorAtualizado));
     }

     scanner.close();
 }
}    
