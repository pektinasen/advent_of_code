object DayTwo {

//  def folding(z: Int, mm: (Int, Int)): (Int, Int) = {
//    val (min, max) = mm
//    z match {
//      case x if x < min && x > max => (x, x)
//      case x if x < min && x < max => (x, max)
//      case x if x > min && x > max => (min, x)
//      case _ => (min, max)
//    }
//  }

  def minMax(xs: List[Int]): (Int, Int) = {
    var (min, max) = (Int.MaxValue, Int.MinValue)
    for (
      z <- xs
    ) yield z match {
      case x if x < min && x > max => (x, x)
      case x if x < min && x < max => (x, max)
      case x if x > min && x > max => (min, x)
      case _ => (min, max)
    }
  }

  def solve(sheet: List[List[Int]]): Int = {
    ???
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