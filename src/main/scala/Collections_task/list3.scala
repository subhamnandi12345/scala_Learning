package Collections_task
//program to check whether a list contains a sublist
object list3 {
  def test_sublist[A](list1:List[A], list2:List[A]):Boolean = {
    list1.forall(list2.contains)
  }
  def main(args: Array[String]): Unit = {
    println(test_sublist(List(1,2), List(1,2,3,4)))
    println(test_sublist(List(1,2), List(1,3,4,2)))
    println(test_sublist(List(1,2), List(1,3,4)))
  }
}
