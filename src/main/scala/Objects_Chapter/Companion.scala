
class ExampleofCompanion {

  var str1 = "GeeksforGeeks";
  var str2 = "Tutorial of Companion object";
  def show() {
    println(str1);
    println(str2);

  }

}
object ExampleofCompanion {
  def display() = println("display")
  def main(args: Array[String]) {
    var obj = new ExampleofCompanion();
    obj.show();
  }
}
//class Foo {
//  // access the private object field 'obj'
//  def printObj { println(s"I can see ${Foo.obj}") }
//}
//object Foo {
//  private val obj = "Foo's object"
//}
//object Driver extends App {
//  val f = new Foo
//  f.printObj
//}
