package org.example;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    public void agregarLibro (Libro nuevoLibro){
        this.libros.add(nuevoLibro);
    }
    public void agregarUsuario (Usuario nuevoUsuario){
        this.usuarios.add(nuevoUsuario);
    }
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (libro.isDisponibilidad()) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            }
        }
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.isDisponibilidad()) {
            System.out.println("Se prestó el libro '" + libro.getTitulo() + "' a " + usuario.getNombre());
            libro.setDisponibilidad(false);
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible para préstamo.");
        }
    }
}



