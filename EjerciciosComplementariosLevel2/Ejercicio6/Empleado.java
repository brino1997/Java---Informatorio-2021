package Ejercicio6;

public class Empleado {

    String nombre;
    Integer dni;
    int horas;
    int montoPorHora;

    public Empleado(String nombre, Integer dni, int horas, int montoPorHora){
        this.nombre = nombre;
        this.dni = dni;
        this.horas = horas;
        this.montoPorHora = montoPorHora;
    }

    public String toString() {
        return   this.nombre + " - " + this.dni + " - " + String.valueOf(this.horas + " - " + this.montoPorHora) ;
    }

    public int sueldo(){
        return this.horas * this.montoPorHora;
    }

    public Integer obtencionDni(){
        return this.dni;
    }
    
}