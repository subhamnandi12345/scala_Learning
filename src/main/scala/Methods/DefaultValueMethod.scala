package Methods

class DefaultValueMethod {
//  def makeConnection(timeout: String = "5000", protocol:String= "http") {
//    println("timeout = %s, protocol = %s".format(timeout, protocol))
//  }
  var a=12
  var b=13

  def makeConnection= a+b
  def changeValue={
    a=20
    b=30
  }
  var c=a+b
}
object scala1{
  def main(args: Array[String]): Unit = {
    val obj=new DefaultValueMethod
//    obj.makeConnection("57859")
//    obj.makeConnection(protocol = "scala")

    obj.changeValue
    println(obj.c)
    println( obj.makeConnection)
  }
}

