/*En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de 
marzo. Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan
 durante el mes de septiembre.

Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían 
un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento?
 */

public class Rebajas {
    public static void main(String[] args) {

        var valorConDescuento = 34;
        System.out.printf(valorConDescuento+" "+" valor con decuento %n");
        var porcentajeDescuento = 15;

        var porcentajeDescontado = 100 - 15;
        var totalPorcentaje = porcentajeDescontado / 100d;

        System.out.printf(totalPorcentaje+" " +"total descuento porcentaje %n");

        var precioOriginal = valorConDescuento / totalPorcentaje;
        System.out.println(precioOriginal+" "+"precio original");
        
        System.out.printf("El precio original del pantalon es %.2f euros", precioOriginal);
        /* 34  valor con decuento 
         0.85 total descuento porcentaje
          40.0 precio original
         El precio original del pantalon es 40,00 euros*/
    }
    
}
