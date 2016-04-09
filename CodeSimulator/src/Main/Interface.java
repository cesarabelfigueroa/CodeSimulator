package Main;

import java.io.Serializable;
import java.util.ArrayList;

public class Interface implements Serializable{

    private String nombre;
    private ArrayList<Método> metodos = new ArrayList();
    private ArrayList<Atributo> atributos = new ArrayList();

    public Interface() {
    }

    public Interface(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exc {
        if (nombre.equals("")) {
            throw new Exc("Nombre inválido.");
        }
        this.nombre = nombre;
    }

    public ArrayList<Método> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Método> metodos) {
        this.metodos = metodos;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
