/**
 * EjeciciosTest.java
 */
package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.heinsohn.semillero.pojo.EjerciciosPOJO;

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
	 * ejercicio 1
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
	 * ejercicio2
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
	 * ejercicio3
	 * Metodo encargado de probar el método esPrimo()
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio3() {
		EjerciciosPOJO ejercicios = new EjerciciosPOJO();
		int n1 = 5;
		int n2 = 222;
		int n3 = 0;
		Assert.assertTrue(ejercicios.esPrimo(n1)); //Esta prueba pasara exitosamente
		Assert.assertTrue(ejercicios.esPrimo(n2)); //Esta prueba no pasará, 222 no es primo
		Assert.assertTrue(ejercicios.esPrimo(n3)); //Esta prueba pasara exitosamente
	}

}
