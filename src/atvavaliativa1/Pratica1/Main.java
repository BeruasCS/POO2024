/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1.Pratica1;

/**
 *
 * @author beruas
 */
public class Main {
     public static void main(String[] args) {
        // Exemplo de uso da classe Pratica1TemperaturaInstancia
        
        // Criando uma instância com temperatura em Kelvin
        Pratica1TemperaturaInstancia temperatura = new Pratica1TemperaturaInstancia(300); // Exemplo de temperatura em Kelvin
        
        // Testando os métodos
        System.out.println("Temperatura em Kelvin: " + temperatura.getTemperatura());
        
        // Convertendo para Celsius e exibindo o resultado
        double celsius = temperatura.kelvinParaCelcius();
        System.out.println("Convertido para Celsius: " + celsius);
        
        // Convertendo para Fahrenheit e exibindo o resultado
        double fahrenheit = temperatura.kelvinParaFahrenheit();
        System.out.println("Convertido para Fahrenheit: " + fahrenheit);
        
        // Convertendo de volta para Kelvin a partir de Celsius e exibindo o resultado
        double kelvinFromCelsius = temperatura.celciusParaKelvin();
        System.out.println("Convertido de Celsius para Kelvin: " + kelvinFromCelsius);
        
        // Convertendo de Celsius para Fahrenheit e exibindo o resultado
        double fahrenheitFromCelsius = temperatura.celciusParaFahrenheit();
        System.out.println("Convertido de Celsius para Fahrenheit: " + fahrenheitFromCelsius);
        
        // Convertendo de Fahrenheit para Kelvin e exibindo o resultado
        double kelvinFromFahrenheit = temperatura.fahrenheitParaKelvin();
        System.out.println("Convertido de Fahrenheit para Kelvin: " + kelvinFromFahrenheit);
        
        // Convertendo de Fahrenheit para Celsius e exibindo o resultado
        double celsiusFromFahrenheit = temperatura.fahrenheitParaCelcius();
        System.out.println("Convertido de Fahrenheit para Celsius: " + celsiusFromFahrenheit);
    }
}
