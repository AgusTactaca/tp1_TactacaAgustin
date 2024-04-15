package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private double salario;
	
	public static final double SALARIO_MINIMO = 210000.00;
	public static final double AUMENTO_POR_MERITOS = 20000.00;
	
	public Empleado(String nombre, Integer legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
	}
	
	 public void mostrarDatos() {
	        System.out.println("Nombre del empleado: " + nombre);
	        System.out.println("Legajo: " + legajo);
	        System.out.println("Salario $: " + salario);
	    }
	 
	 public void darAumento() {
	        salario += AUMENTO_POR_MERITOS;
	    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getSalarioMinimo() {
		return SALARIO_MINIMO;
	}

	public static double getAumentoPorMeritos() {
		return AUMENTO_POR_MERITOS;
	}
	 
	 
	
}
