package Ejecucion;

import Logica.GestorInventario;
import Menu.Menu;
import Modelo.Producto;
import Utilidades.Utilidades;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(new GestorInventario(new ArrayList<Producto>()));
        menu.menu(menu.opcion());

    }
}
