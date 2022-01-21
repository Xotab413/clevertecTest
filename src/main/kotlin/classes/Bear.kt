package cleverTechTest.classes

import cleverTechTest.AnimalState
import cleverTechTest.basicClasses.Animal
import cleverTechTest.basicClasses.Mammal
import cleverTechTest.interfaces.Swimmable

class Bear(initState: AnimalState? = null) : Mammal(initState), Swimmable {
    override fun makeAnimal(initState: AnimalState?): Animal = Bear(initState)

    override fun swim() {
        state = AnimalState.SWIMMING
        printState()
    }
}