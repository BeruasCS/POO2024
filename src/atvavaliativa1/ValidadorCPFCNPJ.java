/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package atvavaliativa1;

/**
 *
 * @author beruas
 */
public class ValidadorCPFCNPJ {
private static int validar=0;
    public static int obterDigito(long cpf, int pos){
        return (int) ((cpf / (long) Math.pow(10, pos)) % 10);
    }
    
    public static boolean isCpfValido(long cpf) {
        
          if (cpf < 10000000000L || cpf > 99999999999L) {
            return false;
        }
          
        int z = 0;  
        int n=10;
        int soma = 0;
        int digito= 0;
        
        for (int i = n; i >= 2; i--) {
           
            soma = (obterDigito(cpf, z) * i) + soma;
            z++;
        }
        if (soma%11<2) {
            
            digito =0;
        } if(soma%11>2){
            digito = soma -(soma%11);
        }
        if (obterDigito(cpf, 11)== digito){
            
          validar = validar +1;  
            n++;
        }
    }
    
}
