object DayOne {

  def solve(data: String): Int = {
    var sum = 0
    for (
      (x, y) <- (0 to data.length - 1) zip (1 to data.length)
    ) {
      if (y == data.length &&
          data(x) == data(0)) {
        sum += data(x).asDigit
      } else if (data(x) == data(y)) {
        sum += data(x).asDigit
      }
    }
    println(sum)
  }

  def main(args: Array[String]): Unit = {
    val data = scala.io.Source.fromFile("src/main/scala/input.txt").mkString.toList
    val result = solve(data)
    println(result)
  }

}
