package Classes_And_Properties

class Student{
  var age:Int = 0
   var roll:Int=0
  def this(id: Int, name: String,  age: Int) {
    // Calling primary constructor
    this()
    this.age = age
  }
  def this(  age: Int,roll:Int){
  //this(id,name,age)
  this()
    this.age=age
    this.roll=roll

  }
  def showDetails(){
   // println(id+" "+name+" "+age+" "+roll)
  }
}

object MainObject111{
  def main(args:Array[String]){
    var s = new Student(101,"Raman",20)
    s.showDetails()
    var s1=new Student(23,24)
    s1.showDetails()
    var s2=new Student()
  }
}