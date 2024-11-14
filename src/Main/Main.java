package Main;

import Entidades.Libro;
import Entidades.Usuario;
import Servicios.libroServicio;
import Servicios.prestamoServicio;
import Servicios.usuarioServicio;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in).useDelimiter("\n");
        libroServicio l1 = new libroServicio();
        usuarioServicio u1 = new usuarioServicio();
        prestamoServicio p1 = new prestamoServicio();
        List<Libro> libros = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        HashMap<String,Integer> clientes = new HashMap<>();

        int op = 0;
        while(op!=8){
            System.out.println("MENU");
            System.out.println("1. Ingresar usuarios.");
            System.out.println("2. Ingresar libros.");
            System.out.println("3. Mostrar lista de libros");
            System.out.println("4. Mostrar lista de clientes");
            System.out.println("5. Seleccionar libro y cliente");
            System.out.println("6. Mostrar clientes y libros seleccionados.");
            System.out.println("7. Buscar libros por autor.");
            System.out.println("8. Finalizar Programa.");
            op = s.nextInt();
            System.out.println("");
            if(op == 1){
                usuarios.add(u1.ingresarUsuarios());
                System.out.println("Ingrese nuevamente una opción");
                System.out.println();
            }
            if(op == 2){
                libros.add(l1.crearLibro());
                System.out.println("Ingrese nuevamente una opción");
                System.out.println();
            }
            if(op == 3){
                int contador = 1;
                System.out.println("Lista de libros: ");
                for(Libro i : libros){
                    System.out.println(contador + " - nombre: " + i.getNombre() + " - autor: " + i.getAutor() + " - cantidad: " + i.getCantidad());
                    contador ++;
                }
                System.out.println("Ingrese nuevamente una opción");
                System.out.println();
            }
            if(op == 4){
                int contador = 1;
                System.out.println("Lista de clientes: ");
                for(Usuario i : usuarios){
                    System.out.println(contador + " - nombre y apellido: " + i.getNombre() + " " + i.getApellido() + " - DNI: " + i.getDni() + " - correo: " + i.getCorreo() + " - contacto: " + i.getContacto());
                    contador ++;
                }
                System.out.println("Ingrese nuevamente una opción");
                System.out.println();
            }
            if(op == 5){
                p1.seleccionar(libros, usuarios, clientes);
                System.out.println("Ingrese nuevamente una opción");
                System.out.println();
            }
            if(op == 6){
                p1.registro(clientes);
                System.out.print("Ingrese una opción:");
                System.out.println();
            }
            if(op == 7){
                l1.BuscarPorAutor(libros);
                System.out.print("Ingrese una opción:");
                System.out.println();
            }
            if(op == 8){
                System.out.println("Programa Finalizado");
                break;
            }
        }
    }
}