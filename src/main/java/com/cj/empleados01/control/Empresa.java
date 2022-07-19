package com.cj.empleados01.control;



import com.cj.empleados01.gui.Menu;
import com.cj.empleados01.servicios.IServiciosEmpresa;
import com.cj.empleados01.servicios.ServiciosEmpresa;
import com.cj.empleados01.utilidades.LeerTeclado;

public class Empresa {
    
    IServiciosEmpresa servicios = new ServiciosEmpresa();

    public void interfaz(){

        boolean seguir = true;
        do{
            Menu.mostrarMenu();
            elegirOpcion();
        } while (seguir);
    }

    public void elegirOpcion() {
        int opcion = LeerTeclado.leerNumeroEntero("Introduce opción a realizar: ");
        do{
            switch (opcion) {

                case 1:
                    servicios.listaEmpleados();
                    break;

                case 2:
                    servicios.addEmpleado();
                    break;

                case 3:
                    servicios.addDirector();
                    break;

                case 4:
                    servicios.addGerente();
                    break;

                case 5:
                    servicios.modificarEmpleado();
                    break;

                case 6:
                    servicios.eliminarEmpleado();
                    break;
                
                case 7:
                servicios.incentivoGerente();
                break;

                case 8:
                    servicios.incentivoDirector();
                    break;

                case 0:
                    break;
            }
        }while(opcion!=0);
            
    }
    
}
