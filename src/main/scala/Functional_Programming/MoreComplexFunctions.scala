package Functional_Programming

object  func2 extends App{
  def exec(callback: Int => Unit) {
    // invoke the function we were given, giving it an Int parameter
    callback(1)
  }
  val plusOne = (i: Int) => { println(i+1) }
  exec(plusOne)

}
