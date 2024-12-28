import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class GenerarCambioMoneda {
    public static void convertir (String monedaBase, String monedaTarget, ConsultaMoneda consultar, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consultar.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1"+" "+monedaBase+" = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingresa la cantidad "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        BigDecimal bd = new BigDecimal(cantidadConvertida).setScale(5, RoundingMode.HALF_UP).stripTrailingZeros();
        double valor = bd.doubleValue();
        System.out.println("El valor de: "+cantidad+" "+"("+monedaBase +")"+ " Corresponde al valor monetario de: " + valor +" "+"(" +monedaTarget+")");
    }
    public static  void OtroTipoMoneda(ConsultaMoneda consultar, Scanner lectura){
        System.out.println("Ingrese el codigo de la monda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el tipo de moneda de cambio: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consultar,lectura);
    }
}
