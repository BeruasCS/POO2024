/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1.Pratica2;

/**
 *
 * @author beruas
 */
public class Main {
    public static void main(String[] args) {
        testarConversoes();
    }
    
    public static void testarConversoes() {
        // Testando conversão de Kelvin para Celsius
        double temperaturaKelvin = 300.0;
        System.out.println(temperaturaKelvin + " K = " + Pratica2TemperaturaEstatica.kelvinParaCelsiusEstatico(temperaturaKelvin) + " °C");

        // Testando conversão de Kelvin para Fahrenheit
        System.out.println(temperaturaKelvin + " K = " + Pratica2TemperaturaEstatica.kelvinParaFahrenheitEstatico(temperaturaKelvin) + " °F");

        // Testando conversão de Celsius para Kelvin
        double temperaturaCelsius = 25.0;
        System.out.println(temperaturaCelsius + " °C = " + Pratica2TemperaturaEstatica.celsiusParaKelvinEstatico(temperaturaCelsius) + " K");

        // Testando conversão de Celsius para Fahrenheit
        System.out.println(temperaturaCelsius + " °C = " + Pratica2TemperaturaEstatica.celsiusParaFahrenheitEstatico(temperaturaCelsius) + " °F");

        // Testando conversão de Fahrenheit para Kelvin
        double temperaturaFahrenheit = 77.0;
        System.out.println(temperaturaFahrenheit + " °F = " + Pratica2TemperaturaEstatica.fahrenheitParaKelvinEstatico(temperaturaFahrenheit) + " K");

        // Testando conversão de Fahrenheit para Celsius
        System.out.println(temperaturaFahrenheit + " °F = " + Pratica2TemperaturaEstatica.fahrenheitParaCelsiusEstatico(temperaturaFahrenheit) + " °C");
    }
}
