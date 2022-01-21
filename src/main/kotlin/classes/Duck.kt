package cleverTechTest.classes

import cleverTechTest.AnimalState
import cleverTechTest.basicClasses.Animal
import cleverTechTest.basicClasses.Bird
import cleverTechTest.interfaces.Swimmable

class Duck(initState: AnimalState? = null) : Bird(initState), Swimmable {
    override fun makeAnimal(initState: AnimalState?): Animal = Duck(initState)

    override fun swim() {
        state = AnimalState.SWIMMING
        printState()
    }
}