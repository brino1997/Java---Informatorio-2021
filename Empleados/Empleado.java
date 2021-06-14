package Empleados;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate cumpleaños;
    private float sueldo;

    public Empleado(String nombre, String apellido, String cumpleaños, String sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumpleaños = LocalDate.parse(cumpleaños, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sueldo = Float.parseFloat(sueldo);
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getName() {
        return nombre;
    }

    public void setLastname(String apellido) {
        this.apellido = apellido;
    }

    public String getLastname() {
        return apellido;
    }

    public void setBirth(String cumpleaños) {
        this.cumpleaños = LocalDate.parse(cumpleaños, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public LocalDate getBirth() {
        return cumpleaños;
    }

    public void setSalary(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSalary() {
        return sueldo;
    }

    public int getAge() {
        Period diferencia = Period.between(this.cumpleaños, LocalDate.now());
        return diferencia.getYears();
    }

    public String toString() {
        return "El Empleado{" + "su Nombre: '" + nombre + '\'' + ", su Apellido: '" + apellido + '\'' + ", su Cumpleaños: " + cumpleaños.toString() + ", su Sueldo: " + sueldo + '}';
    }
}