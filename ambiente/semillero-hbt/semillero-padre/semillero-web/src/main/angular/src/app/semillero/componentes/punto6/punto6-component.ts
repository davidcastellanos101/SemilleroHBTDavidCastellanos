import { Component, OnInit } from '@angular/core';

/**
 * @description Componente punto6
 * 
 * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
 */
@Component({
    selector: 'punto6',
    templateUrl: './punto6-component.html',
})
export class Punto6Component implements OnInit {

    /**
     * variable global tipo any
     */
    public variableGlobal: any;

    /**
     * Variable global de tipo string que guarda la url de una imagen
     */
    public urlImg: String;

    /**
     * attributo lista que guarda elemento de tipo any
     */
    public lista: Array<any>;

    /**
     * atributo mapa que guarda pares de datos any, any
     */
    public mapa: Map<any, any>;

    /**
     * Constructor de la clase
     */
    constructor() {
        // Se inicializa la lista
        this.lista = new Array<any>();
        // Se inicializa el mapa
        this.mapa = new Map<any, any>();
        // Se inicializa la variable urlImg   
        this.urlImg = "https://www.intersoftware.org.co/sites/default/files/logos_marcas_internas/logos-21.png";
    }

    /**
     * Evento angular que se ejecuta al iniciar el componente
     */
    ngOnInit(): void {
        // Se define e incializa una variable local
        let variableLocal: String = "variable local";

        // Se inicializa la variable global
        this.variableGlobal = "variable global";

        // Se introducen valores dentro de la lista
        this.lista.push(this.variableGlobal);
        this.lista.push(variableLocal);

        // Se define e inicializa un objeto local de tipo Date
        let mifecha = new Date();
        // Se define e inicializa un atributo de tipo booleano
        let booleano: boolean = true;

        // Se introducen datos dentro del mapa
        this.mapa.set(this.variableGlobal, variableLocal);
        this.mapa.set(1, 2);
        this.mapa.set(this.variableGlobal, variableLocal);
        this.mapa.set(mifecha, booleano);

        // Se imprime el mapa por consola
        console.log(this.mapa);
    }

    /**
     * Método que alterna el valor de la variable urlImg
     */
    public cambiarImg(): void {
        if (this.urlImg === "https://www.heinsohn.com.co/wp-content/uploads/2017/11/logo-hgs-pagina.png") {
            this.urlImg = "https://www.intersoftware.org.co/sites/default/files/logos_marcas_internas/logos-21.png";
        } else {
            this.urlImg = "https://www.heinsohn.com.co/wp-content/uploads/2017/11/logo-hgs-pagina.png";
        }
    }

}