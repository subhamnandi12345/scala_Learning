package Classes_And_Properties

class Student1(private var id:Int, name:String){
  var age:Int = 0
   var roll:Int=0
  def this(id: Int, name: String,  age: Int){
   this(id, name)     // Calling primary constructor
    this.age = age
  }
  def this() {
    this(id=2344,name="sub")
  }
  def this(  age: Int,roll:Int){
  //this(id,name,age)
     this(id=2344,name="sub")
    this.age=age
    this.roll=roll

  }
  def showDetails(){
    println(id+" "+name+" "+age+" "+roll)
  }
}

object Test{
  def main(args:Array[String]){
    var s = new Student1(101,"Raman",20)
    s.showDetails()
    var s1=new Student1(23,24)
    s1.showDetails()
    var s2=new Student1()
  }
}