import org.junit.Test
import org.junit.Assert._

class DayOneTest {
  @Test def t1(): Unit = {
    assertEquals(3, DayOne.solve("1122".toList))
    assertEquals(4, DayOne.solve("1111".toList))
    assertEquals(0, DayOne.solve("1234".toList))
    assertEquals(9, DayOne.solve("91212129".toList))
  }
}