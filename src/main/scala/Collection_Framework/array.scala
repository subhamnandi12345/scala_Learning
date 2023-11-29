package Collection_Framework

object col5 extends App{
  val a = Array(1,2,3)
  println(a.apply(0))
  def sub(): Unit = {
    println("hi scala")
    println("scala")
    println("scala1")
    println("scala2")
  }

  val fruits = new Array[String](3)
  fruits(0) = "Apple"
  fruits(1) = "Banana"
  fruits(2) = "Orange"
  for(i<-fruits){
    println(i)
  }
  sub()
}
