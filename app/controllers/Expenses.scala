package controllers

import model.Expense
import org.joda.time.DateTime
import persistence.Db
import play.api.mvc._

object Expenses extends Controller {
  
  def list() = Action {

    val expenses = Db.query[Expense].fetch()

    Ok(views.html.expenses(expenses))
  }

  def show(id: Long) = Action {
    
    val expense = Db.query[Expense].whereEqual("id", id).fetchOne()
    
    Ok(s"Showing expense: $expense")
  }

  def create() = Action {
    Ok("Created")
  }
  
  def createSample() = Action {
    val sample = Db.save( Expense(10000, new DateTime) )
    Ok("Sample was created: " + sample)
  }

}
