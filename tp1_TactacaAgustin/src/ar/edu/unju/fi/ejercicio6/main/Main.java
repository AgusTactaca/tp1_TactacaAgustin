package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese los datos de la persona (dni, nombre, fecha de nacimiento, provincia):");
		Persona persona1 = new Persona();
		String dni = scanner.nextLine();
		persona1.setDni(dni);
        String nombre = scanner.nextLine();
        persona1.setNombre(nombre);
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        persona1.setFechaDeNacimiento(fechaNacimiento);
        String provincia = scanner.nextLine();
        persona1.setProvincia(provincia);
        persona1.mostrarDatos();
        
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        persona2.mostrarDatos();
        
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        persona3.mostrarDatos();
        

		scanner.close();
	}
}
