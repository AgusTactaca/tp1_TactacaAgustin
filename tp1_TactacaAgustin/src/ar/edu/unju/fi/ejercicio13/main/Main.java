package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Crear un array de 8 elementos
        int[] array = new int[8];

        // Pedir al usuario que ingrese los valores
        System.out.println("Ingrese 8 numeros enteros:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Mostrar por consola el índice y el valor almacenado en esa posición
        System.out.println("Elementos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]);
        }

        scanner.close();
	}

}
