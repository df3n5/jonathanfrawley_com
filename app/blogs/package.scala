package blogs

import scalatags.stylesheet.{CascadingStyleSheet, StyleSheet}
import scalatags.Text.all._

object GlobalStyleSheet extends StyleSheet {
  initStyleSheet()

  val style = cls(
    display := "block",
    whiteSpace := "pre-wrap"
  )

}

package object blogs {
  def blogToHtml(blog: Blog): Tag =
    html(
      head(tag("style")(GlobalStyleSheet.styleSheetText)),
      body(
        div(
          GlobalStyleSheet.style,
          h1(blog.title),
          h2(blog.subtitle),
          h3(blog.date),
          blog.content
        )
      )
    )
}
