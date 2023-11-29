package Traits
trait PizzaTrait {
  var numToppings: Int // abstract
  var size = 14 // concrete
  val maxNumToppings = 10 // concrete
}
class Pizza extends PizzaTrait {
  var numToppings = 20
}
object traitExam{
  def main(args: Array[String]): Unit = {
    val ob=new Pizza
   println(ob.numToppings)
  }
}
