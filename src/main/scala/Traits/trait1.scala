trait PizzaTrait {
  var numToppings: Int // abstract
  var size = 14
  val maxNumToppings = 10
}
class Pizza extends PizzaTrait {
  var numToppings = 0
  size = 16
}
object tar11 extends App{
  val a=new  Pizza();
  println(a.numToppings)
}