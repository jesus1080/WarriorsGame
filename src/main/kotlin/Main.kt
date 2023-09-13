import edu.unicauca.aplimovil.model.Guerrero
import edu.unicauca.aplimovil.model.Hechicero

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val hechicero = Hechicero("Merlyn")
    val guerrero = Guerrero("Arturo")
    val guerrerodos = Guerrero("Aragon")

    println(hechicero.presentarse())
    println(guerrero.presentarse())

    hechicero.mana = 2
    guerrero.fuerza = 4

    println(hechicero.mana)
    println(guerrero.fuerza)

    hechicero.hechizar(guerrero)
    guerrero.atacar(guerrerodos)

    println(guerrerodos.vida)
    hechicero.sanar(guerrerodos)

    println(guerrerodos.vida)

    guerrero.subirNivel(21)
    println(guerrero.mostrarNivel())


}