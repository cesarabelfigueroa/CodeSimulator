package Main;

import java.io.Serializable;
import java.util.ArrayList;

public class Tabla implements Serializable{

    private String nombre;
    private ArrayList<Campo> campos = new ArrayList();
    private boolean primarykey = false;

    public Tabla() {
    }

    public Tabla(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public boolean isPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(boolean primarykey) {
        this.primarykey = primarykey;
    }
}
