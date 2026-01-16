package Ejecucion;
import Logica.GestorInventario;
import Menu.Menu;
import Modelo.Producto;
import Persistencia.GestorFicheros;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        GestorFicheros gf = new GestorFicheros();
        gf.cargar("Inventario.csv");
        ArrayList<Producto> productos = new ArrayList<>();
        Menu menu = new Menu(new GestorInventario(productos));
        menu.menu();
        gf.escribirFichero(productos);

    }
}
