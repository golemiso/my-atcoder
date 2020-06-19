import scala.io.StdIn._

object Main extends App {
  val n = readInt()
  var as = readLine().split(" ").map(_.toLong)

  def canDivideWithTwo(numbers: Array[Long]): Boolean =
    numbers.forall(_ % 2 == 0)
  def divideWithTwo(numbers: Array[Long]): Array[Long] = numbers.map(_ / 2)

  var count = 0L
  while (canDivideWithTwo(as)) {
    as = divideWithTwo(as)
    count += 1
  }

  println(count)
}
