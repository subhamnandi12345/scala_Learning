package Traits
//to restrict mixing of traits to a limited number of classes

class Animal{

}
class Human{

}
trait Pet1 extends Animal{

}
trait Pet11 extends Human
class Dog extends Animal with Pet1{

}
class Male extends Human with Pet11 {

}
object abs extends App
