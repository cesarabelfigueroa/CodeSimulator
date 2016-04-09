package Main;

import java.io.Serializable;

public class Campo implements Serializable {

    private String nombre;
    private boolean primaria;
    private boolean secundaria;
    private String tipo;
    private String referencia1 = "";
    private String referencia2 = "";
    
    public Campo() {
    }

    public Campo(String nombre, boolean primaria, boolean secundaria, String tipo) {
        this.nombre = nombre;
        this.primaria = primaria;
        this.secundaria = secundaria;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPrimaria() {
        return primaria;
    }

    public void setPrimaria(boolean primaria) {
        this.primaria = primaria;
    }

    public boolean isSecundaria() {
        return secundaria;
    }

    public void setSecundaria(boolean secundaria) {
        this.secundaria = secundaria;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String getReferencia1() {
        return referencia1;
    }

    public void setReferencia1(String referencia1) {
        this.referencia1 = referencia1;
    }

    public String getReferencia2() {
        return referencia2;
    }

    public void setReferencia2(String referencia2) {
        this.referencia2 = referencia2;
    }
}
