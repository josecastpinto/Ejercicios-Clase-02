/*En el mercado, podemos encontrar que el precio del producto Pernil 
Iberic D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y
 el vendedor nos dice que el precio por kilo cuesta 29,75€. ¿Crees que
  es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente
 el precio por kilo del producto. */

public class MercadoPrecio {
    public static void main(String[] args) {

        var cienGramos = 5.95d; // costo de 100 gramos
        var precioGramo = cienGramos / 100; // precio de 1 gramo
        var total = precioGramo * 1000; // precio de 1 kilo
        System.out.println(precioGramo);
        System.out.println(total);
        System.out.printf("El precio de cien gramos es  %.2f euros y el precio de 1 kilo es  %.2f euros %n  ",cienGramos, total);
         // El precio de cien gramos es  5,95 euros y el precio de 1 kilo es  59,50 euros 
         // por eso el precio que ofrece el funcionario es incorrecto.

    }
    
}
