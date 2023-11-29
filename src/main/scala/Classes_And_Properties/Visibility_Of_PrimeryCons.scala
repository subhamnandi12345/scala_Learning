package Classes_And_Properties

class Visibility_Of_PrimeryCons (var name: String){

}
object Primery{
  def main(args: Array[String]): Unit = {

    val p = new Visibility_Of_PrimeryCons("scala")
    println(p.name)
  p.name = "Fred Flintstone"
//      println(p.name)
  }
}
