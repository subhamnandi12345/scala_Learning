package Functional_Programming
object more3 extends App {
  val sum = (a: Int, b: Int, c: Int) => a + b + c
  val f1 = sum(1, _, _)
  val f2= f1(2,_)
  val f3=f2(3)
  println(f3)
}