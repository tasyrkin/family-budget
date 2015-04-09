package persistence

import model.Expense
import sorm._

object Db extends Instance(
  entities = Set(
    Entity[Expense]()
  ),
  url = "jdbc:h2:mem:test",
  user = "",
  password = "",
  initMode = InitMode.Create
)
