package Classes_And_Properties

class PrimryCons(Lname: String, Tname: String, article: Int) {
  def show(){
    println("Language name: " + Lname)
    println("Topic name: " + Tname)
    println("Total published articles:" + article)
  }
}
object Primry
{
  // Main method
  def main(args: Array[String]):Unit= {
    val obj = new PrimryCons("Scala", "Constructors", 14);
    obj.show()
  //  val obj1=new PrimryCons()
  }
}