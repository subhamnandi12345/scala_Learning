package Functional_Programming

object func1 extends App {
  def executeFunction(callback: () => Unit) {
   callback()
  }
    val sayHello = () => {
    println("Hello")
  }
  executeFunction(sayHello)
}