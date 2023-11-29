package StringChapter

object example2 {
  def main(args: Array[String]): Unit = {
    var result =for{
      c<-"Hello, World"
     if c !='l'
    } yield c.toUpper
     println(result)
  }
}
