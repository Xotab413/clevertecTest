package cleverTechTest.classes

import cleverTechTest.AnimalState
import cleverTechTest.basicClasses.Animal
import cleverTechTest.basicClasses.Bird

class Duck(initState: AnimalState? = null) : Bird(initState){

    override fun makeAnimal(initState: AnimalState?): Animal = Duck(initState)

    override fun randomAction() {
        when ((1..5).random()) {
            1 -> fly()
            2 -> eat()
            3 -> sleep()
            4 -> move()
            5 -> swim()
        }
    }

    fun swim() {
        state = AnimalState.SWIMMING
        printState()
    }
}