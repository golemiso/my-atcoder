import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(n, m) = readInts
  val road = collection.mutable.Map[Int, Seq[Int]]().withDefaultValue(Seq())
  for (_ <- 1 to m) {
    val Array(a, b) = readInts
    road(a) = road(a) :+ b
    road(b) = road(b) :+ a
  }

  road -= 1

  val michishirube = collection.mutable.Map[Int, Int]()
  road.foreach { r =>
    if (r._2.contains(1)) {
      michishirube(r._1) = 1
      road -= r._1
    }
  }
  var finish = false
  while (!road.isEmpty && !finish) {
    finish = true
    road.foreach { r =>
      r._2.foreach { i =>
        michishirube.get(i) match {
          case None =>
          case Some(value) =>
            michishirube(r._1) = i
            road -= r._1
            finish = false
        }
      }
    }
  }

  if (finish) {
    println("No")
  } else {
    println("Yes")
    michishirube.foreach { m => println(m._2) }
  }
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
