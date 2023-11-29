class car(var name:String){
  var a=10
  var b=10
}
object parts{
  def main(args: Array[String]): Unit = {
    var obj=new car("scala")
    var obj1=new car("scala")
    println(obj.a==obj.b)
    println(obj.a.hashCode()==obj.b.hashCode())
    println(obj.a.equals(obj.b))
  }
}

