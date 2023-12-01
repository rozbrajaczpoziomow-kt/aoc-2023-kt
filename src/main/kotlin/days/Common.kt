package days

class Coordinate(val x: Int, val y: Int) {
	override fun toString(): String {
		return "Coordinate($x, $y)"
	}

	override fun hashCode(): Int {
		return x * 37 + y
	}

	override fun equals(other: Any?): Boolean {
		if(other !is Coordinate) return false

		if(x != other.x) return false
		if(y != other.y) return false

		return true
	}
}

const val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
const val vowels: String = "aeiou"
const val vowelsY: String = "aeiouy"
const val digits: String = "0123456789"

val alphabetUpper: String = alphabet.uppercase()
val vowelsUpper: String = vowels.uppercase()
val vowelsUpperY: String = vowelsY.uppercase()

val alphabetBoth: String = alphabet + alphabetUpper

fun String.isNumber(): Boolean = this.all { it.isDigit() }