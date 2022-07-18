package com.cj.empleados01.datos;

import java.util.ArrayList;
import java.util.List;

import com.cj.empleados01.modelo.Director;
import com.cj.empleados01.modelo.Empleados;
import com.cj.empleados01.modelo.Gerente;

public class DatosEmpresa implements IDatosEmpresa{
    
    private List<Empleados> listaEmpleados = new ArrayList<>();

    public DatosEmpresa() {
    }

    public DatosEmpresa(List<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Empleados> getListaEmpleados() {
        return this.listaEmpleados;
    }

    public void setListaEmpleados(List<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    // addEmpleado

    public void addEmpleado(){
        Empleados emp = new Empleados();
        emp.crearEmpleado();
        listaEmpleados.add(emp);
    }

    // addGerente

    public void addGerente(){
        Gerente ger = new Gerente();
        ger.crearEmpleado();
        listaEmpleados.add(ger);
    }

    // addDirector

    public void addDirector(){
        Director dir = new Director();
        dir.crearEmpleado();
        listaEmpleados.add(dir);
    }

    // modificarEmpleado

    public void modificarEmpleado(){
        
    }

    // eliminarEmpleado

    public void eliminarEmpleado(){
        
    }

    // listaEmpleados

    public void listaEmpleados(){
        for (Empleados empleado:listaEmpleados){
            System.out.println(empleado);
            System.out.println("");
        }
    }

    // incentivoGerente

    public void incentivoGerente(){
        
    }

    //incentivoDirector

    public void incentivoDirector(){
        
    }
}
