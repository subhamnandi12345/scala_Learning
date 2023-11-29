package Classes_And_Properties.Classes_And_Properties

case class Book(name: String, author: String){
  def display= "hii i am in case class"
}

object case11 {

  def main(args: Array[String]) {
    var Book1 = Book.apply("Data Structure and Algorithm", "cormen")
    var Book2 = Book("Computer Networking", "Tanenbaum")

    // Display strings
    println("Name of the Book1 is " + Book1.name);
    println("Author of the Book1 is " + Book1.author);
    println("Name of the Book2 is " + Book2.name);
    println("Author of the Book2 is " + Book2.author);

    println(Book1.display)
    println(Book2.display)
    println(Book1)
    println(Book2)
  }
}
