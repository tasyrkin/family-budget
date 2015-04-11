package controllers

import play.api.mvc._

object Expenses extends Controller {
  
  def list() = Action {
    Ok(views.html.expenses())
  }
  
}
