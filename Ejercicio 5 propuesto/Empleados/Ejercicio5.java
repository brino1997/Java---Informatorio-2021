package Empleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Empleado> ListaDeEmpleados = cargarEmpleado();

        System.out.println("Busqueda de los empleados con la letra dada: ");
        for (Empleado e: EmpleadoUtil.getEmployeesByFirstLetterLastname(ListaDeEmpleados, "F")){
            System.out.println(e);
        }

        System.out.println("\nEmpleado de mayor edad y el mas joven: ");
        Map<String, Empleado> oldYoungMap = EmpleadoUtil.getEmployeesOldYoung(ListaDeEmpleados);
        oldYoungMap.forEach((k,v) -> System.out.println(k + ":\nEmpleado: " + v.getName() + " " + v.getLastname() + " - Edad: " + v.getAge()));

        System.out.println("\nMejor sueldo y peor sueldo: ");
        Map<String, Empleado> bestPoorSalariesMap = EmpleadoUtil.getEmployeesBestPoorSalary(ListaDeEmpleados);
        bestPoorSalariesMap.forEach((k,v) -> System.out.println(k + ":\nEmpleado: " + v.getName() + " " + v.getLastname() + " - Sueldo: " + v.getSalary()));

        System.out.println("\nLista de empleados ordenados alfabeticamente:\n");

        for (Empleado e: EmpleadoUtil.sortByNameLastname(ListaDeEmpleados)) {
            System.out.println(e);
        }
    }

    public static List<Empleado> cargarEmpleado() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String[] empleado;
        List<Empleado> ListaDeEmpleados = new ArrayList<>();

        try {
            file = new File("src/Empleados/Empleados.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                empleado = line.split(",");
                ListaDeEmpleados.add(new Empleado(empleado[0], empleado[1], empleado[2], empleado[3]));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileReader){
                    fileReader.close();
                }   
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ListaDeEmpleados;
    }
}