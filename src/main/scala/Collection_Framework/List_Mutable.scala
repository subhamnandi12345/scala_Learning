package Collection_Framework

import scala.collection.mutable.ListBuffer
object col3 extends App {

  var fruits = new ListBuffer[String]()
  fruits += "Apple"
  fruits += "Banana"
  fruits += "Orange"

  // add multiple elements
  fruits += ("Strawberry", "Kiwi", "Pineapple")
  // remove one element
  fruits -= "Apple"
  // remove multiple elements
  fruits -= ("Banana", "Orange")
  // remove multiple elements specified by another sequence
  fruits --= Seq("Kiwi", "Pineapple")
  // convert the ListBuffer to a List when you need to
  val fruitsList = fruits.toList

  println(fruits)
  println(fruitsList)
}