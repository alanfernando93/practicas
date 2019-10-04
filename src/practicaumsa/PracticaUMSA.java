/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaumsa;

import librerias.LeerDato;

/**
 *
 * @author almahu
 */
public class PracticaUMSA {

    public static void ejercicio_uno() {
        String apellido_uno, apellido_dos;
        System.out.print("Ingrese el primer apellido: ");
        apellido_uno = LeerDato.cadena();
        System.out.print("Ingrese el segundo apellido: ");
        apellido_dos = LeerDato.cadena();
        if (apellido_uno.equals(apellido_dos)) {
            System.out.println("Los apellidos son iguales");
        } else {
            System.out.print("Los apellidos no son iguales | ");
            System.out.println(apellido_uno.charAt(0) + " - " + apellido_dos.charAt(0));
        }
    }

    public static void ejercicio_dos() {
        String aux;
        do {
            System.out.print("Ingrese una palabra cualquiera: ");
            aux = LeerDato.cadena();
            if (aux.length() <= 9) {
                System.out.println("La cadena ingresada debe contar con las de caracteres");
            }
        } while (aux.length() <= 9);
        System.out.println("Mostrando los primeros 5 caracteres - " + aux.substring(0, 5));
    }

    public static void ejercicio_tres() {
        String cadena1, cadena2, cadenaIntercalada = "", aux;
        System.out.print("Escriba algo para la cadena 1: ");
        cadena1 = LeerDato.cadena();
        System.out.print("Escriba algo para la cadena 2: ");
        cadena2 = LeerDato.cadena();
        if (cadena2.length() < cadena1.length()) {
            aux = cadena2;
            cadena2 = cadena1;
            cadena1 = aux;
        }
        for (int i = 0; i < cadena1.length(); i++) {
            cadenaIntercalada += cadena1.substring(i, i + 1) + cadena2.substring(i, i + 1);
            if ((i + 1) == cadena1.length()) {
                cadenaIntercalada += cadena2.substring(i + 1);
            }
        }
        System.out.println("La cadena intercalada es - " + cadenaIntercalada);
    }

    public static void ejercicio_cuatro() {

        int contadorVocales[] = {0, 0, 0, 0, 0}, mayor;
        char vocales[] = {'a', 'e', 'i', 'o', 'u'}, cadenaArray[], vocal;
        String aux;
        do {
            System.out.print("Ingrese una palabra cualquiera: ");
            aux = LeerDato.cadena();
            if (aux.length() >= 100) {
                System.out.println("El limite de tamaño es de 100 caracteres");
            }
        } while (aux.length() >= 100);
        cadenaArray = aux.toCharArray();
        for (char letra : cadenaArray) {
            switch (letra) {
                case 'a':
                    contadorVocales[0] += 1;
                    break;
                case 'e':
                    contadorVocales[1] += 1;
                    break;
                case 'i':
                    contadorVocales[2] += 1;
                    break;
                case 'o':
                    contadorVocales[3] += 1;
                    break;
                case 'u':
                    contadorVocales[4] += 1;
                    break;
            }
        }
        mayor = contadorVocales[0];
        vocal = vocales[0];
        for (int i = 1; i < contadorVocales.length; i++) {
            if (contadorVocales[i] > mayor) {
                mayor = contadorVocales[i];
                vocal = vocales[i];
            }
        }
        System.out.println("La vocal " + vocal + " es la mas repetida, con " + mayor + " repeticiónes");
    }

    public static void ejercicio_cinco() {
        int dia, mes, anio;
        System.out.println("Ingrese una fecha en formato numeral (dd/mm/yyyy)");
        do {
            System.out.print("\t\tDia (1 - 30): ");
            dia = LeerDato.entero();
            if (dia < 1 || dia > 30) {
                System.out.println("El dia debe estar en el rango de 1 - 30");
            }
        } while (dia < 1 || dia > 30);
        do {
            System.out.print("\t\tMes (1 - 12): ");
            mes = LeerDato.entero();
            if (mes < 1 || mes > 12) {
                System.out.println("El mes debe estar en el rango de 1 - 12");
            }
        } while (mes < 1 || mes > 12);
        do {
            System.out.print("\t\tAño (1900 - 2019): ");
            anio = LeerDato.entero();
            if (anio < 1900 || anio > 2019) {
                System.out.println("El año debe estar en el rango de 1900 - 2019");
            }
        } while (anio < 1900 || anio > 2019);

        dia = dia + 1;
        if (dia > 30) {
            dia = 1;
            mes += 1;
        }
        if (mes > 12) {
            mes = 1;
            anio += 1;
        }
        System.out.println("Fecha del dia siguiente - " + dia + "/" + mes + "/" + anio);
    }

    public static void ejercicio_seis() {
        int grupo[] = {3, 5, 1, 3, 9, 44, 10, 2, 33, 7};
        int menor = grupo[0];
        for (int i = 1; i < grupo.length; i++) {
            if (grupo[i] < menor) {
                menor = grupo[i];
            }
        }
        System.out.println("El numero menor del grupo es: " + menor);
    }

    public static void ejercicio_siete() {
        int a, b, c, mayor;
        System.out.print("Ingrese primer numero: ");
        a = LeerDato.entero();
        System.out.print("Ingrese segundo numero: ");
        b = LeerDato.entero();
        System.out.print("Ingrese tercer numero: ");
        c = LeerDato.entero();
        if (a > b && a < c || a < b && a > c) {
            System.out.println("El numero intermedio es : " + a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println("El numero intermedio es : " + b);
        } else if (c > a && c < b || c < a && c > b) {
            System.out.println("El numero intermedio es : " + c);
        } else {
            System.out.println("No existe un numero intermedio");
        }
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("Orden descendente: " + a + " " + b + " " + c);
                } else {
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }
            } else {
                System.out.println("Orden descendente: " + c + " " + a + " " + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println("Orden descendente: " + b + " " + a + " " + c);
                } else {
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }
            } else {
                System.out.println("Orden descendente: " + c + " " + b + " " + a);
            }
        }
    }

    public static void ejercicio_ocho() {
        int sueldo = 0, horasTrabajadas, extras;
        System.out.print("Ingrese las horas de trabajo de un persona: ");
        horasTrabajadas = LeerDato.entero();
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * 16;
        } else if (horasTrabajadas > 40) {
            extras = horasTrabajadas - 40;
            sueldo = 16 * 40 + (extras * 20);
        }
        System.out.println("El sueldo de la persona sera de " + sueldo + "$");
    }

    public static void ejercicio_nueve() {
        /*
        Ejemplo
        5 examenes corrientes y 1 examen final donde
        los examenes corrientes tendran una ponderacion de 1 
        y el examen final una ponderacion de 5
         */
        float suma_notas = 0, suma_ponderados = 0, promedio;
        System.out.print("Ingrese cantidad de examenes: ");
        int n = LeerDato.entero();
        int notas[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nota del examen " + (i + 1) + ": ");
            notas[i] = LeerDato.entero();
        }
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                suma_ponderados += (n - 1);
                suma_notas += (notas[i] * (n - 1));
            } else {
                suma_ponderados += 1;
                suma_notas += (notas[i] * 1);
            }
        }
        promedio = suma_notas / suma_ponderados;
        System.out.println("El promedio ponderado de las notas es " + promedio);
    }

    public static void ejercicio_diez() {
        int numero;
        do {
            System.out.print("Ingrese un numero: ");
            numero = LeerDato.entero();
            if (numero >= 0) {
                System.out.println("El cuadrado del numero es: " + Math.pow(numero, 2));
            }
        } while (numero >= 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio_diez();
    }

}
