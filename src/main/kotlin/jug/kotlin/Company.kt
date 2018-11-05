package jug.kotlin

class Company(val name: String) {

    init {
        require(name.isNotEmpty()) { "Empty name" }
    }

    val trains: Sequence<Train>
        get() = codes.asSequence().map { code -> makeTrain(this, code) }

    private companion object {
        val codes = 1_000..50_000
    }
}
