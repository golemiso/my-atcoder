import scala.io.StdIn._

object Main extends App with StdInHelper {
  val Array(n, t) = readLongs
  val ts = readLongs

  var next = 0L
  var ans = 0L
  for (ti <- ts) {
    if (next <= ti) ans += t
    else ans += t - (next - ti)
    next = ti + t
  }

  println(ans)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
