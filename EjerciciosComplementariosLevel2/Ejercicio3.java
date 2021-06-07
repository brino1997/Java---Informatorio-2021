import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        System.out.println("La lista ordenada es: ");        
        mostrar_lista(numeros);
        System.out.println(" ");
        System.out.println("La lista al reverso es: ");
        Collections.reverse(numeros);
        mostrar_lista(numeros);
        Collections.shuffle(numeros);
        System.out.println(" ");
        System.out.println("La lista desordenada es: ");
        mostrar_lista(numeros);
    }
    public static void mostrar_lista(ArrayList<Integer> numeros) {
        for (Integer numero:numeros) {
            System.out.print(" "+numero);
        }    
        
    }
}
