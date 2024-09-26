package proyecto1_sesion6;
import java.util.Scanner;
public class ejercicio_propuesto_3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        //procesos de datos
        for (int i = 1; i <= 10; i++) {
            //salidad ed datos
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
    
}
