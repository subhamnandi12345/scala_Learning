package Traits
trait Pet {
  def speak { println("Yo") }
  def comeToMaster
}
class Dog1 extends Pet {

  def comeToMaster { ("I'm coming!") }
}
class Cat extends Pet {
  override def speak { ("meow") }
  def comeToMaster { ("That's not gonna happen.") }
}
object traitExam2{
  def main(args: Array[String]): Unit = {
  }
}