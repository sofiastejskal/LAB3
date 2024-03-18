package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


      //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Crear libros
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("María");

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Agregar usuarios a la biblioteca
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();

        // Prestar un libro a un usuario
        biblioteca.prestarLibro(libro1, usuario1);

        // Mostrar libros disponibles después del préstamo
        biblioteca.mostrarLibrosDisponibles();

    }
}