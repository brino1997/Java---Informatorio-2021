package Empleados;

import java.util.*;

public abstract class EmpleadoUtil {

    public static List<Empleado> getEmployeesByFirstLetterLastname(List<Empleado> empleados, String datos) {
        List<Empleado> ListaDeEmpleados = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (datos.equalsIgnoreCase(String.valueOf(empleado.getLastname().charAt(0)))){
                ListaDeEmpleados.add(empleado);
            }
        }
        return ListaDeEmpleados;
    }

    public static Map<String, Empleado> getEmployeesOldYoung(List<Empleado> empleados) {
        Map<String, Empleado> empleadosMap = new HashMap<>();
        empleados.sort(Comparator.comparing(Empleado::getAge));

        empleadosMap.put("Mas joven", empleados.get(0));
        empleadosMap.put("Mas viejo", empleados.get(empleados.size() - 1));
        return empleadosMap;
    }

    public static Map<String, Empleado> getEmployeesBestPoorSalary(List<Empleado> empleados) {
        Map<String, Empleado> empleadosMap = new HashMap<>();
        empleados.sort(Comparator.comparing(Empleado::getSalary));

        empleadosMap.put("El peor salario", empleados.get(0));
        empleadosMap.put("El mejor salario", empleados.get(empleados.size() - 1));
        return empleadosMap;
    }

    public static List<Empleado> sortByNameLastname(List<Empleado> empleados) {
        empleados.sort(Comparator.comparing(Empleado::getName).thenComparing(Empleado::getLastname));
        return empleados;
    }
}