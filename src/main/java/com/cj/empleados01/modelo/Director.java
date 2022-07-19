package com.cj.empleados01.modelo;

import java.util.Date;
import java.util.Objects;

public class Director extends Empleados {
    
    Coche cocheEmpresa;

    public Director() {
    }

    public Director(String nombre, double salario, Date fechaNacimiento, Coche cocheEmpresa) {
        super(nombre, salario, fechaNacimiento);
        this.cocheEmpresa = cocheEmpresa;
    }

    public Director(String nombre, double salario, Coche cocheEmpresa) {
        super(nombre, salario);
        this.cocheEmpresa = cocheEmpresa;
    }

    public Coche getCocheEmpresa() {
        return this.cocheEmpresa;
    }

    public void setCocheEmpresa(Coche cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public Director cocheEmpresa(Coche cocheEmpresa) {
        setCocheEmpresa(cocheEmpresa);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Director)) {
            return false;
        }
        Director director = (Director) o;
        return Objects.equals(cocheEmpresa, director.cocheEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cocheEmpresa);
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" +
            "Coche del Director= " + getCocheEmpresa();
    }

    public void incentivoDirector(){
        double totalSalarioDirector= getSalarioEmpleado()* 1.1 + 100;
        this.setSalarioEmpleado(totalSalarioDirector);
        System.out.println("El salario del director asciende a: " + this.getSalarioEmpleado() + " euros");
    }

}
