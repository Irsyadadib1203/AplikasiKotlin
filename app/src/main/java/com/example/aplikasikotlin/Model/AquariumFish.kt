package com.example.aplikasikotlin.Model

abstract class AquariumFish {
    abstract val color: String


    class Shark: AquariumFish(), FishAction {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    class Plecostomus: AquariumFish(), FishAction {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }
    }
    interface FishAction  {
        fun eat()
    }

    abstract class AquariumFish : FishAction {
        abstract val color: String
        override fun eat() = println("yum")
    }

}