package Persistencia;

import Modelo.Categoria;
import Modelo.Producto;
import Utilidades.Utilidades;

import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {

    public Categoria conversionCategoria(String categoria){
        if (categoria.equals("ELECTRONICAS")){
            return Categoria.ELECTRONICAS;
        }
        else if (categoria.equals("ALIMENTACION")){
            return Categoria.ALIMENTACION;
        }
        else if (categoria.equals("HOGAR")) {
            return Categoria.HOGAR;
        }
        else {
            return Categoria.OTROS;
        }
    }
    public ArrayList<Producto> cargar(String archivo) throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(archivo));
        String linea;
        String[] partes = new String[5];
        ArrayList <Producto> productos = new ArrayList<>();

        while ((linea = bReader.readLine()) !=null){
            partes = linea.split(";");
            //productos.add(new Producto(Integer.parseInt(partes[0]), partes[1], Double.parseDouble(partes[2]), Integer.parseInt(partes[3]), conversionCategoria(partes[4])));
        }
        return productos;
    }
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
}
