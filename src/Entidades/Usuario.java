package Entidades;

public class Usuario extends Persona{

    private int id;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, int contacto, String correo) {
        super(nombre, apellido, dni, contacto, correo);
    }

    @Override
    public String toString() {
        return " nombre: " + super.getNombre() + " apellido: " + super.getApellido() + " DNI: " + super.getDni() + " correo: " + super.getCorreo();
    }
}
