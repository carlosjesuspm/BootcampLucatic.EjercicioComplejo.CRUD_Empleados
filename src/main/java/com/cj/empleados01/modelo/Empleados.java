package com.cj.empleados01.modelo;

import java.util.Date;
import java.util.Objects;

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
        return "{" +
            " nombreEmpleado='" + getNombreEmpleado() + "'" +
            ", salarioEmpleado='" + getSalarioEmpleado() + "'" +
            ", fechaNacimientoEmpleado='" + getFechaNacimientoEmpleado() + "'" +
            "}";
    }
    
}
