package Classes_And_Properties
class SuperClassCons(var message:String) {
    println(message)

}
class subClass( message:String) extends SuperClassCons(message){
  def display():Unit= {
    println("Subclass constructor called")
  }
}
object Super{
  def main(args: Array[String]): Unit = {
    var obj=new subClass("GeeksForGeeks")
    obj.display()
  }
}
