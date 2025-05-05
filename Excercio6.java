public class App {
    public static void main(String[] args) throws Exception {
     // Vetor com 10 elementos de exemplo
     int[] vetor = {5, 3, 7, 3, 9, 2, 3, 8, 1, 4};
     Scanner scanner = new Scanner(System.in);

     // Solicitar ao usuário um número para remover
     System.out.print("Digite um número para remover do vetor: ");
     int numeroRemover = scanner.nextInt();

     // Encontrar a primeira ocorrência do número
     int indice = -1;
     for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] == numeroRemover) {
             indice = i;
             break;
         }
     }

     if (indice == -1) {
         System.out.println("Número não encontrado no vetor.");
     } else {
         // Criar um novo vetor com tamanho menor
         int[] vetorAtualizado = new int[vetor.length - 1];

         // Copiar elementos, pulando o elemento a ser removido
         for (int i = 0, j = 0; i < vetor.length; i++) {
             if (i != indice) {
                 vetorAtualizado[j++] = vetor[i];
             }
         }

         // Mostrar o vetor atualizado
         System.out.println("Vetor após remoção: " + Arrays.toString(vetorAtualizado));
     }

     scanner.close();
 }
}    
