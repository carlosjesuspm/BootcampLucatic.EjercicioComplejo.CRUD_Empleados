package com.cj.empleados01.datos;

import java.util.ArrayList;
import java.util.List;

import com.cj.empleados01.modelo.Director;
import com.cj.empleados01.modelo.Empleados;
import com.cj.empleados01.modelo.Gerente;
import com.cj.empleados01.utilidades.LeerTeclado;

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
        String solicitarNombreEmpleado=LeerTeclado.leerLinea("Introduce nombre del empleado a modificar: ");

        for (Empleados emp : listaEmpleados){
            if(emp.getNombreEmpleado().equalsIgnoreCase(solicitarNombreEmpleado)){
                emp.setNombreEmpleado(LeerTeclado.leerLinea("Introduce nuevo nombre: "));
                emp.setSalarioEmpleado(LeerTeclado.leerNumeroEntero("Introduce nuevo salario: "));
                System.out.println("");
                System.out.println("El empleado se ha modificado correctamente");
            }

            else{
                System.out.println("No se ha encontrado empleado que buscas para modificar los datos");
            }
        }
        
    }

    // eliminarEmpleado

    public void eliminarEmpleado(){
        String solicitarNombreEmpleado=LeerTeclado.leerLinea("Introduce nombre del empleado a eliminar: ");

        for (Empleados emp : listaEmpleados){
            if (emp.getNombreEmpleado().equalsIgnoreCase(solicitarNombreEmpleado)){
                System.out.println("El usuario se encuentra en la lista.");
                System.out.print("¿Estás seguro de que deseas eliminar a " + emp.getNombreEmpleado() + "?:");
                String respuestaUsuario=LeerTeclado.leerLinea();
                if(respuestaUsuario.equalsIgnoreCase("si")){
                    listaEmpleados.remove(emp);
                    System.out.println("El empleado se ha eliminado correctamente");
                }
                else{
                    System.out.println("El empleado no se ha eliminado");
                }
            }
            else{
                System.out.println("El empleado a eliminar no se encuentra en la lista");
            }
        }
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
        for (Empleados emp : listaEmpleados){
            if (emp instanceof Gerente){
                ((Gerente) emp).incentivoGerente();
                System.out.println("Gerente incentivado correctamente");
            }
            else{
                System.out.println("No existe ningún gerente en la lista");
            }
        }
    }

    //incentivoDirector

    public void incentivoDirector(){
        for (Empleados emp : listaEmpleados){
            if (emp instanceof Director){
                ((Director) emp).incentivoDirector();
                System.out.println("Gerente director correctamente");
            }
            else{
                System.out.println("No existe ningún director en la lista");
            }
        }
    }
}
