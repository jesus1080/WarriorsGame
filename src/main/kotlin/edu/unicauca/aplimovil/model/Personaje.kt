package edu.unicauca.aplimovil.model

open class Personaje(val name:String) {
    var vida:Int = 100
        set(value) {
            if(value in 0..100){
                field = value
            }
        }
    private var nivel: Int = 1
    var posX:Int = 0
    var posY:Int = 0
    var escudo:Boolean = false

    fun mover(movX:Int, movY:Int){
        posX+=movX
        posY+=movY
    }

    fun incrementarVida(incremento:Int){
        vida+=incremento
    }

    fun reducirVida(reduccion:Int){
        if(!escudo)
            vida-=reduccion
    }
    open fun presentarse(): String{
        return "Soy un personaje llamado $name"
    }

}