package cleverTechTest.classes

import cleverTechTest.AnimalState
import cleverTechTest.basicClasses.Animal
import cleverTechTest.basicClasses.Mammal
import cleverTechTest.interfaces.Swimmable

class Wolf(initState: AnimalState? = null) : Mammal(initState), Swimmable {

    override fun makeAnimal(initState: AnimalState?): Animal = Wolf(initState)

    override fun randomAction() {
        when ((1..5).random()) {
            1 -> feed()
            2 -> eat()
            3 -> sleep()
            4 -> move()
            5 -> swim()
        }
    }

    override fun swim() {
        state = AnimalState.SWIMMING
        printState()
    }
}