import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(n, k) = readLongs
  val as = 0 +: readInts
  val m = collection.mutable.Map[Int, Int](as(1) -> 1)
  var now = as(1)
  var i = 1
  while (m.get(as(now)).isEmpty) {
    i += 1
    m.put(as(now), i.toInt)
    now = as(now)
  }
  now = as(now)
  val loopEnd = i + 1
  val loopStart = m.get(as(now)).get
  val mod = (k - loopStart) % (loopEnd - loopStart)

  println(s"loopStart = $loopStart, loopEnd = $loopEnd, mod = $mod, now = $now")
  for (_ <- 1 until mod.toInt) {
    now = as(now)
  }

  println(as(now))
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
