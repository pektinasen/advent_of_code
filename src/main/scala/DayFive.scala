import scala.io.Source

object DayFive {

  def main(args: Array[String]): Unit = {
    val data = Source.fromFile("src/main/scala/day_five.txt").getLines.toArray
    val dataInt = data.map {_.toInt}
    var index = 0
    var count = 0
    while (index < dataInt.length) {
      val tmp = index
      index += dataInt(index)
      dataInt(tmp) += (if (dataInt(tmp) >= 3) -1 else 1)
      count += 1
    }
    println(count)
  }
}
