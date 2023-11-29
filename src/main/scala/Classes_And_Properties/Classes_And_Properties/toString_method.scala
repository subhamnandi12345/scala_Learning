package Classes_And_Properties.Classes_And_Properties


class Language(LangArticle: Int, LangName: String) {
  def getLangArticle(): Int = {

    return LangArticle;
  }

  def getLangName(): String = {

    return LangName;
  }

  // Overriding tostring method
  override def toString(): String = {

    return "[Total Article : " + LangArticle +
      ", Language Name = " + LangName + "]";
  }

}


object GFG {
  def main(args: Array[String]) {

    var language = new Language(50, "Scala");

    println(language)

  }
}
