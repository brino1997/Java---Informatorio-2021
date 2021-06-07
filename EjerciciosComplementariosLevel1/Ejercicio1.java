import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("hola "+ nombre);
        entrada.close();
    }
}