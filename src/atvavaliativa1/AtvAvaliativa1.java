/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvavaliativa1;

/**
 *
 * @author beruas
 */
public class AtvAvaliativa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pratica1TemperaturaInstancia tempC = new Pratica1TemperaturaInstancia(25.0);
        System.out.println("Celsius para Kelvin: " + tempC.celciusParaKelvin());
        System.out.println("kelvin para celcius"+ tempC.celciusParaKelvin());
        
        
        long cpfValido = 14230703058L; // Exemplo de CPF válido
        long cpfInvalido = 12345678900L; // Exemplo de CPF inválido

        System.out.println("O CPF " + cpfValido + " é válido? " + ValidadorCPFCNPJ.isCpfValido(cpfValido));
        System.out.println("O CPF " + cpfInvalido + " é válido? " + ValidadorCPFCNPJ.isCpfValido(cpfInvalido));
        String cpfStringValido = "12345678909"; // Exemplo de CPF válido
        String cpfStringInvalido = "12345678900"; // Exemplo de CPF inválido

       // System.out.println("O CPF " + cpfStringValido + " é válido? " + isCpfValido(cpfStringValido));
        //System.out.println("O CPF " + cpfStringInvalido + " é válido? " + isCpfValido(cpfStringInvalido));
        
    }
    
}
