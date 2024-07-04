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
        
        if (cpf < 10000000000L || cpf > 99999999999L) {
            return false;
        }
       
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += obterDigito(cpf, 10 - i) * (10 - i);
        }
        int primeiroDigitoVerificador = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += obterDigito(cpf, 10 - i) * (11 - i);
        }
        soma += primeiroDigitoVerificador * 2;
        int segundoDigitoVerificador = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        return obterDigito(cpf, 1) == primeiroDigitoVerificador &&
                obterDigito(cpf, 0) == segundoDigitoVerificador;
    }

    public static boolean isCpfValido(String cpf) {
        
        cpf = cpf.replace(".", "").replace("-", "");

        try {
            long cpfLong = Long.parseLong(cpf);
            return isCpfValido(cpfLong);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isCnpjValido(long cnpj) {
        if (cnpj < 10000000000000L || cnpj > 99999999999999L) {
            return false;
        }

        int soma = 0;
        int[] pesosPrimeiroDigito = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        for (int i = 0; i < 12; i++) {
            soma += obterDigito(cnpj, 13 - i) * pesosPrimeiroDigito[i];
        }
        int primeiroDigitoVerificador = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        soma = 0;
        int[] pesosSegundoDigito = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        for (int i = 0; i < 13; i++) {
            soma += obterDigito(cnpj, 14 - i) * pesosSegundoDigito[i];
        }
        int segundoDigitoVerificador = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        return (obterDigito(cnpj, 1) == primeiroDigitoVerificador) &&
               (obterDigito(cnpj, 0) == segundoDigitoVerificador);
    }
}