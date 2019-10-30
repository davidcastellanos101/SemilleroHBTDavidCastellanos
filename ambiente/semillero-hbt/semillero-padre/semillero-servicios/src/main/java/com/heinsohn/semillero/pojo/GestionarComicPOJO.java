/**
 * GestionarComicPOJO.java
 */
package com.heinsohn.semillero.pojo;

import java.util.List;
import com.hbt.semillero.dto.ComicDTO;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author David Castellanos
 * @version 
 */
public class GestionarComicPOJO {
	private List<ComicDTO> listaComics = null;
	
	public void crearComicDTO() {
		ComicDTO newComicDTO = new ComicDTO();
		newComicDTO.setAcolor(true);
		newComicDTO.setAutores("Phillippe Briones, Roger Stern");
		newComicDTO.setCantidad(10L);
		newComicDTO.setColeccion("BIBLIOTECA MARVEL");
		newComicDTO.setEditorial("Panini Comics");
		newComicDTO.setEstado("Activo");
		
		// TODO continuar llenando la instancia
	}

	/**
	 * Metodo encargado de retornar el valor del atributo listaComics
	 * @return El listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo listaComics
	 * @param listaComics El nuevo listaComics a modificar.
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	} 
	
	
}
