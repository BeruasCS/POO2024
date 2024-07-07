/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1;

/**
 *
 * @author beruas
 */
public class PasseioCavaloSemHeuristica {
    
    int currentColumn; //a coluna em que o cavalo esta no momento
    int currentRow; //a linha que o equino esta no momento 
    int moveNumber; 
    int quantidade; //quantidade de movimentos do nosso cavalo
    int[] vertical = {-1,-2,-2,-1,1,2,2,1}; //movimento a ser feito na vertical
    int[] horizontal = {2,1,-1,-2,-2,-1,1,2}; //movimento na horizontal
    int[][] tabuleiro= new int[8][8]; //o tabuleiro, onde 0= livre, 1= ocupada
 /*moveNumber sera o indice do for, e ele indicara  qual posicao do
 array vertical ou horizontal escolheremos, e nseesaposicao temos o 
 movimento que faremos*/
    
    
    PasseioCavaloSemHeuristica(int valorHorizontal, int valorVertical){
        
        this.currentRow= valorHorizontal;
        this.currentColumn= valorVertical;
        this.tabuleiro[valorHorizontal][valorVertical]=1; 
        this.quantidade=1;
        
        /*nesse conatrutor, damos a posicao inicial, marcamos como ocupada, e
        contamos um movimento */
    }
 
    
   private boolean casaDisponivel(int moverPara){ //aqui eu vejo se essa casa n foi utilizada
       
       return(tabuleiro
/*Linha*/     [currentRow+horizontal[moverPara]]
/*Coluna*/    [currentColumn+vertical[moverPara]]==0) ? true: false;
   }
   
   private boolean dentroDoTabuleiro(int moverPara){
        int newColumn = currentColumn + vertical[moveNumber];
        int newRow = currentRow + horizontal[moveNumber];

        boolean isColumnValid = newColumn >= 0 && newColumn < 8;
        boolean isRowValid = newRow >= 0 && newRow < 8;

        return isColumnValid && isRowValid;

   }
   
   public void tour(){
       for(moveNumber =0; moveNumber<8; moveNumber++){
          if(dentroDoTabuleiro(moveNumber)){
              if(casaDisponivel(moveNumber)){
                currentRow += horizontal[moveNumber]; 
                currentColumn += vertical[moveNumber]; 
                quantidade = quantidade+1;                         
                tabuleiro[currentRow][currentColumn] = quantidade;
                moveNumber = 0; 
                /*se o movimento foi feito, ele vai zerar o 
                moveNumber, pois fizemos o movimento, caso ele nao tenha sido
                feito, o for vai rodar e vamos tentar outros movimentos e assim
                em diante*/

            }
        }   
    }
       System.out.println(quantidade);
       printTabuleiro();
       
}
    public void printTabuleiro() {
        // Print the column headers
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print the board with row headers
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