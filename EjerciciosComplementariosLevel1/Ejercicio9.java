import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        int cont = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese alguna frase: ");
        String frase = entrada.nextLine();
        frase = frase.toLowerCase();
        System.out.print("Ingrese la letra a buscar: ");
        String a = entrada.nextLine();
        char letter = a.charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (letter == frase.charAt(i)) {
                cont++;
            }
        }
        System.out.print("La cantidad de letras: "+letter +" es " +cont);
    }
}