package Methods
class facorial {
  def facto(n: Int): Int = {
    if (n == 0 || n == 1)
      return 1
    else
      return n * facto(n - 1)
  }
}
object fact1 {
  def main(args: Array[String]): Unit = {
    val a=new facorial
    println(a.facto(3))
  }
}
