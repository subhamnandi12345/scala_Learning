package Traits

abstract class Animal11 {
  def speak(): Unit = {
    println("abstruct")
  }
}
trait WaggingTail {
  def startTail { println("tail started") }
  def stopTail { println("tail stopped") }
}
trait FourLeggedAnimal {
  def walk
  def run
}
class Dog111 extends Animal with WaggingTail with FourLeggedAnimal {
  // implementation code here ...
  //def speak { println("Dog says 'woof'") }
  def walk { println("Dog is walking") }
  def run { println("Dog is running") }
}
object traitExam1{
  def main(args: Array[String]): Unit = {
     val ob=new Animal11 {}
    ob.speak()
  }
}
