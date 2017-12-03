import org.junit.Test
import org.junit.Assert._

class DayTwoTest {
  @Test def t1(): Unit = {
    assertEquals(18, DayTwo.solve(List(List(5, 1, 9, 5), List(7, 5, 3), List(2, 4, 6, 8)).toList))
  }
}