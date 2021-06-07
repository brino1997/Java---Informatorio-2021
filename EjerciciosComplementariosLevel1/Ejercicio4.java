import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int factorial = 1, num=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        num = entrada.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial= factorial*i;
        }
        entrada.close();
        System.out.println("El factorial de "+num+ " es "+factorial);
    }
}
