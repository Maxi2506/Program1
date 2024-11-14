package Entidades;

public class Libro{

    private String nombre;
    private String autor;
    private int cantidad;

    public Libro() {
    }

    public Libro(String nombre, String autor, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "nombre del libro: '" + nombre + " ,nombre del autor: " + autor + ", Cantidad: " + cantidad;
    }
}
