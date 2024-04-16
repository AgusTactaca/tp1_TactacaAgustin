package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Construir 3 objetos de la clase Producto
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos para el producto " + i + ":");
            Producto producto = new Producto();

            System.out.print("Nombre: ");
            producto.setNombre(sc.nextLine());

            System.out.print("Código: ");
            producto.setCodigo(Integer.parseInt(sc.nextLine()));

            System.out.print("Precio: ");
            producto.setPrecio(Double.parseDouble(sc.nextLine()));

            System.out.print("Descuento (%): ");
            producto.setDescuento(Integer.parseInt(sc.nextLine()));

            // Mostrar los datos ingresados y el resultado del cálculo del descuento
            System.out.println("\nDatos del producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento (%): " + producto.getDescuento());
            System.out.println("Precio con descuento: " + producto.calcularDescuento() + "\n");
        }

        sc.close();
	}

}
