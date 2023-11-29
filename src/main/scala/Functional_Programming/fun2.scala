package Functional_Programming

object  Demo1 extends App{
  val double=(i:Int)=>{i*2}
  println(double(2))  //function instance

 // val add=(x:Int, y:Int)=>x+y            //implicit
 // val add:(Int,Int)=>Int=(x,y)=>{x+y}   //explicit
  def modMethod(i: Int) = { i % 2 == 0 }
  val list = List.range(1, 10)
 println(list.filter(modMethod))

}

