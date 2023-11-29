package Functional_Programming

//object more extends App {
//  def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int) {
//    val result = f(x, y)
//    println(result)
//  }
//
//  val sum = (x: Int, y: Int) => x + y
//  val multiply = (x: Int, y: Int) => x * y
//  executeAndPrint(sum, 2, 9) // prints 11
//  executeAndPrint(multiply, 3, 9) // prints 27
//}

object more1 extends  App{
  def exec(callback: (Any, Any) => Unit, x: Any, y: Any) {
    callback(x, y)
  }
  val printTwoThings =(a: Any, b: Any) => {
    println(a)
    println(b)
  }
  case class Person(name: String)
  exec(printTwoThings, "Hello", Person("Dave"))
}
