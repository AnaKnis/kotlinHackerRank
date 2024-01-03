import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.text.*

fun diagonalDifference(arr: Array<Array<Int>>): Int {
  val n = arr.size
  var diagonalLeftToRight = 0
  var diagonalRightToLeft = 0

  for (i in 0 until n) {
    diagonalLeftToRight += arr[i][i]
    diagonalRightToLeft += arr[i][n - 1 - i]
  }

  return abs(diagonalLeftToRight - diagonalRightToLeft)
}

fun main() {
  val n = readln().trim().toInt()

  val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

  for (i in 0 until n) {
    arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
  }

  val result = diagonalDifference(arr)

  println(result)
}
