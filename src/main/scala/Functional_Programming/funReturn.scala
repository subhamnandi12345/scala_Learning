package Functional_Programming
object a extends App {
  def saySomething(prefix: Int) = (s: String) => {
    prefix + " " + s
  }
  val sayHello = saySomething(23)
  sayHello("Al")
}
