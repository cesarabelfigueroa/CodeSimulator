package Main;

import java.io.Serializable;
import java.util.ArrayList;

public class Método implements Serializable {

    private String nombre;
    private String retorno;
    private String cuerpo;
    private String visibilidad;
    private ArrayList<Atributo> parametros = new ArrayList();
    private boolean abstracto;
    private boolean overWrite = false;

    public Método() {
    }

    public Método(String nombre, String retorno, String cuerpo, String visibilidad, boolean abstracto) {
        this.overWrite = false;
        this.nombre = nombre;
        this.retorno = retorno;
        this.cuerpo = cuerpo;
        this.visibilidad = visibilidad;
        this.abstracto = abstracto;
    }

    public Método(String nombre, String retorno, String cuerpo, String visibilidad, boolean abstracto, boolean overWrite) {
        this.nombre = nombre;
        this.retorno = retorno;
        this.cuerpo = cuerpo;
        this.visibilidad = visibilidad;
        this.abstracto = abstracto;
        this.overWrite = overWrite;
    }

    public boolean isOverWrite() {
        return overWrite;
    }

    public void setOverWrite(boolean overWrite) {
        this.overWrite = overWrite;
    }

    public Método(boolean abstracto) {
        this.abstracto = abstracto;
    }

    public boolean isAbstracto() {
        return abstracto;
    }

    public void setAbstracto(boolean abstracto) {
        this.abstracto = abstracto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exc{
        if (nombre.equals("")) {
            throw new Exc("Nombre inválido.");
        }
        this.nombre = nombre;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public ArrayList<Atributo> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Atributo> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        String string;
        string = nombre + " (";
        for (int i = 0; i < this.parametros.size(); i++) {
            if (i != parametros.size() - 1) {
                string += parametros.get(i).getTipo() + " " + parametros.get(i).getNombre() + ", ";
            } else {
                string += parametros.get(i).getTipo() + " " + parametros.get(i).getNombre() + ")";
            }
        }
        if (parametros.isEmpty()) {
            string += ")";
        }
        return string;
    }
}
