package com.cj.empleados01.modelo;

import java.util.Date;
import java.util.Objects;

public class Gerente extends Empleados {
    
    Departamento dep;


    public Gerente() {
    }

    public Gerente(String nombre, double salario, Date fechaNacimiento, Departamento dep) {
        super(nombre, salario, fechaNacimiento);
        this.dep = dep;
    }

    public Gerente(String nombre, double salario, Departamento dep) {
        super(nombre, salario);
        this.dep = dep;
    }

    public Departamento getDep() {
        return this.dep;
    }

    public void setDep(Departamento dep) {
        this.dep = dep;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gerente)) {
            return false;
        }
        Gerente gerente = (Gerente) o;
        return Objects.equals(dep, gerente.dep);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dep);
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" +
            "Cargo: Gerente" + "\n" +
            "Departamento= " + getDep();
    }

    public void incentivoGerente(){
        double totalSalarioGerente= getSalarioEmpleado() * 1.05;
        this.setSalarioEmpleado(totalSalarioGerente);
        System.out.println("El salario del gerente asciende a: " + this.getSalarioEmpleado() + "euros");
    }
}
