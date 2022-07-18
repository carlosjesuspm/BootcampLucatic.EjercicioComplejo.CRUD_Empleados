package com.cj.empleados01.modelo;

import java.util.Date;
import java.util.Objects;

import com.cj.empleados01.utilidades.LeerTeclado;

public class Empleados {
    
    private String nombreEmpleado;
    private double salarioEmpleado;
    private Date fechaNacimientoEmpleado; 


    public Empleados() {
        
    }

    public Empleados(String nombre, double salario, Date fechaNacimiento) {
        this.nombreEmpleado=nombre;
        this.salarioEmpleado=salario;
        this.fechaNacimientoEmpleado=fechaNacimiento;
    }

    public Empleados(String nombre, double salario) {
        this.nombreEmpleado=nombre;
        this.salarioEmpleado=salario;
    }

    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSalarioEmpleado() {
        return this.salarioEmpleado;
    }

    public void setSalarioEmpleado(double salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public Date getFechaNacimientoEmpleado() {
        return this.fechaNacimientoEmpleado;
    }

    public void setFechaNacimientoEmpleado(Date fechaNacimientoEmpleado) {
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleados)) {
            return false;
        }
        Empleados empleados = (Empleados) o;
        return Objects.equals(nombreEmpleado, empleados.nombreEmpleado) && salarioEmpleado == empleados.salarioEmpleado && Objects.equals(fechaNacimientoEmpleado, empleados.fechaNacimientoEmpleado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreEmpleado, salarioEmpleado, fechaNacimientoEmpleado);
    }

    @Override
    public String toString() {
        return "Características del empleado: " + "\n" +
            "Nombre del empleado= " + getNombreEmpleado()+ "\n" +
            "Salario del empleado= " + getSalarioEmpleado() + "\n" +
            "Fecha de Nacimiento= " + getFechaNacimientoEmpleado();
    }
    
    public void crearEmpleado(){
        this.nombreEmpleado = LeerTeclado.leerLinea("Introduce nombre empleado: ");
        this.salarioEmpleado = LeerTeclado.leerNumeroDouble("Introduce salario del empleado: ");
        while (this.salarioEmpleado<=0){
            System.out.print("El salario del empleado no puede ser ni 0, ni inferior a 0. Introdúcelo de nuevo: ");
            this.salarioEmpleado = LeerTeclado.leerNumeroDouble();
        }
        this.fechaNacimientoEmpleado= new Date();
    }
}
