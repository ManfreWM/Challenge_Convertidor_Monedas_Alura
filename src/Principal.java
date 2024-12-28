import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion=0;
        while (opcion!=8){
            System.out.println("""
                    **********************\s
                    Bienvenidos al conversor de monedas
                    Ingrese la consulta de desea realizar
                    1. Dolar a peso Argentino
                    2. Peso Argentino a Dolar
                    3. Dolar a Real Brasilero
                    4. Real Brasilero a Dolar
                    5. Dolar a peso Colombiano
                    6. Peso Colombiano a Dolar
                    7. Convetir Otra moneda
                    8. Salir
                   \s""");
            opcion= lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    GenerarCambioMoneda.convertir("USD","ARS",consulta, lectura);
                    break;
                case 2:
                    GenerarCambioMoneda.convertir("ARS","USD", consulta, lectura);
                    break;
                case 3:
                    GenerarCambioMoneda.convertir("USD","BRL", consulta, lectura);
                    break;
                case 4:
                    GenerarCambioMoneda.convertir("BRL","USD", consulta, lectura);
                    break;
                case 5:
                    GenerarCambioMoneda.convertir("USD","COP", consulta, lectura);
                    break;
                case 6:
                    GenerarCambioMoneda.convertir("COP","USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("EEUU:USD - Peru:PEN - Bolivia:BOB - Chile: CLP - Paraguay:PYG- Venezuela:VES");
                    GenerarCambioMoneda.OtroTipoMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo.............. ");
                    break;

                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        }

    }
}
