object DayTwo {

  def folding(mm: (Int, Int), z: Int): (Int, Int) = {
    val (min, max) = mm
    z match {
      case x if x < min && x > max => (x, x)
      case x if x < min && x < max => (x, max)
      case x if x > min && x > max => (min, x)
      case _ => (min, max)
    }
  }

  def minMax(list: List[Int]): (Int, Int) =
    list.foldLeft((Int.MaxValue, Int.MinValue))(folding _)

  def solve(sheet: List[List[Int]]): Int = {
    sheet
      .map(x => {val (y,z) = minMax(x); z - y})
      .reduce(_ + _)
  }

  
  def main(args: Array[String]): Unit = {
    val data = scala.io.Source.fromFile("src/main/scala/day_two_input.txt")
      .mkString
      .split("\\n").toList
      .map { _.split("\\t").toList.map {_.toInt}}
    val result = solve(data)
    println(result)
  }
}