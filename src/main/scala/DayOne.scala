object DayOne {

  def solve(data: List[Char]): Int = {
    var sum = 0
    for (
      (x, y) <- (0 to data.length - 1) zip (1 to data.length)
    ) {
      if (y == data.length) {
        if (data(x) == data(0)) {
          sum += data(x).asDigit
        }
      } else if (data(x) == data(y)) {
        sum += data(x).asDigit
      }
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    val data = scala.io.Source.fromFile("src/main/scala/input.txt").mkString.toList
    val result = solve(data)
    println(result)
  }

}
