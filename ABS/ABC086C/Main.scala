import scala.io.StdIn._
import scala.annotation.tailrec
import scala.math._
import scala.util.control.Breaks

object Main extends App with StdInHelper {
  val n = readInt

  case class Travel(t: Int, x: Int, y: Int) {
    def canGo(that: Travel): Boolean = {
      val distance = abs(x - that.x) + abs(y - that.y)
      distance <= abs(t - that.t) && distance % 2 == abs(t - that.t) % 2
    }
  }

  val travels = Travel(0, 0, 0) +: (for { _ <- 1 to n } yield {
    val Array(t, x, y) = readInts()
    Travel(t, x, y)
  })

  val b = Breaks
  b.breakable {
    for (i <- 1 to n) {
      if (!travels(i - 1).canGo(travels(i))) {
        println("No")
        b.break()
      }
    }
    println("Yes")
  }

}

trait StdInHelper {
  def readInts() = readLine.split(" ").map(_.toInt)
  def readLongs() = readLine.split(" ").map(_.toLong)
}
