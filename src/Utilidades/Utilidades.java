package Utilidades;

import java.util.*;

public class Utilidades {
    
    private static Scanner sc = new Scanner(System.in);

    public Utilidades() {}

    public static void mostrar(String texto) {
        System.out.println(texto);
    }
    public static void mostrar(int numero) {
        System.out.println(numero);
    }
    public static void mostrar(float numero) {
        System.out.println(numero);
    }

    public static String pedirPalabra(String texto) {
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

    public static double pedirValoresD(String texto) {
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

    public static int pedirValores(String texto) {
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

    public static int pedirValores(String texto, int max) {
        int valor;

        do {
            mostrar(texto);
            valor = sc.nextInt();
        } while (valor > max);
        return valor;
    }

    public static int pedirValores(String texto, int max, int min) {
        int valor;

        do {
            mostrar(texto);
            valor = sc.nextInt();

        } while (valor > max || valor < min);

        return valor;

    }

    public static int pedirValores(int min, String texto) {
        int valor = 0;

        do {
            mostrar(texto);
            valor = sc.nextInt();

        } while (valor < min);
        return valor;
    }
}