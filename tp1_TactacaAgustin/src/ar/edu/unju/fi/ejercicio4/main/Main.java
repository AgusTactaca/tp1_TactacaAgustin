package ar.edu.unju.fi.ejercicio4.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Ingrese un número para calcular su factorial (debe estar en el rango [0,10]):");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            int factorial = 1;
            int i = 1;

            while (i <= numero) {
                factorial *= i;
                i++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        sc.close();
    }
}

