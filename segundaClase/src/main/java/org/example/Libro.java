package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponibilidad;

    public Libro (String titulo, String autor){

        this.autor=autor;
        this.titulo=titulo;
        this.disponibilidad=true;
    }

    public java.lang.String getTitulo() {
        return titulo;
    }

    public java.lang.String getAutor() {
        return autor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
