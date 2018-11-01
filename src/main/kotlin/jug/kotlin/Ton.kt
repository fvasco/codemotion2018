package jug.kotlin

inline class Ton(val mass: Int) {
    override fun toString(): String = "$mass ton"
}

operator fun Ton.plus(other: Ton) = Ton(mass + other.mass)

inline val Int.ton get() = Ton(this) // 5.ton -> Ton(5)
