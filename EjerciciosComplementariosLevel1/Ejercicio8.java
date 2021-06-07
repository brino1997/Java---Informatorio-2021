import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        String nombre, ciudad, direccion = "";
        int edad = 0;
        Scanner entrada  = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("ingrese su nombre completo: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        edad = entrada2.nextInt();
        System.out.print("ingrese su direccion: ");
        direccion = entrada.nextLine();
        System.out.print("ingrese su ciudad completo: ");
        ciudad = entrada.nextLine();
        System.out.print(ciudad + "-" + direccion + "-" + edad + "-" + nombre);
        entrada.close();
        entrada2.close();
    }
}
