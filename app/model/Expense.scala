package model

import org.joda.time.DateTime

import Currency._

case class Expense(currency : Currency, value: Int, created: DateTime)
