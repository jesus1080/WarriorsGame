package edu.unicauca.aplimovil.model

class Guerrero(val nombre: String):Personaje(nombre) {
    var fuerza:Int = 1
        set(value) {
            if(value in 0..10){
                field = value
            }
        }

    fun atacar(enemigo:Personaje){
        enemigo.reducirVida(fuerza)
    }
}