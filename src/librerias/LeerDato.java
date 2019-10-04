/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author almahu
 */
public class LeerDato {

    public static String cadena() {
        String aux = "";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            aux = br.readLine();
        } catch (IOException e) {
            System.out.println("ERROR FATAL" + e.getMessage());
        }
        return aux;
    }

    /*leer datos de tipo real*/
    public static float real() {
        boolean b = true;
        while (b) {
            try {
                Float A = new Float(cadena());
                b = false;
                return A.floatValue();
            } catch (NumberFormatException e) {
                System.out.println("deve ingresar un numero real");
                b = true;
            }
        }
        return Float.NaN;
    }


    /*leerdatos de tipo CARACTER*/
    public static char caracter() {
        char A;
        try {
            A = cadena().charAt(0);
            return A;
        } catch (Exception e) {
            System.out.println("deve ingresar un caracter");
            return '\0';
        }
    }


    /*leer datos de tipo real largo o doble*/
    public static double doble() {
        boolean b = true;
        while (b) {
            try {
                Double A = new Double(cadena());
                b = false;
                return A.doubleValue();
            } catch (NumberFormatException e) {
                System.out.println("deve ingresar un numero real largo");
                b = true;
            }
        }
        return Double.NaN;
    }


    /*operacion para leer enteros*/
    public static int entero() {
        String aux = "";
        boolean b = true;
        while (b) {
            try {
                aux = cadena();
                b = false;
                return (Integer.parseInt(aux));
            } catch (NumberFormatException e) {
                System.out.println("DEBE INGRESAR UN NUMERO ENTERO");
                b = true;
            }
        }
        return (Integer.MIN_VALUE);
    }


    /*operacion para leer enteros largos*/
    public static long enteroLargo() {
        String aux = "";
        boolean b = true;
        while (b) {
            try {
                aux = cadena();
                b = false;
                return (Long.parseLong(aux));
            } catch (NumberFormatException e) {
                System.out.println("DEBE INGRESAR UN NUMERO ENTERO LARGO");
                b = true;
            }
        }
        return (Long.MIN_VALUE);
    }

    /*operacion para leer enteros cortos*/
    public static short enteroCorto() {
        String aux = "";
        boolean b = true;
        while (b) {
            try {
                aux = cadena();
                b = false;
                return (Short.parseShort(aux));
            } catch (NumberFormatException e) {
                System.out.println("DEBE INGRESAR UN NUMERO ENTERO");
                b = true;
            }
        }
        return (Short.MIN_VALUE);
    }
}
