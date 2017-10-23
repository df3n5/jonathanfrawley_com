package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import scalatags.Text.all._

import blogs._
import blogs.blogToHtml

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] =>

    //Ok(views.html.index())
    Ok(blogToHtml(Blog_2017_10_12).toString).as("text/html")
  }
}
