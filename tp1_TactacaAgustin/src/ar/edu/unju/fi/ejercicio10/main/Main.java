package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("** Pizza " + i + " **");

            Pizza pizza = new Pizza();

            System.out.print("Ingrese el diámetro de la pizza (20, 30, 40): ");
            int diametro = Integer.parseInt(sc.nextLine());
            pizza.setDiametro(diametro);

            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
            boolean ingredientesEspeciales = Boolean.parseBoolean(sc.nextLine());
            pizza.setIngredientesEspeciales(ingredientesEspeciales);

            pizza.calcularPrecio();
            pizza.calcularArea();

            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea() + "\n");
        }

        sc.close();
	}

}
