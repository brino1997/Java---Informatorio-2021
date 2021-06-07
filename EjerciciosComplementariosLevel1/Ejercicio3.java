import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int a = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un valor: ");
        a = entrada.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"");
            }   
            System.out.println();
        }
        entrada.close();
    }
}
