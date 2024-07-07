/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1;

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
}
