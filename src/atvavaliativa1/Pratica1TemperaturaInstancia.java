/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvavaliativa1;

/**
 *
 * @author beruas
 */
public class Pratica1TemperaturaInstancia {
        private double temperatura; // valor absoluto da unidade de temperatura

    public Pratica1TemperaturaInstancia(double valor) {
        this.temperatura = valor;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double valor) {
        this.temperatura = valor;
    }
    public Double kelvinCelcius(){
        
        return temperatura - 273.15;
    }
    public Double kelvinFahrenheit(){
        
        return (temperatura-273) * 9/5 +32;
    }
    public Double celciusKelvin(){
        if (temperatura < -273.15) {
            throw new IllegalArgumentException("Temperatura em Celsius não pode ser menor que -273.15.");
        }
       return temperatura + 273.15;
    }
    public Double celciusFahrenheit(){
        if (temperatura < -273.15) {
            throw new IllegalArgumentException("Temperatura em Celsius não pode ser menor que -273.15.");
        }
        return (temperatura * 9/5) + 32;
    }
    public Double fahrenheitKelvin(){
         if (temperatura < -459.67) {
            throw new IllegalArgumentException("Temperatura em Fahrenheit não pode ser menor que -459.67.");
        }
        return (temperatura - 32) * 5/9 +273.15;
    }
    public Double fahrenheitCelcius(){
         if (temperatura < -459.67) {
            throw new IllegalArgumentException("Temperatura em Fahrenheit não pode ser menor que -459.67.");
        }
        return (temperatura - 32) * 5/9;
    }
}