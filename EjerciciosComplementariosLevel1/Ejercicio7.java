import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese alguna palabra: ");
        char minuscula= 0;
        String palabra = entrada.nextLine();
        int a= palabra.length();//longitud
        entrada.close();
        System.out.print("la palabra pasada a letra mayuscula es: ");
        for (int i = 0; i< a; i++){
            minuscula=  (char) palabra.charAt(i);
            if (minuscula >= 'a' && minuscula<='z'){
                minuscula = (char)(minuscula- 'a' + 'A');
                System.out.print(minuscula);
            }else{
                System.out.print(minuscula);
            }
        }
    }
}