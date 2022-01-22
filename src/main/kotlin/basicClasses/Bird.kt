package cleverTechTest.basicClasses

import cleverTechTest.AnimalState

abstract class Bird(
    initState: AnimalState? = null
) : Animal(initState){

    override fun randomAction() {
        when ((1..4).random()) {
            1 -> fly()
            2 -> eat()
            3 -> sleep()
            4 -> move()
        }
    }

     fun fly() {
        state = AnimalState.FLYING
        printState()
    }

     fun eat() {
        state = AnimalState.EATING
        printState()
    }

     fun move() {
        state = AnimalState.MOVING
        printState()
    }

     fun sleep() {
        state = AnimalState.SLEEPING
        printState()
    }
}