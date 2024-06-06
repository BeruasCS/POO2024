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
    public static Double celsiusParaKelvinEstatico(double temperatura) {
          if (temperatura < -273.15) {
              throw new IllegalArgumentException("Temperatura em Celsius não pode ser menor que -273.15.");
          }
          return temperatura + 273.15;
    }  
    public static Double celsiusParaFahrenheitEstatico(double temperatura) {
        if (temperatura < -273.15) {
            throw new IllegalArgumentException("Temperatura em Celsius não pode ser menor que -273.15.");
        }
        return (temperatura * 9/5) + 32;
    }
    public static Double fahrenheitParaKelvinEstatico(double temperatura) {
        if (temperatura < -459.67) {
            throw new IllegalArgumentException("Temperatura em Fahrenheit não pode ser menor que -459.67.");
        }
        return (temperatura - 32) * 5/9 + 273.15;
    }
}  
