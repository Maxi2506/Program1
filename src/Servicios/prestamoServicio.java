package Servicios;

import Entidades.Libro;
import Entidades.Usuario;

import java.util.*;

public class prestamoServicio {

    Scanner s = new Scanner(System.in).useDelimiter("\n");

    public HashMap<String,Integer> seleccionar(List<Libro> libros, List<Usuario> usuarios, HashMap<String,Integer> clientes){
        String nombreLibro1;
        int DNIusuario1;

        System.out.println("Ingrese el nombre del libro que desea buscar: ");
        nombreLibro1 = s.next().toLowerCase(Locale.ROOT);

        for(Libro i : libros){
            if(nombreLibro1.equals(i.getNombre())){
                System.out.println("El libro se encuentra disponible");
                if (i.getCantidad() > 0) {
                   i.setCantidad(i.getCantidad()-1); // Restar una unidad del libro
                    break;
                }
            }else {
                System.out.println("Acutalmente no contamos con el libro que busca");
                break;
            }
        }

        System.out.println("Ingrese el DNI del usuario que solicita: ");
        DNIusuario1 = s.nextInt();

        for(Usuario i : usuarios){
            if(DNIusuario1 == i.getDni()){
                System.out.println("El usuario se encuentra registrado");
                System.out.println("Ya puede retirar el libro");
            } else {
                System.out.println("El usuario no se encuentra registrado");
            }
        }
        clientes.put(nombreLibro1,DNIusuario1);
        return clientes;
    }

    public HashMap<String,Integer> registro(HashMap<String,Integer> clientes){
        for (Map.Entry<String, Integer> entry : clientes.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Nombre del Libro: " + key + " es retirado por DNI usuario: " + value);
        }
        return clientes;
    }

}
