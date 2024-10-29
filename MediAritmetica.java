/*Crea un programa que calcule la media aritmética de tres números introducidos por el usuario. */
import java.util.Scanner;
public class MediAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese primer numero natural");
        var num1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero natural");
        var num2 = entrada.nextInt();

        System.out.println("ingrese tercer numero natural");
        var num3 = entrada.nextInt();

        var suma = num1 +num2+num3;
        var MediAritmetica = suma/3;
        System.out.printf("La media aritmetica de los tres numeros ingresados es %d",MediAritmetica);
        
    }
    
}
