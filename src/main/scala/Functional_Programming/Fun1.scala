package Functional_Programming

object Demo extends App {
  val x=List.range(1,10)
 // val print=x.foreach(i=>println(i))
  val print=x.foreach(println(_))
 // val evens=x.filter((i:Int)%2==0)
  val evens=x.filter(_%2==0)
  println(evens)

}
