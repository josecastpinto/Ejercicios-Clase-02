/*Crea un programa que calcule el área y el perímetro de un rectángulo. Solicita al usuario la longitud y 
el ancho del rectángulo. */
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la longitud del rectangulo ");
        var longitud = entrada.nextDouble();

        System.out.println("ingrese el ancho del rectangulo");
        var ancho = entrada.nextDouble();

        var area = longitud * ancho;
        System.out.printf("El area del recatangulo es %.2f",area);

    

        
    }
    
}
