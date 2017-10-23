package blogs

import scalatags.Text.all.Tag

abstract class Blog {
  val title: String
  val subtitle: String
  val date: String
  val content: Tag
}
