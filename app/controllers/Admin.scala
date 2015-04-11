package controllers

import play.api.mvc._

object Admin extends Controller {

  def createDb = Action {
    persistence.Db
    Ok("DB is created")
  }
  
}
