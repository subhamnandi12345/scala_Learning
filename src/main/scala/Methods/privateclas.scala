package Methods

class Foo {
  private  def isFoo = true
  def doFoo() {
    if (this.isFoo) {
      // this line won't compile
      println("hello scala")
    }
  }
}
object scala11 extends App{
  val ab=new Foo
  ab.doFoo()
}