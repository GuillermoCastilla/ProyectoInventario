package Persistencia;

import Modelo.Producto;
import Utilidades.Utilidades;

import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {

    public void escribirFichero(ArrayList<Producto> productos) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Inventario.csv"))){
            for (Producto p : productos) {
                writer.write(p.toCSV());
                writer.newLine();
            }
        }catch(Exception e){
            Utilidades.mostrar("Error al escribir el fichero");
        }
    }
    public void p(){

    }

}
