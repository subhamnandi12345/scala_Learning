package Methods

class Pizza {
  var crustSize = 12
  var crustType = "Thin"

  def update(crustSize: Int, crustType: String) {
    this.crustSize = crustSize
    this.crustType = crustType
  }
  override def toString = {
    "A %d inch %s crust pizza.".format(crustSize, crustType)
  }
}
object ab{
  def main(args: Array[String]): Unit = {
    val p = new Pizza
    //p.update(crustSize = 16, crustType = "Thick")
    p.update(crustType = "Pan", crustSize = 14)
   println(p)
  }
}