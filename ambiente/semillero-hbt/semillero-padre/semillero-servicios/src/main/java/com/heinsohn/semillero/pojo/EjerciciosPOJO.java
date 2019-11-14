/**
 * EjerciciosPOJO.java
 */
package com.heinsohn.semillero.pojo;

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
		if (n == 0) {
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

}
