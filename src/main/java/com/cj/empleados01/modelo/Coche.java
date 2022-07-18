package com.cj.empleados01.modelo;

import java.util.Objects;

public class Coche {

    String marcaCoche;
    String modeloCoche;


    public Coche() {
    }

    public Coche(String marcaCoche, String modeloCoche) {
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
    }

    public String getMarcaCoche() {
        return this.marcaCoche;
    }

    public void setMarcaCoche(String marcaCoche) {
        this.marcaCoche = marcaCoche;
    }

    public String getModeloCoche() {
        return this.modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public Coche marcaCoche(String marcaCoche) {
        setMarcaCoche(marcaCoche);
        return this;
    }

    public Coche modeloCoche(String modeloCoche) {
        setModeloCoche(modeloCoche);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coche)) {
            return false;
        }
        Coche coche = (Coche) o;
        return Objects.equals(marcaCoche, coche.marcaCoche) && Objects.equals(modeloCoche, coche.modeloCoche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcaCoche, modeloCoche);
    }

    @Override
    public String toString() {
        return
            "Marca del Coche= " + getMarcaCoche() + "\n" +
            "Modelo del Coche= " + getModeloCoche();
    }

}
