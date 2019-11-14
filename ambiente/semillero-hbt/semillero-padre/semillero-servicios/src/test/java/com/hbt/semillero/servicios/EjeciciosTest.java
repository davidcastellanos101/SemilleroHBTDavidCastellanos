/**
 * EjeciciosTest.java
 */
package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * <b>Descripción:<b> Clase que determina <b>Caso de Uso:<b>
 * 
 * @author Dave
 * @version
 */
public class EjeciciosTest {

	private String brand;
	private boolean empty;

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio1() {
		// este es un identificador válido ya que empieza por una letra y no tiene
		// palabras reservadas
		// String A$B;
		// este es un identificador válido ya que empieza por una letra y no tiene
		// palabras reservadas
		// String _helloWorld;
		// este no es un identificador valido ya que true es una palabra reservada
		// String true;
		// este no es un identificador valido ya que java es una palabra reservada
		// String java.lang;
		// este es un identificador válido ya que empieza por una letra y no tiene
		// palabras reservadas
		// String pPublic;
		// este no es un identificador valido ya que empieza por un numero, loc ual no
		// es permitido
		// String 1980S;

	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio2() {
		// WaterBottle wb = new WaterBottle();
		empty = true;
		brand = "brand";
		System.out.print("Empty = " + empty);
		System.out.print(", Brand = " + brand);

		// salida:
		// Empty = true, Brand = empty
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
		int contador = 0;

		for (int i = 1; i <= n; i++) {
			if ((n % i) == 0) {
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
	 * Metodo encargado de probar el método esPrimo()
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio3() {
		int n1 = 5;
		int n2 = 222;
		int n3 = 0;
		Assert.assertTrue(esPrimo(n1)); //Esta pruba pasara exitosamente
		Assert.assertTrue(esPrimo(n2)); //Esta prueba no pasará, 222 no es primo
		Assert.assertTrue(esPrimo(n3)); //Esta pruba pasara exitosamente
	}

}
