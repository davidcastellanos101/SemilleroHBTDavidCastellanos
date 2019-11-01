/**
 * GestionarComicPOJO.java
 */
package com.heinsohn.semillero.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que determina <b>Caso de Uso:<b>
 * 
 * @author David Castellanos
 * @version
 */
public class GestionarComicPOJO {
	private List<ComicDTO> listaComics = null;

	/**
	 * 
	 * Constructor de la clase <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 * 
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematica
	 * @param coleccion
	 * @param numeroPaginas
	 * @param precio
	 * @param autores
	 * @param acolor
	 * @param fechaVenta
	 * @param estado
	 * @param cantidad
	 * @return
	 */
	public ComicDTO crearComicDTO(String id, String nombre, String editorial, String tematica, String coleccion,
			Integer numeroPaginas, BigDecimal precio, String autores, Boolean acolor, LocalDate fechaVenta,
			String estado, Long cantidad) {

		ComicDTO newComicDTO = new ComicDTO(id, nombre, editorial, tematica, coleccion, numeroPaginas, precio, autores,
				acolor, fechaVenta, estado, cantidad);

		return newComicDTO;
	}

	/**
	 * 
	 * Metodo encargado de agregar un comic a la lista <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 * 
	 * @param comic
	 */
	public void agregarComicDTOLista(ComicDTO comic) {
		if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();
		}

		listaComics.add(comic);
	}

	/**
	 * 
	 * Metodo encargado de modificar un comic <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 * 
	 * @param id
	 * @param nuevoNombre
	 */
	public void modificarNombreComicDTO(String id, String nuevoNombre) {
		ComicDTO objetoComic = null;
		for (int i = 0; i < listaComics.size(); i++) {
			objetoComic = listaComics.get(i);
			if (objetoComic.getId().equals(id)) {
				objetoComic.setNombre(nuevoNombre);
				return;
			}

		}
	}

	/**
	 * 
	 * Metodo encargado de buscar un comic <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 * 
	 * @param id
	 */
	public ComicDTO buscarComicDTO(String id) {
		for (ComicDTO comicDTO : listaComics) {
			if (comicDTO.getId().equals(id)) {
				return comicDTO;
			}
		}
		return null;
	}

	/**
	 * 
	 * Metodo encargado de elimnar un comic de la lista <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 * 
	 * @param id
	 */
	public void eliminarComicDTO(String id) {
		ComicDTO objetoComic;
		while (listaComics.iterator().hasNext()) {
			objetoComic = listaComics.iterator().next();
			if (objetoComic.getId().equals(id)) {
				listaComics.remove(objetoComic);
				return;
			}

		}
	}

	/**
	 * Metodo encargado de retornar el valor del atributo listaComics
	 * 
	 * @return El listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo listaComics
	 * 
	 * @param listaComics El nuevo listaComics a modificar.
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}

}
