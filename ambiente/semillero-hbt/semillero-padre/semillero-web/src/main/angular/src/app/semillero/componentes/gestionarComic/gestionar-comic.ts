
import { ComicDTO } from '../../dto/comic.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

/**
 * @description Componenete gestionar comic, el cual contiene la logica CRUD
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
    selector: 'gestionar-comic',
    templateUrl: './gestionar-comic.html',
    styleUrls: ['./gestionar-comic.css']
})
export class GestionarComicComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     */
    public gestionarComicForm : FormGroup;

    /**
     * Atributo que contendra la informacion del comic
     */
    public comic: ComicDTO;

    /**
     * Atributo que contendra la lista de comics creados
     */
    public listaComics : Array<ComicDTO>;

    public idComic : number = 0;

    /**
     * Atributo que indica si se envio a validar el formulario
     */
    public submitted : boolean;

    /**
     * @description Este es el constructor del componente GestionarComicComponent
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    constructor(private fb : FormBuilder,
        private router : Router) {
            console.log("Ingreso al constructor");
        this.gestionarComicForm = this.fb.group({
            id: [null],
            nombre : [null, Validators.required],
            editorial : [null],
            tematica : [null],
            coleccion : [null],
            numeroPaginas : [null],
            precio : [null],
            autores : [null],
            color : [null],
            editar: [null],
            index: [null]
        });

        this.comic = new ComicDTO();
        this.listaComics = new Array<ComicDTO>();

        let comicDefault : ComicDTO;
        comicDefault = new ComicDTO();
        comicDefault.autores = "Stan Lee";
        comicDefault.cantidad = 10;
        comicDefault.coleccion = "Clásicos de Marvel";
        comicDefault.color = false;
        comicDefault.editorial = "Marvel";
        comicDefault.estado = "Activo";
        comicDefault.fechaVenta = new Date();  
        comicDefault.id = "123";
        comicDefault.nombre = "The Amazing Spiderman #1";
        comicDefault.numeroPaginas = 50;
        comicDefault.precio = 500000;
        comicDefault.tematica = "AVENTURAS";

        this.listaComics.push(comicDefault);

        comicDefault = new ComicDTO();
        comicDefault.autores = "Todd McFarlane";
        comicDefault.cantidad = 15;
        comicDefault.coleccion = "Spawn Vault";
        comicDefault.color = true;
        comicDefault.editorial = "Image Comics";
        comicDefault.estado = "Activo";
        comicDefault.fechaVenta = new Date();  
        comicDefault.id = "124";
        comicDefault.nombre = "Spawn #1";
        comicDefault.numeroPaginas = 68;
        comicDefault.precio = 298000;
        comicDefault.tematica = "FANTASTICO";

        this.listaComics.push(comicDefault);
    }

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    ngOnInit(): void {
        console.log("Ingreso al al evento oninit");

    }

    /**
     * @description Metodo que permite validar el formulario y crear o actulizar un comic
     */
    public crearActualizarComic() : void {
        this.submitted = true;
        if(this.gestionarComicForm.invalid) {
            return;
        }
        let actualizar : Boolean = this.gestionarComicForm.controls.editar.value;
        let index : number = this.gestionarComicForm.controls.index.value;
        this.comic = new ComicDTO();

        this.comic.nombre = this.gestionarComicForm.controls.nombre.value;
        this.comic.editorial = this.gestionarComicForm.controls.editorial.value;
        this.comic.tematica = this.gestionarComicForm.controls.tematica.value;
        this.comic.coleccion = this.gestionarComicForm.controls.coleccion.value;
        this.comic.numeroPaginas = this.gestionarComicForm.controls.numeroPaginas.value;
        this.comic.precio = this.gestionarComicForm.controls.precio.value;
        this.comic.autores = this.gestionarComicForm.controls.autores.value;
        this.comic.color = this.gestionarComicForm.controls.color.value;

        if(actualizar){
            this.comic.id = this.gestionarComicForm.controls.id.value;
            this.listaComics.splice(index, 1, this.comic);
        }
        else{
            this.idComic++;
            this.comic.id = this.idComic + "";
            this.listaComics.push(this.comic);
        }

        this.limpiarFormulario();  
    }

    /**
     * Metodo que permite consultar un comic de la tabla y sus detalles e inhabilitar el formulario
     * @param posicion en la lista del comic seleccionado
     */
    public consultarComic(posicion : number) : void {
        let comic = this.listaComics[posicion];

        this.gestionarComicForm.controls.editar.setValue(true);
        this.gestionarComicForm.controls.index.setValue(posicion);

        this.gestionarComicForm.controls.color.setValue(comic.color);
        this.gestionarComicForm.controls.nombre.setValue(comic.nombre);
        this.gestionarComicForm.controls.editorial.setValue(comic.editorial);
        this.gestionarComicForm.controls.tematica.setValue(comic.tematica);
        this.gestionarComicForm.controls.coleccion.setValue(comic.coleccion);
        this.gestionarComicForm.controls.numeroPaginas.setValue(comic.numeroPaginas);
        this.gestionarComicForm.controls.precio.setValue(comic.precio);
        this.gestionarComicForm.controls.autores.setValue(comic.autores);
        this.gestionarComicForm.controls.id.setValue(comic.id);
        
//        this.gestionarComicForm.controls.color.enable(); para habilitar el campo

    }

    /**
     * Metodo que permite un comic
     * @param posicion en la lista del comic seleccionado
     */
    public eliminarComic(posicion : number) : void {
        this.listaComics.splice(posicion,1);
    }

    private limpiarFormulario() : void {
        this.submitted = false;
        this.gestionarComicForm.controls.nombre.setValue(null);
        this.gestionarComicForm.controls.editorial.setValue(null);
        this.gestionarComicForm.controls.tematica.setValue(null);
        this.gestionarComicForm.controls.coleccion.setValue(null);
        this.gestionarComicForm.controls.numeroPaginas.setValue(null);
        this.gestionarComicForm.controls.precio.setValue(null);
        this.gestionarComicForm.controls.autores.setValue(null);
        this.gestionarComicForm.controls.color.setValue(null);
    }

    /**
     * @description Metodo que obtiene los controles y sus propiedades
     * @author Diego Fernando Alvarez Silva
     */
    get f() { 
        return this.gestionarComicForm.controls;
    }
}