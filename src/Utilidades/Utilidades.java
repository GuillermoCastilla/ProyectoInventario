package Utilidades;

import java.util.*;

public class Utilidades {
    
    private static Scanner sc = new Scanner(System.in);

    public Utilidades() {}

    public void mostrar(String texto) {
        System.out.println(texto);
    }
    public void mostrar(int numero) {
        System.out.println(numero);
    }
    public void mostrar(float numero) {
        System.out.println(numero);
    }

    public String pedirPalabra(String texto) {
        String valor;
        do{
            mostrar(texto);
            try{
                valor = sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
                valor = "Sablasa";
            }
        } while (valor.equals("Sablasa"));
        return valor;
    }

    public double pedirValoresD(String texto) {
        double valor;
        do{
            mostrar(texto);
            try{
                valor = sc.nextDouble();
            } catch (Exception e) {
                sc.nextLine();
                valor = -123456789;
            }
        } while (valor ==-123456789);
        return valor;
    }

    public int pedirValores(String texto) {
        int valor;
        do{
            mostrar(texto);
            try{
                valor = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                valor = -123456789;
            }
        } while (valor ==-123456789);
        return valor;
    }

    /*public static double pedirValores2(String texto) {
        mostrar(texto);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }*/

    public int pedirValores(String texto, int max) {
        int valor;

        do {
            mostrar(texto);
            valor = sc.nextInt();
        } while (valor > max);
        return valor;
    }

    public int pedirValores(String texto, int max, int min) {
        int valor;

        do {
            mostrar(texto);
            valor = sc.nextInt();

        } while (valor > max || valor < min);

        return valor;

    }

    public int pedirValores(int min, String texto) {
        int valor = 0;

        do {
            mostrar(texto);
            valor = sc.nextInt();

        } while (valor < min);
        return valor;
    }
}