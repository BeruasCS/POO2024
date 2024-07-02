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
    }
    
}
