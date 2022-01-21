package cleverTechTest.classes

import cleverTechTest.AnimalState
import cleverTechTest.basicClasses.Animal
import cleverTechTest.basicClasses.Mammal
import cleverTechTest.interfaces.Swimmable

class Wolf(initState: AnimalState? = null) : Mammal(initState), Swimmable {
    override fun makeAnimal(initState: AnimalState?): Animal = Wolf(initState)

    override fun swim() {
        state = AnimalState.SWIMMING
        printState()
    }
}