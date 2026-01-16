package Modelo;

import Utilidades.Utilidades;

import java.util.ArrayList;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;
    private static int contador;

    //Constructor vacio
    public Producto(){}

    //Constructor entero
    public Producto(String nombre, double precio, int stock, Categoria categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.id = ++contador;
    }

    //Constructor GestorFicheros
    public Producto(int id, String nombre, double precio, int stock, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
    //Getters/Setters(hasta linea 57)

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static int getContador() {
        return contador;
    }

    public void actualizarContador(ArrayList<Producto> producto) {
        try{
            this.id = producto.getLast().getId();
        }catch(Exception e){
            Utilidades.mostrar("ERROR." + e.getMessage());
        }

    }

    public static void setContador(int nuevoValor){
        contador = nuevoValor;
    }


    //Mostrar los detalles
    public String toString(){
        String detalles = (getId() + "|" +getNombre() + "|" + Math.abs(getPrecio()) + "|" + Math.abs(getStock()) + "|" + getCategoria());
        return detalles;
    }

    public String toCSV(){
        String detalles = (getId() + ";" +getNombre() + ";" + Math.abs(getPrecio()) + ";" + Math.abs(getStock()) + ";" + getCategoria());
        return detalles;
    }
}
