package Collection_Framework

object col extends App {
  val numbersList: List[Int] = List(1, 2, 3, 4)
  //val num=List(2,3,4,5)
  val emptyList: List[Int] = List()  //empty list
  println(numbersList)
  println(emptyList)
  //Another way
  val numbersList1: List[Int] = 1 :: 2 :: 3 :: 4 :: Nil
  val emptyList1: List[Int] = Nil  // Empty List
  val newList=numbersList ::: numbersList1  // concatination
  val originalList = List(5, 1, 4, 3, 2)
  val filteredList = originalList.filter(_ > 2)  // filter
  println(numbersList1)
  println(emptyList1)
  println(newList)
  println(filteredList)
}

