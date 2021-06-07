import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a,b, resultado= 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer valor: ");
        a = entrada.nextInt();
        System.out.println("ingrese el segundo valor: ");
        b = entrada.nextInt();
        if (a!=0 && b!=0) {
            for (int i = 0; i < b; i++) {
                resultado = resultado + a; 
            }
        System.out.println("el resultado del producto es: " + resultado);
        }else{
            System.out.println("el resultado del producto es cero porque uno de los numeros ingresado es cero");
        }
        entrada.close();
    }
}
