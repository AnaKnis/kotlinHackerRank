fun aVeryBigSum(ar: Array<Long>): Long {
  return ar.sum();
}

fun main() {
  val arCount = readln().trim().toInt()

  val ar = readln().trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

  val result = aVeryBigSum(ar)

  println(result)
}