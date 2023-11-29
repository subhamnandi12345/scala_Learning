package Collections_task
//program to check a given list is a palindrome or not

object list2 {

  def is_Palindrome[A](list_nums: List[A]):Boolean = {
    list_nums == list_nums.reverse
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + is_Palindrome(List(1, 2, 3, 4, 3, 2, 1)));
    println("Result: " + is_Palindrome(List(1, 2, 3)));
  }
}

