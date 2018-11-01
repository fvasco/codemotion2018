package jug

import jug.kotlin.ton

val companyNames: List<String> = (1..10).map { "Company $it" }

fun main() {
    java()
    kotlin()
}

fun kotlin() {
    val weight = companyNames.asSequence()
            .map { jug.kotlin.Company(it) }
            .flatMap { it.trains }
            .filter { it.type == jug.kotlin.Type.FREIGHT }
            .sumBy { it.weight.mass }.ton
    println("Kotlin total $weight")
}

fun java() {
    val weight = companyNames.stream()
            .map { jug.java.Company(it) }
            .flatMap { it.trains }
            .filter { it.type == jug.java.Type.FREIGHT }
            .mapToInt { it.weight.mass }
            .sum()
            .let { jug.java.Ton(it) }
    println("Java total $weight")
}
