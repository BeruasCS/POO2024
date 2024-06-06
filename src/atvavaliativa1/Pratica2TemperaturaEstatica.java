/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1;

/**
 *
 * @author beruas
 */
public class Pratica2TemperaturaEstatica {
    
     public static Double kelvinParaCelsiusEstatico(double temperatura) {
        if (temperatura < 0) {
            throw new IllegalArgumentException("Temperatura em Kelvin não pode ser menor que 0.");
        }
        return temperatura - 273.15;
    }
     public static Double kelvinParaFahrenheitEstatico(double temperatura) {
        if (temperatura < 0) {
            throw new IllegalArgumentException("Temperatura em Kelvin não pode ser menor que 0.");
        }
        return (temperatura - 273) * 9/5 + 32;
    }
}
