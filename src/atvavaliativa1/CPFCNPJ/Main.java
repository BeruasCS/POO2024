/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1.CPFCNPJ;

/**
 *
 * @author beruas
 */


public class Main {

    public static void main(String[] args) {
        testarCPFeCNPJ();
    }
    
    public static void testarCPFeCNPJ() {
        String[] cpfs = {
            "123.456.789-09",   // CPF válido com pontos e traço
            "12345678909",      // CPF válido sem pontos e traço
            "123.456.789",      // CPF inválido (com menos de 11 dígitos)
            "123456789A"        // CPF inválido (com caracteres não numéricos)
        };
        
        String[] cnpjs = {
            "12.345.678/0001-62",   // CNPJ válido com pontos e traço
            "12345678000162",       // CNPJ válido sem pontos e traço
            "12.345.678/0001-6",    // CNPJ inválido (com menos de 14 dígitos)
            "1234567800016A"        // CNPJ inválido (com caracteres não numéricos)
        };
        
        System.out.println("Testando CPFs:");
        for (String cpf : cpfs) {
            System.out.println(cpf + " é válido? " + ValidadorCPFCNPJ.isCpfValido(cpf));
        }
        
        System.out.println("\nTestando CNPJs:");
        for (String cnpj : cnpjs) {
            System.out.println(cnpj + " é válido? " + ValidadorCPFCNPJ.isCnpjValido(cnpj));
        }
    }
}

