package org.example;

public class Usuario {
    private String nombre;
    private int id;
    private static int idSig =0;

    public Usuario (String nombre){
        this.nombre = nombre;
        this.id = idSig++;

    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
