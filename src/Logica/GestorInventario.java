package Logica;

import Modelo.Categoria;
import Modelo.Producto;
import Utilidades.Utilidades;

import java.util.ArrayList;

public class GestorInventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    private boolean prueba;

    public GestorInventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public void agnadirProducto(Producto producto) {
        productos.add(producto);
        Utilidades.mostrar("Agnadido producto con id: "+producto.getId());
    }

    public Producto buscarPorId(int id) {
        for (int i = 0; i<productos.size(); i++) {
            if (id == productos.get(i).getId()){
                return productos.get(i);
            }
        }
        Utilidades.mostrar("No existe el producto con id: "+id);
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
        Utilidades.mostrar("Eliminando producto: "+id);
        productos.remove(encontrado);
        return true;
    }

    public void mostrarTodo(){
        if (productos.isEmpty()){
            Utilidades.mostrar("El inventario está vacío actualmente");
        }
        else {
            Utilidades.mostrar("--- LISTA DE PRODUCTOS EN STOCK ---");
            for (int i = 0; i<productos.size(); i++) {
                Utilidades.mostrar(productos.get(i).toString());
            }
            Utilidades.mostrar("--- Se han mostrado "+productos.size()+" productos ---");
        }
    }

    public void actualizarStock(int id, int stockNuevo) {
        buscarPorId(id).setStock(stockNuevo);
    }

    public void actualizarPrecio(int id, double precioNuevo) {
        buscarPorId(id).setPrecio(precioNuevo);
    }

    public void actualizarNombre(int id, String nombreNuevo) {
        Producto producto = buscarPorId(id);
        for (Producto p : productos) {
            if (p.getNombre().equals(nombreNuevo) && p.getCategoria().equals(producto.getCategoria())) {
                Utilidades.mostrar("Ya existe un producto con ese nombre con id: "+p.getId());
                prueba = false;
                break;
            }
            else  {
                prueba = true;

            }
        }
        if (prueba){
            producto.setNombre(nombreNuevo);
        }
    }

    public void actualizarCategoria(int id, Categoria categoriaNueva) {
        Producto producto = buscarPorId(id);
        for (Producto p : productos) {
            if (p.getNombre().equals(producto.getNombre()) && p.getCategoria().equals(categoriaNueva)) {
                Utilidades.mostrar("Ya existe un producto con esa categoria con id: "+p.getId());
                prueba = false;
                break;
            }
            else  {
                prueba = true;
            }
        }
        if (prueba){
            producto.setCategoria(categoriaNueva);
        }
    }
}
