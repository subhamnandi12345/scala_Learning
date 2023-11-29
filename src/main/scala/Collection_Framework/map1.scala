package Collection_Framework
//map is immutable by dafault
object col8 extends App{
  val states = Map("AL" -> "Alabama", "AK" -> "Alaska" ,"IN"->"India","PK"->"Pakistan")
  println(states("IN")) // accessing value
  println(states.isEmpty)

  val code = if (states.contains("PK"))  states("PK") else 0
  val code1 = if (states.contains("China"))  states("China") else 0

  println(code)
  println(code1)

   for ((k, v) <- states) println(s"$k, $v")   //iterating over map

}
