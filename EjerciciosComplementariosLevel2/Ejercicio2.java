import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        LinkedList<Integer>numeros = new LinkedList<>();
        cargar_numeros(numeros);
        System.out.println("La longitud de la lista antes de cargar es: "+ numeros.size());
        Mostrar_numeros(numeros);
        numeros.addFirst(1);
        numeros.addLast(9);
        System.out.println("");
        System.out.println("La longitud de la lista despsues de cargar es: "+ numeros.size());
        Mostrar_numeros(numeros);
    }
    public static void cargar_numeros(LinkedList<Integer>numeros) {
        numeros.add(2);
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(7);
    }
    public static void Mostrar_numeros(LinkedList<Integer>numeros) {
        for (Integer numero:numeros) {
            System.out.print(" "+numero);
        }
    }
}
