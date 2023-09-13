package edu.unicauca.aplimovil.model

class Guerrero(name: String):Personaje(name) {
    var fuerza:Int = 1
        set(value) {
            if(value in 0..10){
                field = value
            }
        }

    fun atacar(enemigo:Personaje){
        enemigo.reducirVida(fuerza)
    }

    override fun presentarse(): String {
        return "Soy un guerrero llamado $name"
    }
}