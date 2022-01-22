package cleverTechTest.classes

import cleverTechTest.AnimalState
import cleverTechTest.basicClasses.Animal
import cleverTechTest.basicClasses.Mammal

class Beaver(initState: AnimalState? = null) : Mammal(initState){
    override fun makeAnimal(initState: AnimalState?): Animal = Beaver(initState)
}