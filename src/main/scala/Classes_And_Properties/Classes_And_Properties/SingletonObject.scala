package Classes_And_Properties.Classes_And_Properties

object singleton{
  def main(args: Array[String]): Unit = {
     singletonObject.hello()
  }
}
object  singletonObject{
  def hello(): Unit = {
    println("hello i am in singleton object")
  }

}
