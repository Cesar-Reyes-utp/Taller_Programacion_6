package proyecto1_sesion6;
import java.util.Scanner;
public class ejercicio_propuesto_2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int numero;
        //proceso de datos
        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Número fuera del rango. Inténtalo de nuevo.");
            }

        } while (numero < 1 || numero > 10);

        System.out.println("¡Número válido!");
    }
    
}
