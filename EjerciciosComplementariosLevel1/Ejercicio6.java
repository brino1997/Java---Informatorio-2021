import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        int a,b= 0, resultado= 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el valor de la base: ");
        a = entrada.nextInt();
        System.out.println("ingrese el valor de la potencia: ");
        b = entrada.nextInt();

        if (a!=0 && b!=0) {
            for (int i = 0; i < b; i++) {
                resultado = resultado * a; 
            }
        System.out.println(a+" elevado a " + b +" = " + resultado);
        }
        entrada.close();
    }
}
