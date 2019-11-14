/**
 * EjerciciosPOJO.java
 */
package com.heinsohn.semillero.pojo;

import java.time.LocalDate;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Dave
 * @version 
 */
public class EjerciciosPOJO {
	
	
	
	/**
	 * Constructor de la clase.
	 */
	public EjerciciosPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Metodo encargado de probar si un numero es primo
	 * <b>Caso de Uso</b>
	 * @author Dave
	 * 
	 * @param n
	 * @return
	 */
	public boolean esPrimo(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		int contador = 0;

		for (int i = 1; i <= n; i++) {
			int residuo = n % i;
			if (residuo == 0) {
				contador++;
			}
		}

		if (contador <= 2) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * Metodo encargado de calcular la edad de una persona
	 * <b>Caso de Uso</b>
	 * @author Dave
	 * 
	 * @param fechaNacimiento
	 * @return
	 */
	public int getAnios(LocalDate fechaNacimiento) {
		LocalDate fechaActual = LocalDate.now();
		int anioActual = fechaActual.getYear();
		int anioNacimiento = fechaNacimiento.getYear();
		
		return anioActual - anioNacimiento;
	}

}
