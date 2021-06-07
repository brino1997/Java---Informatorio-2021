package Ejercicio6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Ejercicio6 {
    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer, Integer> montoTotal = new HashMap<>();
        //carga de empleados
        Empleado num1 = new Empleado("Jose", 40501870, 45, 600);
        Empleado num2 = new Empleado("Julian", 40501975, 33, 687);
        Empleado num3 = new Empleado("Fernando", 11252458, 23, 800);
        Empleado num4 = new Empleado("Luis", 15405879, 48, 500);

        empleados.add(num1);
        empleados.add(num2);
        empleados.add(num3);
        empleados.add(num4);

        for (Empleado lista : empleados) {

            System.out.println(lista);
        }
        
        montoTotal.put(num1.obtencionDni(), num1.sueldo());
        montoTotal.put(num2.obtencionDni(), num2.sueldo());
        montoTotal.put(num3.obtencionDni(), num3.sueldo());
        montoTotal.put(num4.obtencionDni(), num4.sueldo());
        //mostrar por pantalla
        System.out.println("El monto total  se muestra de la siguiente manera DNI=monto: ");
        System.out.println(montoTotal);
       
    }
}