package ar.edu.unju.fi.ejercicio11.main;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 40;
		int i = 2;
		
		for (; j >= 0 && j <= 441;) {
            System.out.print(j * i + " ");
            if (j == 440) {
                j--;
            } else {
                j -= 3;
            }
        }

        // Imprimir la secuencia descendente
        for (int k = 437; k >= 41; k -= 7) {
            System.out.print(k + " ");
		
        }}}
