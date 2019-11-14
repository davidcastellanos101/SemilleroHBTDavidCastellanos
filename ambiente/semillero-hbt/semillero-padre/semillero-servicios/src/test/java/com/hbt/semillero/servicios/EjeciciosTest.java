/**
 * EjeciciosTest.java
 */
package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Dave
 * @version 
 */
public class EjeciciosTest {
	
	private String brand;
	private boolean empty;
	
	@Test(enabled = true)
	public void ejercicio1() {
		//este es un identificador válido ya que empieza por una letra y no tiene palabras reservadas
		//String A$B;
		//este es un identificador válido ya que empieza por una letra y no tiene palabras reservadas
		//String _helloWorld; 
		//este no es un identificador valido ya que true es una palabra reservada
		//String true;
		//este no es un identificador valido ya que java es una palabra reservada
		//String java.lang;
		//este es un identificador válido ya que empieza por una letra y no tiene palabras reservadas
		//String pPublic;
		//este no es un identificador valido ya que empieza por un numero, loc ual no es permitido
		//String 1980S;
		
	}
	
	@Test(enabled = true)
	public void ejercicio2() {
		WaterBottle wb = new WaterBottle();
		System.out.println("Empty = "+ wb.empty());
		System.out.println(", Brand = " + wb.brand());	
		
		//este método gatillará un excelcion de tipo ClassNotFoundException ya que la clase WaterBottle no existe
	}

}
