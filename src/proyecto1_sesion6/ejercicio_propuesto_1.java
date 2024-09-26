package proyecto1_sesion6;
import java.util.Scanner;
public class ejercicio_propuesto_1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.print("Introduce un número positivo (o un número negativo para detener): ");
        numero = scanner.nextInt();
        //proceso de datos
        while (numero >= 0) {
            suma += numero; // Sumar el número a la suma total
            System.out.print("Introduce un número positivo (o un número negativo para detener): ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
