package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public static double calcularSumatoria(double n) {
		double sumatoria = 0;

		for (int k = 1; k <= n; k++) {
			double termino = (k * (k + 1) / 2);
			double terminoCuadrado = Math.pow(termino, 2);
	        sumatoria += terminoCuadrado;
		}
		return sumatoria;
	}

	public static double calcularProductoria(double n) {
		int productoria = 1;

		for (int k = 1; k <= n; k++) {
			int termino = k * (k + 4);
			productoria *= termino;
		}
		return productoria;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
