package edu.unicauca.aplimovil.model

class Hechicero(name:String):Personaje(name) {
    var mana:Int = 1
        set(value) {
            if(value in 1..50){
                field = value
            }
        }

    fun sanar(amigo:Personaje){
        amigo.escudo = true
        amigo.incrementarVida(mana)
    }

    fun hechizar(enemigo:Personaje){
        enemigo.escudo = false
    }

    override fun presentarse(): String {
        return "Soy un guerrero llamado $name"
    }

}