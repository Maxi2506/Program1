package Entidades;

public class Prestamo{

    Usuario usuario;
    Libro libro;
    int dias = 3;

    public Prestamo() {
    }

    public Prestamo(Usuario usuario, Libro libro, int dias) {
        this.usuario = usuario;
        this.libro = libro;
        this.dias = dias;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "usuario=" + usuario + ", libro=" + libro + ", dias=" + dias;
    }
}
