package Collections_task

//program to remove duplicates from a given list.
object list1 extends App{
  val nums = List(1, 3, 5, 2, 7, 9, 11, 5, 2, 14, 12, 3)
  println("List before distinct element:"+nums)
  val num1=nums.distinct
  println("Distinct element onl "+num1)
}

