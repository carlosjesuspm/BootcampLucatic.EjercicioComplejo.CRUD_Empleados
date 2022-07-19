package com.cj.empleados01.servicios;

import com.cj.empleados01.datos.DatosEmpresa;
import com.cj.empleados01.datos.IDatosEmpresa;

public class ServiciosEmpresa implements IServiciosEmpresa{
    
    private IDatosEmpresa datos = new DatosEmpresa();


    public ServiciosEmpresa() {
    }

    public ServiciosEmpresa(IDatosEmpresa datos) {
        this.datos = datos;
    }

    public IDatosEmpresa getDatos() {
        return this.datos;
    }

    public void setDatos(IDatosEmpresa datos) {
        this.datos = datos;
    }

    public void addEmpleado(){
        datos.addEmpleado();
    };
    public void addGerente(){
        datos.addGerente();
    };
    public void addDirector(){
        datos.addDirector();
    };
    public void modificarEmpleado(){
        datos.modificarEmpleado();
    };
    public void eliminarEmpleado(){
        datos.eliminarEmpleado();
    };
    public void listaEmpleados(){
        datos.listaEmpleados();
    };
    public void incentivoGerente(){
        datos.incentivoGerente();
    };
    public void incentivoDirector(){
        datos.incentivoDirector();
    };


}
