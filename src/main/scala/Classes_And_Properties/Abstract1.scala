package Classes_And_Properties

abstract class Pet {
  def speak(): Unit = println("Yo ")   // concrete implementation
  def comeToMaster(): Unit            // abstract method

}
class Dog extends Pet  {
  override def speak() = println("Woof")
  def comeToMaster() = println("Here I come!")
}
object ex1{
  def main(args: Array[String]): Unit = {
    var obj =new Dog
    obj.speak()
  }
}
