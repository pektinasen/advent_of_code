import scala.io.Source

/**
  * 1. map everything to [(aa, 1), (ae, 1), (aa,1), ...]
  * 2. reduce together [(aa, 2), (ae,1), ...]
  * 3. return 0 if there exists one value > 1, otherwise 1
  */
object DayThree {

  def f_map(a: String): (String, Int) =
    (a, 1)

  def f_fold(a: Map[String, Int], b: (String, Int)): Map[String, Int] = {
    a.get(b._1) match {
      case Some(x) => a + (b._1 -> (b._2 + x))
      case None => a + b
    }
  }

  def solve_one(line: List[String]) =
    if (line
      .map(f_map)
      .foldLeft(Map[String, Int]())(f_fold)
      .exists(_._2 > 1))
      0
    else
      1

  def solve(list: List[List[String]]): Int =
    list.map(solve_one).sum

  def main(args: Array[String]): Unit = {
    val data = Source.fromFile("src/main/scala/day_three.txt").getLines()
    println(solve(data.toList.map(_.split(" ").toList)))
  }
}
