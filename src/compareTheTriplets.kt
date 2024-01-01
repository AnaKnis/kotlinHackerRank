import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
  val result = mutableListOf(0, 0)

  for (i in a.indices) {
    if (a[i] > b[i]) {
      result[0] += 1
    } else if (b[i] > a[i]) {
      result[1] += 1
    }
  }

  return result.toTypedArray()
}

fun main() {

  val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

  val b = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

  val result = compareTriplets(a, b)

  println(result.joinToString(" "))
}
