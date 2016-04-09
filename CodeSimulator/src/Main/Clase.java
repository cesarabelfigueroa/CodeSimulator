package Main;

import java.io.Serializable;
import java.util.ArrayList;

public class Clase implements Serializable {

    private String nombre;
    private ArrayList<Atributo> atributos = new ArrayList();
    private ArrayList<Interface> interfaces = new ArrayList();
    private ArrayList<Método> métodos = new ArrayList();
    private Clase padre;
    private String visibilidad = "";
    private boolean abstracto = false;

    public Clase() {
    }

    public Clase(String nombre, Clase padre, boolean abstracto) {
        this.nombre = nombre;
        this.padre = padre;
        this.abstracto = abstracto;
    }

    public void createConstructor() {
        Método constructor = new Método(nombre, "", "", "public", false);
        String cuerpo = "";
        Método constructorS = new Método(nombre, "", "", "\tpublic", false);
        for (Atributo atributo : atributos) {
            cuerpo += "this." + atributo.getNombre() + " = " + atributo.getNombre() + ";";
            cuerpo += "\r\n";
            constructorS.getParametros().add(atributo);
        }
        if (padre != null) {
            for (Atributo atributo : padre.getAtributos()) {
                cuerpo += "\t\tsuper." + atributo.getNombre() + " = " + atributo.getNombre() + ";";
                cuerpo += "\r\n";
                constructorS.getParametros().add(atributo);
            }

        }
        constructorS.setCuerpo(cuerpo);
        métodos.add(0, constructor);
        if (!atributos.isEmpty()) {
            métodos.add(1, constructorS);
        }
    }

    public void GetterAndSetters() {
        for (Atributo atributo : atributos) {
            String nombre = "get";
            for (int i = 0; i < atributo.getNombre().length(); i++) {
                if (i == 0) {
                    nombre += (atributo.getNombre().charAt(0) + "").toUpperCase();
                } else {
                    nombre += atributo.getNombre().charAt(i);
                }
            }
            System.out.println(nombre);
            String retorno = atributo.getTipo();
            String cuerpo = "return " + atributo.getNombre() + ";";
            Método get = new Método(nombre, retorno, cuerpo, "public", false);
            nombre = "set";
            for (int i = 0; i < atributo.getNombre().length(); i++) {
                if (i == 0) {
                    nombre += (atributo.getNombre().charAt(i) + "").toUpperCase();
                } else {
                    nombre += atributo.getNombre().charAt(i);
                }
            }
            retorno = "void";
            cuerpo = "this." + atributo.getNombre() + " = " + atributo.getNombre() + ";";
            Método set = new Método(nombre, retorno, cuerpo, "public", false);
            set.getParametros().add(atributo);
            métodos.add(get);
            métodos.add(set);
        }
    }

    public void setToString() {
        Método toString = new Método("toString", "String", "return  \"" + nombre + "\";", "public", false, true);
        if (métodos.indexOf(toString) == -1) {
            métodos.add(toString);
        }
    }

    public Clase(boolean abstracto) {
        this.abstracto = abstracto;
    }

    public boolean isAbtracto() {
        return abstracto;
    }

    public void setAbstracto(boolean abstracto) {
        this.abstracto = abstracto;
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

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;

    }

    public ArrayList<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(ArrayList<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public ArrayList<Método> getMétodos() {
        return métodos;
    }

    public void setMétodos(ArrayList<Método> métodos) {
        this.métodos = métodos;
    }

    public Clase getPadre() {
        return padre;
    }

    public void setPadre(Clase padre) {
        this.padre = padre;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
