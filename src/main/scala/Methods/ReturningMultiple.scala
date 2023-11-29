package Methods

object re{
  def getStockInfo = {
    ("Netflix", 100.00, 101.00,34)
  }

  val (symbol, currentPrice, bidPrice,id ) = getStockInfo

  def main(args: Array[String]): Unit = {
    println(getStockInfo)
    println(currentPrice)
    println(id)
  }
}