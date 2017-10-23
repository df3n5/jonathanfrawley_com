package blogs

import scalatags.Text.all._

object Blog_2017_10_12 extends Blog {
  val title = "Scala Overmatching"
  val subtitle = "When matching is a bad fit"
  val date = "2017-10-12"
  val content: Tag =
    div(
      p("Pattern matching in Scala is a very powerful technique when used correctly. Today, I would like to talk about some particularly strange usages of it that I have come across recently. I will talk about a few different anti-patterns I have seen and how they can be avoided."),
      h3("Why not getOrElse?"),
        p("The first kind is when someone uses a match expression when a ", code(".getOrElse"), " would suffice. Here is an example snippet:"),
        code("""
          |  val DefaultName = "EMPTY"
          |  ...
          |  val maybeName: Option[String] = fetchName()
          |  val name = maybeName match {
          |    case Some(name) => name
          |    case None => DefaultName
          |  }""".stripMargin),
        p("As you can see, there are 4 lines of code to tell ", code("name"), " to be ", code("maybeName"), " if it is defined and a default value otherwise. This happens to be the exact semantics captured by the ", code(".getOrElse"), " method of the ", code("Option"), " type. With this in mind, we can improve our code:"),
        code("""
            |  val DefaultName = "EMPTY"
            |  ...
            |  val name: String = fetchName().getOrElse(DefaultName)""".stripMargin),
        p("This eliminates 4 lines of code and in my opinion is simpler for the reader to understand what is happening.")
    )

}
