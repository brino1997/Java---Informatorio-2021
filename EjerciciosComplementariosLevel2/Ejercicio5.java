import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        List<Integer> pago = new ArrayList<>();
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(4);
        numeros.add(5);
        pago.add(350);
        pago.add(345);
        pago.add(550);
        pago.add(600);
        pago.add(320);
        int n = 0;
        System.out.print("[ ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print( numeros.get(i)*pago.get(i)+" ");
            n= n+numeros.get(i)*pago.get(i);
        }
        System.out.println("]");
        System.out.println("Total Final: $"+n);
    }
}