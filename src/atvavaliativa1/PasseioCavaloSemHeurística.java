/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1;

/**
 *
 * @author beruas
 */
public class PasseioCavaloSemHeurística {
    
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
    
    
    PasseioCavaloSemHeurística(int valorHorizontal, int valorVertical){
        
        this.currentRow= valorHorizontal;
        this.currentColumn= valorVertical;
        this.tabuleiro[valorHorizontal][valorVertical]=1; 
        this.quantidade=1;
        
        /*nesse conatrutor, damos a posicao inicial, marcamos como ocupada, e
        contamos um movimento */
    }
    /*se chama tour pois o problema do passeio do cavalo e conhecido como 
    the knights tour
    */
   private boolean casaDisponivel(int moverPara){ //aqui eu vejo se essa casa n foi utilizada
       
       return(tabuleiro
/*Linha*/     [currentRow+horizontal[moverPara]]
/*Coluna*/    [currentColumn+vertical[moverPara]]==0) ? true: false;
   }
   
   private boolean dentroDoTabuleiro(int moverPara){
        int newColumn = currentColumn + vertical[moveNumber];
        int newRow = currentRow + horizontal[moveNumber];

   }
}
