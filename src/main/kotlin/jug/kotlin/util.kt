package jug.kotlin

import kotlin.math.absoluteValue

private val typeValues = Type.values()

fun makeTrain(company: Company, trainCode: Int): Train {
    var seed = company.name.hashCode()
    repeat(trainCode) { i ->
        seed += seed xor i
    }
    seed = seed.absoluteValue

    val type = typeValues[seed % typeValues.size]
    val weight = when (type) {
        Type.FAST -> 150.ton
        Type.LOCAL -> 140.ton
        Type.FREIGHT -> 180.ton
    }
    return Train(
            code = trainCode,
            type = type,
            weight = weight
    )
}