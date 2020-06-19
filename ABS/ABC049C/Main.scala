import scala.io.StdIn._
import scala.annotation.tailrec

object Main extends App with StdInHelper {
  val dream = "dream"
  val dreamer = "dreamer"
  val erase = "erase"
  val eraser = "eraser"

  val s = readLine

  @tailrec
  def replace(ss: String): Unit = ss match {
    case str if str.endsWith(dream) =>
      replace(str.slice(0, str.length() - dream.length()))
    case str if str.endsWith(dreamer) =>
      replace(str.slice(0, str.length() - dreamer.length()))
    case str if str.endsWith(erase) =>
      replace(str.slice(0, str.length() - erase.length()))
    case str if str.endsWith(eraser) =>
      replace(str.slice(0, str.length() - eraser.length()))
    case "" => println("YES")
    case _  => println("NO")
  }
  replace(s)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
