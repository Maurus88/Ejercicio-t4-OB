import java.util.Scanner;  // Importo la clase scanner para poder pedir que se ingrese por teclado el numero //
public class Main {
    public static void main(String[] args) {
        // == COMPARAR NUMERO CON CERO - POSITIVO - NEGATIVO == //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero a analizar: ");
        int numeroIf = scanner.nextInt();
        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if (numeroIf == 0){
            System.out.println("El numero es cero");
        }else {
            System.out.println("El numero es negativo");
        }

        System.out.println(" ==================== ");
        // == BUCLE WHILE PARA NUMERO QUE COMIENZA EN 0 Y FINALIZA CUANDO SE CUMPLE LA CONDICION == //
        System.out.println("Bucle While: empezaremos un bucle con el numero 0 y se sumara 1 hasta cumplir la condición.");
        int numeroWhile = 0;
                while (numeroWhile < 3) {
                    System.out.println("Incremento en uno " + numeroWhile);
                    numeroWhile = numeroWhile+1;
        } System.out.println("El numero luego del ciclo while final es: " + numeroWhile);

        System.out.println(" ==================== ");
        // == BUCLE DO WHILE QUE SE VA A CUMPLIR UNA VEZ AL MENOS == //
        do {
            System.out.println("Incremento en uno para el numero " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 4);
        System.out.println("El numero luego del ciclo do while final es: " + numeroWhile + " Notar que se ejecuta una vez hasta cumplir la condicion.");

        System.out.println(" ==================== ");
        // == BUCLE FOR == //
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println("Ejecución ciclo for: " + numeroFor);
        }

        System.out.println(" ==================== ");
        // == USO DE EL SWITCH == //
        Scanner scannerII = new Scanner(System.in);
        System.out.println("Ingrese estación del año (verano, otoño, invierno, primavera): ");
        var estacion = scanner.next();
        switch(estacion) {
            case "verano":
                System.out.println("Desde diciembre a febrero en sudamerica.");
                break;
            case "otoño":
                System.out.println("Desde febrero a mayo en sudamerica.");
                break;
            case "invierno":
                System.out.println("Desde junio a septiembre en sudamerica.");
                break;
            case "primavera":
                System.out.println("Desde septiembre a diciembre en sudamerica.");
                break;
            default:
                System.out.println("Ingresar una estacion para saber en que mes comienza y termina en sudamerica.");
                break;
        }
    }
}
