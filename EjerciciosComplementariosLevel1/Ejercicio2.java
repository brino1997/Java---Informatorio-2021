import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int a ,b = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        a = entrada.nextInt();
        System.out.println("ingrese el segundo numero ");
        b = entrada.nextInt();
        System.out.println("el resultado de la suma es: "+(a+b));
        System.out.println("el resultado de la resta es: "+(a-b));
        System.out.println("el resultado de la multiplicacion es: "+(a*b));
        System.out.println("el resultado de la division es: "+(a/b));
        System.out.println("el resultado del resto es: "+(a%b));
        entrada.close();
    }
}
