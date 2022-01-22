package cleverTechTest

import cleverTechTest.classes.*
import java.lang.System.`in`
import java.util.*

val input = Scanner(`in`)

fun main() {

    println()

    val commands = listOf(
        "list" to "print list of zoo animals", "help" to "enter command or something else to exit"
    )
    println(
        "Enter \"list\" command to print list of zoo animals or something else to exit, AFTER CONTINUE.\nContinue Y/N ?"
    )
    if (!input.nextLine().equals("y", true)) return
    val zoo = Zoo().apply {
        addAnimals(4) { Duck() }
        addAnimals(7) { Colibri() }
        addAnimals(3) { Bear() }
        addAnimals(5) { Wolf() }
        addAnimal(Peacock())
        addAnimals(2) { Beaver() }
        printAnimalsList()
        open()
    }
    while (true) {
        input.nextLine()
        zoo.close()
        commands.forEach {
            println(it)
        }
        println("Enter command:")
        if (!input.nextLine().contains("list", true)) return
        zoo.printAnimalsList()
        zoo.open()
    }
}