package Main;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

public class Binario implements Serializable {

    private DefaultMutableTreeNode uml;
    private DefaultMutableTreeNode sql;
    private ArrayList<Interface> interfaces = new ArrayList();
    private ArrayList<Tabla> tablas = new ArrayList();
    private ArrayList<Clase> clases = new ArrayList();

    public Binario(DefaultMutableTreeNode uml, DefaultMutableTreeNode sql, ArrayList<Interface> interfaces, ArrayList<Tabla> tablas, ArrayList<Clase> clases) {
        this.uml = uml;
        this.sql = sql;
        this.interfaces = interfaces;
        this.tablas = tablas;
        this.clases = clases;
    }

    public DefaultMutableTreeNode getUml() {
        return uml;
    }

    public void setUml(DefaultMutableTreeNode uml) {
        this.uml = uml;
    }

    public DefaultMutableTreeNode getSql() {
        return sql;
    }

    public void setSql(DefaultMutableTreeNode sql) {
        this.sql = sql;
    }

    public ArrayList<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(ArrayList<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tabla> tablas) {
        this.tablas = tablas;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

}
