package Collection_Framework
import scala.collection.mutable.Map
object col9 extends App{
  var states = Map[String, String]()
  states("AK") = "Alaska"
  states += ("AL" -> "Alabama")
  states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
  states ++= List("CA" -> "California", "CO" -> "Colorado")
  states -= "AR"
  states -= ("AL", "AZ")
  states --= List("AL", "AZ")
  println(states)
}