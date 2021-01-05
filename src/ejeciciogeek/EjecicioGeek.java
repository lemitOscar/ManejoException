package ejeciciogeek;

import java.util.Scanner;

public class EjecicioGeek {

    public static void main(String[] args) {

        int v1, v2, res;
        Scanner kate = new Scanner(System.in);
        while (true) {
            System.out.print("ingresa primer numero: ");
            v1 = kate.nextInt();
            boolean bandera = true;//por si cambia
            System.out.print("ingresa segundo numero : ");
            while (bandera) {
                try {
                    bandera = false;
                    v2 = kate.nextInt();
                    res = v1 / v2;
                    System.out.println("el resultado es: --->" + res);
                } catch (Exception e) {
                    System.out.println("error " + e);
                    System.out.print("repite el valor: ");
                    v2 = kate.nextInt();
                    res = v1 / v2;
                    System.out.println("el resultado es: " + res);
                } finally {
                    System.out.println("...");
                }
            }
        }

    }
}
