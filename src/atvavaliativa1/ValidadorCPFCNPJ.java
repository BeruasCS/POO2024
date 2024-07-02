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

    public static int obterDigito(long cpf, int pos){
        return (int) ((cpf / (long) Math.pow(10, pos)) % 10);
    }
    
    public static boolean isCpfValido(long cpf) {
        int z = 0;  
        int n;
        int soma = 0;
        for (int i = 10; i >= 2; i--) {
            n = obterDigito(cpf, z);
            soma = soma + (n * i);
            z++;
        }
    
        return true; 
    }
}
