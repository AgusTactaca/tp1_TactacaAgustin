package ar.edu.unju.fi.ejercicio5.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Ingrese un número para calcular su tabla de multiplicacion (debe estar en el rango [1,9]):");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 9) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            for (int i = 0; i <= 10; i++) {
            	int multiplicacion = numero * i;
            	System.out.println(numero + " + " + i + " = " + multiplicacion);
            }
        }

        sc.close();
	}

}
