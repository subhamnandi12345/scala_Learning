package Classes_And_Properties
//private access modifier is used to make data accessible only within class in which it is declared. It is most restricted and keeps your data in limited scope. Private data members does not inherit into subclasses.
//class AccessExample{
//  private var a:Int = 10
//  def show(){
//    println(a)
//  }
//}
//object scala{
//  def main(args:Array[String]){
//    var p = new AccessExample()
//     //p.a = 12   // throws an error
//    p.show()
//  }
//}

//Protected access modifier is accessible only within class, sub class and companion object. Data members declared as protected are inherited in subclass.
//class AccessExample{
//  protected var a:Int = 10
//}
//class SubClass extends AccessExample{
//  def display(){
//    println("a = "+a)
//  }
//}
//object Object1{
//  def main(args:Array[String]){
//    var s = new SubClass()
//    s.display()
//  }
//}

//In scala, when you don't mention any access modifier, it is treated as no-access-modifier. It is same as public in java. It is least restricted and can easily accessible from anywhere inside or outside the package.
class AccessExample{
  var a:Int = 10
  def show(){
    println(" a = "+a)
  }
}

object Object2{
  def main(args:Array[String]){
    var a = new AccessExample()
    a.show()
  }
}