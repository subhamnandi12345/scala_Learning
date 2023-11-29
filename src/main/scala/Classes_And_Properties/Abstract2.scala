package Classes_And_Properties

import scala.beans.BeanProperty

abstract class Pet1 (name: String) {
  val greeting: String
  var age: Int
  def sayHello ={ println(greeting) }
  override def toString = s"I say $greeting, and I'm $age"
}
class Dog1 (name: String) extends Pet1(name) {
  val greeting = "Woof"
  var age = 2
}

class Cat (name: String) extends Pet1 (name) {
  val greeting = "Meow"
  var age = 5
}
object AbstractFieldsDemo extends App {
  val dog = new Dog1("Fido")
  val cat = new Cat("Morris")
  dog.sayHello
  cat.sayHello
  println(dog)
  println(cat)
}

