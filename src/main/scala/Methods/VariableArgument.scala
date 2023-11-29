package Methods
object ar extends App {
  def printAll(strings: String*) {
    strings.foreach(println)
  }
  printAll()
  printAll("foo")
  printAll("foo", "bar")
  printAll("foo", "bar", "baz")

}