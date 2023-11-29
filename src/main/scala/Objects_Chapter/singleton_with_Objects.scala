package Objects_Chapter

object CashRegister {
  def open { println("opened") }
  def close { println("closed") }
}
object Main extends App {
  CashRegister.open
  CashRegister.close
}

//import java.util.Calendar
//import java.text.SimpleDateFormat
//object DateUtils {
//  def getCurrentDate: String = getCurrentDateTime("EEEE, MMMM d")
//  def getCurrentTime: String = getCurrentDateTime("K:m aa")
//  private def getCurrentDateTime(dateTimeFormat: String): String = {
//    val dateFormat = new SimpleDateFormat(dateTimeFormat)
//    val cal = Calendar.getInstance()
//    dateFormat.format(cal.getTime())
//  }
//}
//object cal extends App{
//  println( DateUtils.getCurrentDate)
//  println(DateUtils.getCurrentTime)
//}
