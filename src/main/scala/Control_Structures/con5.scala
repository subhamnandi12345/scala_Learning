package Control_Structures
import scala.annotation.switch
object con5 {
  def main(args: Array[String]): Unit = {
      val i = 2
      val x = (i: @switch) match {
        case 1 => "One"
        case _ => "Other"
        case 2 => "Two"
      }
    println(x)
    }

}
