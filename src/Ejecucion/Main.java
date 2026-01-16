package Ejecucion;

import Logica.GestorInventario;
import Menu.Menu;
import Modelo.Producto;
import Modelo.Persistencia.GestorFicheros;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        GestorFicheros.escribirFichero(Menu.menu(new GestorInventario(GestorFicheros.cargar("Inventario.csv"))));
    }
}
