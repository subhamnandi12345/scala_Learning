package Functional_Programming
package otherscope {
  class Foo {
    def exec(f:(String) => Unit, name: String) {
      f(name)
    }
  }
}
object ClosureExample extends App {
  var hello = "Hello"
  def sayHello(name: String) { println(s"$hello, $name") }
  // execute sayHello from the exec method foo
  val foo = new otherscope.Foo
  foo.exec(sayHello, "Al")
  hello = "Hola"
  foo.exec(sayHello, "Lorenzo")
}

/*If you’re coming to Scala from Java or another OOP language, you might be asking,
“How could this possibly work?” Not only did the sayHello method reference the vari‐
able hello from within the exec method of the Foo class on the first run (where hello
was no longer in scope), but on the second run, it also picked up the change to the hello
variable (from Hello to Hola). The simple answer is that Scala supports closure func‐
tionality, and this is how closures work.*/
