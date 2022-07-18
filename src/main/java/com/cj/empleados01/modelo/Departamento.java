package com.cj.empleados01.modelo;

import java.util.Objects;

public class Departamento {
    
    String nombreDepartamento;
    String codigoDepartamento; 

    public Departamento() {
    }

    public Departamento(String nombreDepartamento, String codigoDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getCodigoDepartamento() {
        return this.codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public Departamento nombreDepartamento(String nombreDepartamento) {
        setNombreDepartamento(nombreDepartamento);
        return this;
    }

    public Departamento codigoDepartamento(String codigoDepartamento) {
        setCodigoDepartamento(codigoDepartamento);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Departamento)) {
            return false;
        }
        Departamento departamento = (Departamento) o;
        return Objects.equals(nombreDepartamento, departamento.nombreDepartamento) && Objects.equals(codigoDepartamento, departamento.codigoDepartamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDepartamento, codigoDepartamento);
    }

    @Override
    public String toString() {
        return
            "Nombre del Departamento= " + getNombreDepartamento() + "\n" +
            "Código del Departamento= " + getCodigoDepartamento();
    }

}
