package days

import Solution

class Day1 : Solution {
	override val day: UByte = 1u

	override fun solve1(): String {
		return getInputSplit("\n").sumOf { S ->
			val s: String = S.filter { it.isDigit() }
			(s[0] + "" + s.last()).toInt()
		}.toString()
	}

	override fun solve2(): String {
		val nums: Array<String> = arrayOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
		return getInputSplit("\n").sumOf { S ->
			var s: String = S;
			nums.forEachIndexed { index, it -> s = s.replace(it, "${it[0]}${index+1}${it.last()}") }
			s = s.filter { it.isDigit() }
			(s[0] + "" + s.last()).toInt()
		}.toString()
	}
}