package cleverTechTest

import cleverTechTest.basicClasses.Animal
import cleverTechTest.basicClasses.Animal.Companion.printState
import kotlinx.coroutines.*

class Zoo {

    @OptIn(DelicateCoroutinesApi::class)
    private val scope = GlobalScope
    private var currentJob: Job? = null
    private val animals = mutableListOf<Animal>()

    fun open() {
        currentJob = scope.launch {
            while (true) {
                for (animal in animals) {
                    animal.randomAction()
                    delay(1000)
                }
                println("-")
            }
        }
    }

    fun close() {
        currentJob?.cancel()
    }

    fun addAnimal(animal: Animal) = animals.add(animal)

    inline fun addAnimals(count: Int, initBlock: (Int) -> Animal) {
        repeat(count) {
            addAnimal(initBlock(it))
        }
    }

    fun printAnimalsList() {
        println("Zoo:")
        println("-")
        for (animal in animals) {
            animal.printState()
        }
        println("-")
    }
}