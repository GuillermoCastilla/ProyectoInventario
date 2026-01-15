package Logica;

import Modelo.Categoria;
import Modelo.Producto;
import Utilidades.Utilidades;

import java.util.ArrayList;

public class GestorInventario {
    private final Utilidades u = new Utilidades();
    private Producto product;
    private ArrayList<Producto> productos = new ArrayList<>();

    public GestorInventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public void agnadirProducto(Producto producto) {
        if (!productos.isEmpty()) {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getNombre().equals(producto.getNombre()) && productos.get(i).getPrecio() == producto.getPrecio() && productos.get(i).getCategoria() == producto.getCategoria()) {
                    actualizarStock(producto);
                }
            }
        }else{
            productos.add(producto);
        }
    }

    public Producto buscarPorId(int id) {
        for (int i = 0; i<productos.size(); i++) {
            if (id == productos.get(i).getId()){
                return productos.get(i);
            }
        }
        return null;
    }

    public boolean eliminarProducto(int id) {
        // 1. Buscamos el producto UNA SOLA VEZ y lo guardamos en una variable
        Producto encontrado = buscarPorId(id);

        // 2. Si es null, significa que no existe
        if (encontrado == null) {
            return false;
        }

        // 3. Si existe, lo borramos usando la variable que ya tiene el objeto
        productos.remove(encontrado);
        return true;
    }

    public void mostrarTodo(){
        if (productos.isEmpty()){
            u.mostrar("El inventario está vacío actualmente");
        }
        else {
            u.mostrar("--- LISTA DE PRODUCTOS EN STOCK ---");
            for (int i = 0; i<productos.size(); i++) {
                u.mostrar(productos.get(i).toString());
            }
            u.mostrar("--- Se han mostrado "+productos.size()+" productos ---");
        }
    }

    public void actualizarStock(Producto producto){
        if (!productos.isEmpty()){
            for (int i = 0; i<productos.size(); i++) {
                if (productos.get(i).getNombre().equals(producto.getNombre()) && productos.get(i).getPrecio() == producto.getPrecio() && productos.get(i).getCategoria() == producto.getCategoria()){
                    productos.get(i).setStock(productos.get(i).getStock()+1);
                }
            }
        }else{
            System.out.println("Debe primero añadir un producto.");
        }
    }
}
