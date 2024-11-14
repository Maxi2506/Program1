package Servicios;

import Entidades.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class libroServicio{

    Scanner s = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro(){
        String nombre;
        String autor;
        int cantidad;
        System.out.println("Ingrese el nombre del libro: ");
        nombre = s.next();
        System.out.println("Ingrese el nombre del autor: ");
        autor = s.next();
        System.out.println("Ingrese la cantidad de libros: ");
        cantidad = s.nextInt();
        Libro l1 = new Libro(nombre, autor,cantidad);
        return l1;
    }

    public List<String> guardarLibros(Libro l1){
         List<String> nombre = new ArrayList<>();
         if(l1 != null){
             nombre.add(l1.getNombre());
         }
         return nombre;
    }

    public List<Libro> BuscarPorAutor(List<Libro> libros){
        System.out.println("Ingrese el nombre del autor que desea buscar: ");
        String nombre = s.next();
        int contador = 1;
        for(Libro l1 : libros){
            if(nombre.equals(l1.getAutor())){
                System.out.println("Los registro de libros con el autor seleccionado son: ");
                System.out.println(contador + " - " + l1.getNombre());
            } else {
                System.out.println("Actualmente no poseemos libros del autor que busca.");
            }
        }
        return libros;
    }

}
