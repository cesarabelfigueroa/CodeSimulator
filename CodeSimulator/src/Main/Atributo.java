package Main;

import java.io.Serializable;

public class Atributo implements Serializable {

    private String nombre;
    private String tipo;
    private String scope;
    private String valor;

    public Atributo() {
    }

    public Atributo(String nombre, String tipo, String scope, String valor) throws Exc{
        if (nombre.equals("")) {
            throw new Exc("Nombre inválido.");
        }
        this.nombre = nombre;
        this.tipo = tipo;
        this.scope = scope;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return tipo + " " + nombre;
    }

}
