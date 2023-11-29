package Methods
class ComputerScience {
  def read {
    println("I'm reading")
  }
  def write {
    println("I'm writing")
  }
}
class Scala extends ComputerScience {
// override def read {
//    println("i am in child function")
//  }
  def readThanWrite() {
    read
    super.write
  }
}
object Geeks {
  def main(args: Array[String]) {
    val ob = new Scala();
    ob.readThanWrite();
    ob.read
  }
}

