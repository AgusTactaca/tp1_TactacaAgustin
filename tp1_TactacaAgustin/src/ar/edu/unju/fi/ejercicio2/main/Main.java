package ar.edu.unju.fi.ejercicio2.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombrePais = "Argentina";
		byte edadPersona = 86;
		short alturaEdificio = 828;
		float precioProducto = 1999.99F;
		String numeroTelefono = "3884919249";
		double grados = 0.5;
		double radianes = Math.toRadians(grados);
		double coseno = Math.cos(radianes);
		
		System.out.println("Nombre del país: " + nombrePais);
        System.out.println("Edad de la persona: " + edadPersona + " años");
        System.out.println("Altura del edificio: " + alturaEdificio + " metros");
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Coseno de 0.5: " + coseno);
		
	}

}
