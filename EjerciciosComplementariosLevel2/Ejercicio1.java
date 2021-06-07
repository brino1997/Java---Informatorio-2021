import java.util.ArrayList;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<String>();
        cargar_Lista (ciudades);
        for (String ciudad:ciudades) {
            System.out.println(ciudad);    
        }
    }
    public static void cargar_Lista(List<String>ciudades) {
        ciudades.add("#1-Bariloche");
        ciudades.add("#2-Cordoba");
        ciudades.add("#3-Resistencia");
    }
}
