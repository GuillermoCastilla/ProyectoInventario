package Ejecucion;

import Logica.GestorInventario;
import Modelo.Categoria;
import Modelo.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList();
        GestorInventario g = new GestorInventario(productos);
        g.agnadirProducto(new  Producto("Hola", 30, 3, Categoria.HOGAR));
        g.agnadirProducto(new  Producto("Adios", 20, 3, Categoria.ELECTRONICAS));
        g.agnadirProducto(new  Producto("Chao", 10, 3, Categoria.ALIMENTACION));
        g.mostrarTodo();
        g.agnadirProducto(new  Producto("Hola", 30, 3, Categoria.HOGAR));
        g.mostrarTodo();
        g.actualizarStock(1, 6);
        g.mostrarTodo();

    }
}
