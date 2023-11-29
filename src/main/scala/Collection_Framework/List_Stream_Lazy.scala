package Collection_Framework
//You want to use a collection that works like a List but invokes its transformer methods
//(map, filter, etc.) lazily
//LazyList are immutable
object col4 extends App{
  //val stream = 1 #:: 2 #:: 3 #:: Stream.empty
  val my_lazyList : LazyList[Int]=1 #:: 2 #:: 3 #::LazyList.empty[Int]
  println(my_lazyList)
}
