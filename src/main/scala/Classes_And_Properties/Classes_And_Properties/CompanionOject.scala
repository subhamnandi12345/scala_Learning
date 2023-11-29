package Classes_And_Properties.Classes_And_Properties
class ComapanionClass{
  def hello(){
    println("Hello, this is Companion Class.")
  }
}
object CompanoinObject{
  def main(args:Array[String]){
    new ComapanionClass().hello()
    println("And this is Companion Object.")
  }
}
