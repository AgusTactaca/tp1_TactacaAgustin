package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
    private int codigo;
    private double precio;
    private int descuento;

    public Producto() {
		// TODO Auto-generated constructor stub
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        double precioConDescuento = precio * (1 - (descuento / 100.0));
        return precioConDescuento;
    }
}
