import { Component, OnInit } from '@angular/core';
import { MiObjetoDTO } from '../../dto/mi-objeto.dto';

/**
 * @description Componente mostrarlista, el cual muestra el contenido de una lsita
 * 
 * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
 */
@Component({
    selector: 'mostrarlista',
    templateUrl: './mostrarlista-component.html',
})
export class MostrarListaComponent implements OnInit {

    /**
     * Lista que contendrá las instancias de MiObjetoDTO
     */
    public lista: Array<MiObjetoDTO>;

    /**
     * Cadena que contiene el contenido de la lista en formato JSON
     */
    public listaJSON: String;

    /**
     * Referencia del último objeto eliminado de la lista
     */
    public objetoEliminado: MiObjetoDTO;

    /**
     * Cadena que guarda el mensaje a mostrar por pantalla
     */
    public mensaje: String;

    /**
     * Booleano que indica si se debe imprimir el mensaje de éxito
     */
    public mostrarMensajeExito: boolean;

    /**
     * Constructor de la clase
     */
    constructor() {
        this.lista = new Array<MiObjetoDTO>();
        this.mostrarMensajeExito = false;
    }

    /**
     * Evento angular que se ejecuta al iniciar el componente
     */
    ngOnInit(): void {
        this.agregarInstancias();
    }

    /**
     * Método que elimina un objeto de la lista a partir de su índice
     * @param index índice del objeto a eliminar
     */
    public eliminarObjeto(index: number): void {
        if (index < this.lista.length && index >= 0) {
            this.objetoEliminado = this.lista[index];
            this.lista.splice(index, 1);
            this.listaJSON = JSON.stringify(this.lista, null, 2);
            this.mensaje = "Se ha eliminado el comic " + this.objetoEliminado.nombre;
            this.mostrarMensajeExito = true;
        } else {
            this.mensaje = "El comic con índice " + index + " no existe en la lista";
            this.mostrarMensajeExito = false;
        }
    }


    /**
     * Método que crea 5 instancias de MiObjetoDTO y las agrega a lista
     */
    private agregarInstancias(): void {
        let instancia1: MiObjetoDTO = new MiObjetoDTO();
        let instancia2: MiObjetoDTO = new MiObjetoDTO();
        let instancia3: MiObjetoDTO = new MiObjetoDTO();
        let instancia4: MiObjetoDTO = new MiObjetoDTO();
        let instancia5: MiObjetoDTO = new MiObjetoDTO();

        instancia1.id = 1;
        instancia1.nombre = "batman";
        instancia1.editorial = "marvel";
        instancia1.tematica = "accion";
        instancia1.numeroPaginas = 50;
        instancia1.precio = 60, 500.99;
        instancia1.autores = "Pedrito barrera";
        instancia1.aColor = true;
        instancia1.fechaVenta = new Date("10-10-2019");
        instancia1.estado = "activo";

        instancia2.id = 2;
        instancia2.nombre = "superman";
        instancia2.editorial = "dc";
        instancia2.tematica = "accion";
        instancia2.numeroPaginas = 150;
        instancia2.precio = 61, 600.85;
        instancia2.autores = "Juanito";
        instancia2.aColor = true;
        instancia2.fechaVenta = new Date("10-15-2019");
        instancia2.estado = "activo";

        instancia3.id = 3;
        instancia3.nombre = "ms marvel";
        instancia3.editorial = "marvel";
        instancia3.tematica = "accion";
        instancia3.numeroPaginas = 85;
        instancia3.precio = 61, 600.85;
        instancia3.autores = "Juanito";
        instancia3.aColor = true;
        instancia3.fechaVenta = new Date("10-15-2019");
        instancia3.estado = "activo";

        instancia4.id = 4;
        instancia4.nombre = "spiderman";
        instancia4.editorial = "marvel";
        instancia4.tematica = "accion";
        instancia4.numeroPaginas = 445;
        instancia4.precio = 99, 600.85;
        instancia4.autores = "Juanito";
        instancia4.aColor = true;
        instancia4.fechaVenta = new Date("10-15-2019");
        instancia4.estado = "activo";

        instancia5.id = 5;
        instancia5.nombre = "Nightwing";
        instancia5.editorial = "dc";
        instancia5.tematica = "accion";
        instancia5.numeroPaginas = 500;
        instancia5.precio = 11, 600.85;
        instancia5.autores = "Juanito";
        instancia5.aColor = true;
        instancia5.fechaVenta = new Date("10-15-2019");
        instancia5.estado = "activo";

        this.lista.push(instancia1);
        this.lista.push(instancia2);
        this.lista.push(instancia3);
        this.lista.push(instancia4);
        this.lista.push(instancia5);

        this.listaJSON = JSON.stringify(this.lista, null, 2);

    }



}