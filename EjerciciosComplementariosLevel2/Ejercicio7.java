import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Integer> Lista = new ArrayList<Integer>();
        ArrayList<String> Lista2 = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un valor: ");
        int num1 = entrada.nextInt();
        System.out.print("ingrese el segundo valor: ");
        int num2 = entrada.nextInt();
        if (num1<num2) {
            
        }
        for (int i = num1; i < num2; i++) {
            Lista.add(i);
        }
        for (int a:Lista) {
            if (a % 2 == 0 && a % 3 == 0) {
                Lista2.add("FizzBuzz");
            }else if (a % 2 == 0) {
                Lista2.add("Fizz");
            }else if (a % 3 == 0) {
                Lista2.add("Buzz");
            }else{
                String cadena = Integer.toString(a);
                Lista2.add(cadena);
            }
        }
        System.out.print(Lista);
        System.out.println("");
        System.out.print(Lista2);
        entrada.close();
    }
}