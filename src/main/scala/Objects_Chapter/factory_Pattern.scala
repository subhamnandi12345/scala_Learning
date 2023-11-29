package Objects_Chapter

trait Animal {
  def speak
}
object Animal {
  private class Dog extends Animal {
    override def speak { println("woof") }
  }
  private class Cat extends Animal {
    override def speak { println("meow") }
  }
  // the factory method
  def apply(s: String): Animal = {
    if (s == "dog") new Dog
    else new Cat
  }
}
object factory {
  def main(args: Array[String]): Unit = {
    val cat = Animal("cat") // returns a Cat
    val dog = Animal("dog") // returns a Dog
    println(cat.speak)
    println(dog.speak)
  }
}
