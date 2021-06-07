import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <12; i++) {
            System.out.println("ingrese nombre del alumno: ");
            
            String nom = entrada.nextLine();
            nombres.add(nom);
        }
        entrada.close();
        List<String> Lista1 = nombres.subList(0, 4);
        List<String> Lista2 = nombres.subList(4, 8);
        List<String> Lista3 = nombres.subList(8, 12);
        System.out.println(Lista1);
        System.out.println(Lista2);
        System.out.println(Lista3);
    }
}