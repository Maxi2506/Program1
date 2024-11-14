package Servicios;

import Entidades.Usuario;

import java.time.LocalDate;
import java.util.*;

public class usuarioServicio {

    Scanner s = new Scanner(System.in);
    private List<String[]> autores;

    public Usuario ingresarUsuarios(){
        String nombre;
        String apellido;
        int dni;
        int contacto;
        String correo;
        System.out.println("Ingrese su nombre: ");
        nombre = s.next();
        System.out.println("Ingrese su apellido: ");
        apellido = s.next();
        System.out.println("Ingrese su DNI: ");
        dni = s.nextInt();
        System.out.println("Ingrese su contacto: ");
        contacto = s.nextInt();
        System.out.println("Ingrese su correo electrónico: ");
        correo = s.next();
        Usuario u1 = new Usuario(nombre,apellido,dni,contacto,correo);
        return u1;
    }

    public List<String> guardarUsuarios(Usuario u1){
        List<String> nombre = new ArrayList<>();
        if(u1 != null){
            nombre.add(u1.getNombre());
        }
        return nombre;
    }

}
