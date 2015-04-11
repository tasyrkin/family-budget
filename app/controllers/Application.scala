package controllers

import play.api.mvc._
import play.twirl.api.Html

object Application extends Controller {

  def welcome = Action {
    Ok(views.html.index("Welcome to the Family Budget build with Play and Scala"))
  }

  def heartbeat = Action {
    Ok(views.html.main("Heartbeat")(Html("""200 OK""")))
  }

}