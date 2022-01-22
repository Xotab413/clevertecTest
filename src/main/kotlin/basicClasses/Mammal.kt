package cleverTechTest.basicClasses

import cleverTechTest.AnimalState

abstract class Mammal(
    initState: AnimalState? = null
) : Animal(initState) {

    override fun randomAction() {
        when ((1..4).random()) {
            1 -> feed()
            2 -> eat()
            3 -> sleep()
            4 -> move()
            5 -> swim()
        }
    }

    fun feed() {
        state = AnimalState.FEEDING
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

    fun swim() {
        state = AnimalState.SWIMMING
        printState()
    }
}