/**
 * EjerciciosPOJO.java
 */
package com.heinsohn.semillero.pojo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>Descripción:<b> Clase que determina <b>Caso de Uso:<b>
 * 
 * @author Dave
 * @version
 */
public class EjerciciosPOJO {

	private ArrayList<Integer> listaEjercicio5;
	private Map<String, ArrayList<Integer>> partido;

	/**
	 * Constructor de la clase.
	 */
	public EjerciciosPOJO() {
		listaEjercicio5 = new ArrayList<Integer>();
		partido = new HashMap<String, ArrayList<Integer>>();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Metodo encargado de probar si un numero es primo <b>Caso de Uso</b>
	 * 
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
	 * Metodo encargado de calcular la edad de una persona <b>Caso de Uso</b>
	 * 
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
	 * Metodo encargado de agregar elementos a la lista listaEjercicio5 <b>Caso de
	 * Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @param n
	 */
	public void agregarNumeroLista5(int n) {
		listaEjercicio5.add(n);
	}

	/**
	 * 
	 * Metodo encargado de ordenar la lista listaEjercicio5 <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 *
	 */
	public void organizarElementosLista5() {

		Collections.sort(listaEjercicio5);
	}

	/**
	 * 
	 * Metodo encargado de averiguar el ganador <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @return
	 */
	public String getGanador() {
		int sumaRoger = 0;
		int sumaDominic = 0;
		for (Integer puntos : partido.get("Roger Federer")) {
			sumaRoger = sumaRoger + puntos;
		}
		for (Integer puntos : partido.get("Dominic")) {
			sumaDominic = sumaDominic + puntos;
		}
		if (sumaDominic > sumaRoger) {
			return "Dominic";
		}
		return "Roger Federer";
	}

	/**
	 * 
	 * Metodo encargado de contar monedas
	 * <b>Caso de Uso</b>
	 * @author Dave
	 * 
	 * @param cambio
	 * @return
	 */
	public ArrayList<Integer> getCambioMonedas(int cambio) {
		ArrayList<Integer> monedas = new ArrayList<Integer>();
		//cantidad de monedas de 1000
		monedas.add(0);
		//cantidad de monedas de 500
		monedas.add(0);
		//cantidad de monedas de 200
		monedas.add(0);
		//cantidad de monedas de 100
		monedas.add(0);
		//cantidad de monedas de 50
		monedas.add(0);
		int cantidad = 0;
		while (cambio >= 1000) {
			cambio = cambio - 1000;
			monedas.set(0, monedas.get(0)+1);
		}
		while (cambio >= 500) {
			cambio = cambio - 500;
			monedas.set(0, monedas.get(1)+1);
		}
		while (cambio >= 200) {
			cambio = cambio - 200;
			monedas.set(0, monedas.get(2)+1);
		}
		while (cambio >= 100) {
			cambio = cambio - 100;
			monedas.set(0, monedas.get(3)+1);
		}
		while (cambio >= 50) {
			cambio = cambio - 50;
			monedas.set(0, monedas.get(4)+1);
		}
		return monedas;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo listaEjercicio5
	 * 
	 * @return El listaEjercicio5 asociado a la clase
	 */
	public ArrayList<Integer> getListaEjercicio5() {
		return listaEjercicio5;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo partido
	 * 
	 * @return El partido asociado a la clase
	 */
	public Map<String, ArrayList<Integer>> getPartido() {
		return partido;
	}
	
	/**
	 * 
	 * Metodo encargado de responder la pregunta 9
	 * <b>Caso de Uso</b>
	 * @author Dave
	 *
	 */
	public void ejercicio9(){
		//Opciones B y D
	}
	
	/**
	 * 
	 * Metodo encargado de obtener el siguiente numero
	 * <b>Caso de Uso</b>
	 * @author Dave
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public String getSiguienteNumero(String n1, String n2) {
		int digito1n1 = Integer.parseInt(n1.substring(0, 1));
		int digito2n1 = Integer.parseInt(n1.substring(1, 2));
		
		int numero1 = digito1n1 + digito2n1;
		
		int digito1n2 = Integer.parseInt(n2.substring(0, 1));
		int digito2n2 = Integer.parseInt(n2.substring(1, 2));
		
		int numero2 = digito1n2 + digito2n2;
		
		int numeroObjetivo = 0;
		String digito1 = "";
		String digito2 = "";
		while (numeroObjetivo != numero2+1) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if ((i+j) == (numero2+1)) {
						digito1 = String.valueOf(i);
						digito2 = String.valueOf(j);
						numeroObjetivo =  numero2+1;
					}
				}
			}
			
		}
		
		return digito1+digito2;
	}

}
