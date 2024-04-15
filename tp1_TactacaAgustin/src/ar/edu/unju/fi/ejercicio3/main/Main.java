package ar.edu.unju.fi.ejercicio3.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			numero = numero * 3;
			System.out.println("El numero ingresado es par, se muetras el triple del valor: " + numero);
		} else {
			numero = numero * 2;
			System.out.println("El numero ingresado es impar, se muetras el doble del valor: " + numero);
		}
	}

}
