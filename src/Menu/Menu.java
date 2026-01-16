package Menu;

import Logica.GestorInventario;
import Modelo.Categoria;
import Modelo.Producto;
import Utilidades.Utilidades;

import java.util.ArrayList;

public class Menu {
    private static GestorInventario gestor;
    public Menu(GestorInventario gestor) {
        this.gestor = gestor;
    }

    private static int opcionCategoria(){
        return Utilidades.pedirValores("""
            --- Seleccion una categoria de producto ---
            1. Electrónica
            2. Alimentación
            3. Hogar
            4. Otros""", 4,1);
    }

    private static Categoria menuCategoria(int categoria){
        switch(categoria){
            case 1:
                return Categoria.ELECTRONICAS;
            case 2:
                return Categoria.ALIMENTACION;
            case 3:
                return Categoria.HOGAR;
            case 4:
                return Categoria.OTROS;
            default:
                return null;
        }
    }

    private static int opcion(){
        return Utilidades.pedirValores("""
            --- Seleccione una opcion ---
            1. Buscar por ID
            2. Agnadir producto
            3. Eliminar producto
            4. Mostrar todos los productos
            5. Salir del programa""", 5,1);
    }



    public static ArrayList<Producto> menu(GestorInventario gestorInventario){
        int opcion;
        do {
            opcion = opcion();
            switch (opcion){
                case 1:
                    gestor.mostrarProducto(Utilidades.pedirValores("Introduzca el ID del producto"));
                    break;
                case 2:
                    gestor.agnadirProducto(new Producto(
                            Utilidades.pedirPalabra("Introduzca el nombre del producto"),
                            Utilidades.pedirValoresD("Introduzca el precio del producto"),
                            Utilidades.pedirValores("Introduzca la cantidad de stock del producto"),
                            menuCategoria(opcionCategoria())));
                    break;
                case 3:
                    gestor.eliminarProducto(Utilidades.pedirValores("Introduzca el ID del producto"));
                    break;
                case 4:
                    gestor.mostrarTodo();
                    break;
                default:
                    Utilidades.mostrar("Saliendo del programa.");
                    break;
            }
        } while (opcion != 5);
        return gestor.getProductos();
    }
}
