package controllers

import model.Expense
import persistence.Db
import play.api.mvc._

object Expenses extends Controller {
  
  def list() = Action {

    val expenses = Db.query[Expense].fetch()

    Ok(views.html.expenses(expenses))
  }

  def show(id: Long) = Action {
    Ok(s"Showing expense $id")
  }

  def create() = Action {
    Ok("Created")
  }

}
