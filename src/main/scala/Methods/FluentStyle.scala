package Methods
class Person{
 protected  var fname = ""
 protected var lname = ""

def setFirstName(firstName: String):this.type  = {
  fname = firstName
  this
}
def setLastName(lastName: String):this.type = {
  lname = lastName
  this
}
  def setShool(school:String):this.type ={
    println(school)
    this
  }
}
class Employee extends  Person {
  protected var role = ""
  def setRole(role: String): this.type = {
    this.role = role
     this
  }
//  override def toString = {
//    "%s, %s, %s".format role)
//  }
}
object Main extends App {
   val employee = new Employee
  // using  the fluent methods
  val per=new Person
  per.setLastName("nandi").setFirstName("subham")
  employee.setFirstName("Al")
           .setLastName("Alex")
           .setRole("Developer")
  println(employee)
}