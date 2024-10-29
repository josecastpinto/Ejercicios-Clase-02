/*Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta, 
multiplicación y división con esos números. Muestra los resultados en la consola. */
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el primer numero entero");
        var primerNumero= entrada.nextInt();

        System.out.println("Digita el segundo numero entero");
        var segundoNumero = entrada.nextInt();

        System.out.printf("Los numeros ingresado son:%n%d%n %d %n", primerNumero,segundoNumero);

        var suma = primerNumero+segundoNumero;
        var resta = primerNumero-segundoNumero;
        var multiplicacion = primerNumero*segundoNumero;
        double division = primerNumero/segundoNumero;

        System.out.printf("los valores obtenidos en suma es %d la resta es %d la multiplicacion es %d la divicion es %f%n", suma,resta,multiplicacion,division);
        

    
    }
    
}
