/**
 * EjeciciosTest.java
 */
package com.hbt.semillero.servicios;

import java.time.LocalDate;
import java.util.ArrayList;

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
		Assert.assertTrue(ejercicios.esPrimo(n3)); //Esta prueba no pasará, 0 no es primo
	}
	
	/**
	 * ejercicio4
	 * Metodo encargado de probar el método getAnios()
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio4() {
		EjerciciosPOJO ejercicios = new EjerciciosPOJO();
		LocalDate fecha = LocalDate.of(1995, 3, 11);
		int anioActual = ejercicios.getAnios(fecha) + 1995;
		
		Assert.assertEquals(anioActual, 2019); //pasará la prueba

	}
	
	/**
	 * ejercicio5
	 * Metodo encargado de probar el orden de la lista listaEjercicio5
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio5() {
		EjerciciosPOJO ejercicios = new EjerciciosPOJO();
		int n1 = 50;
		int n2 = 1;
		int n3 = 249;
		int n4 = -2;
		ejercicios.agregarNumeroLista5(n1);
		ejercicios.agregarNumeroLista5(n2);
		ejercicios.agregarNumeroLista5(n3);
		ejercicios.agregarNumeroLista5(n4);
		
		ejercicios.organizarElementosLista5();
		ArrayList<Integer> lista = ejercicios.getListaEjercicio5();
		Assert.assertEquals(n4, lista.get(0).intValue()); //pasará la prueba
		Assert.assertEquals(n3, lista.get(lista.size()-1).intValue()); //pasará la prueba
		Assert.assertEquals(4, lista.size()); //pasará la prueba

	}
	
	/**
	 * ejercicio7
	 * Metodo encargado de probar el ganador
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio7() {
		EjerciciosPOJO ejercicios = new EjerciciosPOJO();
		//Se agregan los puntos de los sets
		ArrayList<Integer> setsRoger = new ArrayList<Integer>();
		setsRoger.add(3);
		setsRoger.add(2);
		//Se agregan los puntos de los sets
		ArrayList<Integer> setsDominic = new ArrayList<Integer>();
		setsDominic.add(6);
		setsDominic.add(2);
		
		//Se agregan los sets y los jugadores al mapa
		ejercicios.getPartido().put("Roger Federer", setsRoger);
		ejercicios.getPartido().put("Dominic", setsDominic);
		
		Assert.assertEquals(ejercicios.getGanador(), "Dominic");

	}
	
	/**
	 * ejercicio8
	 * Metodo encargado de probar el metodo de contar monedas
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio8() {
		EjerciciosPOJO ejercicios = new EjerciciosPOJO();
		ArrayList<Integer> monedas1000 = ejercicios.getCambioMonedas(1000);
		ArrayList<Integer> monedas5550 = ejercicios.getCambioMonedas(5550);
		Assert.assertEquals(monedas1000.size(), 1);
		Assert.assertEquals(monedas1000.get(0).intValue(), 1);
		
		Assert.assertEquals(monedas5550.size(), 7);
		Assert.assertEquals(monedas5550.get(1).intValue(), 1);
		Assert.assertEquals(monedas5550.get(4).intValue(), 1);

	}
	
	/**
	 * ejercicio11
	 * Metodo encargado de probar el metodo serie
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	@Test(enabled = true)
	public void ejercicio11() {
		EjerciciosPOJO ejercicios = new EjerciciosPOJO();
		
		Assert.assertEquals(ejercicios.getSiguienteNumero("80", "36"), "46");

	}
	
	
	

}
