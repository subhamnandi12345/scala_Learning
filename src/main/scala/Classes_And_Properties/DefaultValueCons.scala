package Classes_And_Properties

class Socket(val timeout: Int = 1000, val linger: Int = 2000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}
object subham extends App {
  val p=new Socket()
  println(p)
}