package Entidades;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private int contacto;
    private String correo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, int contacto, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.contacto = contacto;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", apellido:'" + apellido + ", dni:" + dni + ", contacto:" + contacto + ", correo:'" + correo;
    }
}
