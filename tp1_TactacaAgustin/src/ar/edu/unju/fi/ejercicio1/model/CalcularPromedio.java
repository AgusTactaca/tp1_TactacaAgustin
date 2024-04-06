package ar.edu.unju.fi.ejercicio1.model;

import java.util.Scanner;

public class CalcularPromedio {
	
	public static double calcularPromedio() {
		
        Scanner scanner = new Scanner(System.in);
        // Pedimos la cantidad de numeros a ingresar
        System.out.println("Calculo de Promedio");
        System.out.println("¿Cuantos numeros quieres ingresar?");
        int cantidad = scanner.nextInt();

        // Inicializamos nuestra variable de suma
        int suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el " + i + "° numero: ");
            int num = scanner.nextInt();
            suma += num;
        }
        scanner.close();

        double promedio = (double) suma / cantidad;
        return promedio;
    }
}
