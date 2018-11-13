package jug.kotlin

data class Ton(val mass: Int) { // experimental inline class support
    override fun toString(): String = "$mass ton"
}

operator fun Ton.plus(other: Ton) = Ton(mass + other.mass)

inline val Int.ton get() = Ton(this) // 5.ton -> Ton(5)
