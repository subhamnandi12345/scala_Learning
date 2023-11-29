package Collections_task

//program to create a map and retrieve the value associated with a given key

object RetrieveValueFromMapExample {
  def main(args: Array[String]): Unit = {
    val color_map = Map("Red" -> 1, "Green" -> 2, "Blue" -> 3, "Orange" -> 4)
    println("Map: " + color_map)
    val color_key = "Blue"
    val value = color_map.getOrElse(color_key, "Key not found")
    println(s"The value associated with key '$color_key' is: $value")
  }
}

