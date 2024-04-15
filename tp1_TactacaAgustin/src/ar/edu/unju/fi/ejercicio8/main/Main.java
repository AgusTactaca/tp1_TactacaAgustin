package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        
        double sumatoria = calculadora.calcularSumatoria(n);
        double productoria = calculadora.calcularProductoria(n);

        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("La productoria es: " + productoria);

        sc.close(); 
    }
}
