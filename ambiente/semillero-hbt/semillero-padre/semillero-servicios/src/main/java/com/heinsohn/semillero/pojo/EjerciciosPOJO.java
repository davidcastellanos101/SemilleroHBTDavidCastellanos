/**
 * EjerciciosPOJO.java
 */
package com.heinsohn.semillero.pojo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Dave
 * @version 
 */
public class EjerciciosPOJO {
	
	private ArrayList<Integer> listaEjercicio5; 
	
	
	
	/**
	 * Constructor de la clase.
	 */
	public EjerciciosPOJO() {
		listaEjercicio5 = new ArrayList<Integer>();
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
	public static int getAnios(LocalDate fechaNacimiento) {
		LocalDate fechaActual = LocalDate.now();
		int anioActual = fechaActual.getYear();
		int anioNacimiento = fechaNacimiento.getYear();
		
		return anioActual - anioNacimiento;
	}
	/**
	 * 
	 * Metodo encargado de agregar elementos a la lista listaEjercicio5
	 * <b>Caso de Uso</b>
	 * @author Dave
	 * 
	 * @param n
	 */
	public void agregarNumeroLista5(int n) {
		listaEjercicio5.add(n);
	}
	
	/**
	 * 
	 * Metodo encargado de ordenar la lista listaEjercicio5
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	public void organizarElementosLista5() {
		Collections.sort(listaEjercicio5);
	}

	/**
	 * Metodo encargado de retornar el valor del atributo listaEjercicio5
	 * @return El listaEjercicio5 asociado a la clase
	 */
	public ArrayList<Integer> getListaEjercicio5() {
		return listaEjercicio5;
	}

	
}
