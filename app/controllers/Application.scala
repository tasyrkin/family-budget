package controllers

import play.api.mvc._
import play.twirl.api.Html

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def main = Action {
    Ok(views.html.main("Hello, world!")(Html("""<div id="1">This is a sample content</div>""")))
  }

}