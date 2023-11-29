package Collection_Framework

import scala.collection.mutable.ArrayBuffer

object col6 extends App{
  var characters = ArrayBuffer[String]()
  characters += "Ben"
  characters += "Jerry"
  // add one element
  characters += "Dale"
  // add two or more elements (method has a varargs parameter)
  characters += ("Gordon","Harry")
  println(characters)
  characters -= "Jerry" //remove
  println(characters)
}

