package Ejecucion;

import Logica.GestorInventario;
import Menu.Menu;
import Modelo.Producto;
import Utilidades.Utilidades;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        GestorInventario gestor = new GestorInventario(productos);
        Menu menu = new Menu(gestor);
        menu.menu(menu.opcion());

    }
}
