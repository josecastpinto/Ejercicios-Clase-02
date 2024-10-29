/*Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. 
Usa las siguientes 
fórmulas:
Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15 */

import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el valor de la temperatura grados celcius");
        var celcius = entrada.nextDouble();

        var fahrenheit = celcius * 9/5 + 32d;
        var kelvin = celcius + 273.15d;

        System.out.printf("La temperatura ingresada convertida a fahrenheit es %.2f y en kelvin es %.2f",fahrenheit,kelvin);
    }
    
}
