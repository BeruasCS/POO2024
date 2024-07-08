/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1.PasseioCavaloComHeuristica;

/**
 *
 * @author beruas
 */
public class PasseioCavaloComHeuristica {
    int[][] tabuleiro= new int[8][8];
    int[] vertical = {-1,-2,-2,-1,1,2,2,1}; //movimento a ser feito na vertical
    int[] horizontal = {2,1,-1,-2,-2,-1,1,2}; //movimento na horizontal
    int currentColumn; //a coluna em que o cavalo esta no momento
    int currentRow; //a linha que o equino esta no momento 
    int moveNumber; 
    int quantidade; //quantidade de movimentos do nosso cavalo
        private int[][] accessibility = {{2, 3, 4, 4, 4, 4, 3, 2},
                             {3, 4, 6, 6, 6, 6, 4, 3},
                             {4, 6, 8, 8, 8, 8, 6, 4},
                             {4, 6, 8, 8, 8, 8, 6, 4},
                             {4, 6, 8, 8, 8, 8, 6, 4},
                             {4, 6, 8, 8, 8, 8, 6, 4},
                             {3, 4, 6, 6, 6, 6, 4, 3},
                             {2, 3, 4, 4, 4, 4, 3, 2}};
       PasseioCavaloComHeuristica(int valorHorizontal, int valorVertical){
        
            this.currentRow= valorHorizontal;
            this.currentColumn= valorVertical;
            this.tabuleiro[valorHorizontal][valorVertical]=1; 
            this.quantidade=1;
            }
        /*nesse conatrutor, damos a posicao inicial, marcamos como ocupada, e
        contamos um movimento */
        
        private boolean casaDisponivel(int moverPara){ //aqui eu vejo se essa casa n foi utilizada
       
            return(tabuleiro
            [currentRow+horizontal[moverPara]]
            [currentColumn+vertical[moverPara]]==0) ? true: false;
   }
        
        
        private boolean dentroDoTabuleiro(int moverPara){
            int newColumn = currentColumn + vertical[moveNumber];
            int newRow = currentRow + horizontal[moveNumber];

            boolean isColumnValid = newColumn >= 0 && newColumn < 8;
            boolean isRowValid = newRow >= 0 && newRow < 8;

            return isColumnValid && isRowValid;

   }
        
   private void alterarAcessibilidade() {
    for (int j = 0; j < 8; j++) {
        int newColumn = currentColumn + vertical[j];
        int newRow = currentRow + horizontal[j];

        
        if (newColumn >= 0 && newColumn < 8 && newRow >= 0 && newRow < 8)
            accessibility[newRow][newColumn]--;
    }
}
     private void acesso(){
        int proximaLinha = -1;
        int proximaColuna = -1;
        int menorAcessibilidade = Integer.MAX_VALUE;
     

        for (moveNumber = 0; moveNumber < 8; moveNumber++) {
            if (dentroDoTabuleiro(moveNumber) && casaDisponivel(moveNumber)) {
                int novaLinha = currentRow + horizontal[moveNumber];
                int novaColuna = currentColumn + vertical[moveNumber];

                if (accessibility[novaLinha][novaColuna] < menorAcessibilidade) {
                    menorAcessibilidade = accessibility[novaLinha][novaColuna];
                    proximaLinha = novaLinha;
                    proximaColuna = novaColuna;
                }
            }
        }

        if (proximaLinha != -1 && proximaColuna != -1) {
            currentRow = proximaLinha;
            currentColumn = proximaColuna;
            quantidade++;
            tabuleiro[currentRow][currentColumn] = quantidade;
            alterarAcessibilidade();
        }
         
    }
       public void tour() {
        while (quantidade < 64) {
            acesso();
        }
        System.out.println("Total de movimentos: " + quantidade);
        mostrarTabuleiro();
    }

    public void mostrarTabuleiro() {
        // Printa a identificação das colunas
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Printa a identificação das linhas
        for (int i = 0; i < tabuleiro.length; i++) {
            // Print the row header
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
   

}
