import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';

/**
 * @description Componenete colsultar comic
 * 
 * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
 */
@Component({
    selector: 'consultar-comic',
    templateUrl: './consultar-comic-component.html'
})
export class ConsultarComicComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     */
    public consultarComicForm : FormGroup;

    /**
     * @description Este es el constructor del componente ConsultarComicComponent
     * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
     */
    constructor(private fb : FormBuilder, private router : Router, private activatedRoute: ActivatedRoute) {

        let data = this.activatedRoute.snapshot.params;
        this.consultarComicForm = this.fb.group({
            nombre : [{value: data.nombre, disabled: true}],
            editorial : [{value: data.editorial, disabled: true}],
            tematica : [{value: data.tematica, disabled: true}],
            coleccion : [{value: data.coleccion, disabled: true}],
            numeroPaginas : [{value: data.numeroPaginas, disabled: true}],
            precio : [{value: data.precio, disabled: true}],
            autores : [{value: data.autores, disabled: true}],
            color : [{value: data.color, disabled: true}]
        });
    }

    /**
     * @description Evento angular onInit
     * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
     */
    ngOnInit(): void {
    }

    /**
    * @description Metodo encargado de direccionar al componente de gestionar comic
    * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
    */
    public navegarGestionar(): void {
        this.router.navigate(['gestionar-comic']);
    }


}