package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el nombre del empleado:");
		String nombre = sc.nextLine();

		System.out.println("Ingrese el legajo:");
		Integer legajo = sc.nextInt();

		System.out.println("Ingrese el salario:");
		double salario = sc.nextDouble();

		Empleado empleado = new Empleado(nombre, legajo, salario);

		System.out.println("Datos del empleado:");
		empleado.mostrarDatos();

		empleado.darAumento();

		System.out.println("Después del aumento:");
		empleado.mostrarDatos();
		
		sc.close();
	}
}
