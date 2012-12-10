package com.timoponce.model

/**
 * Created with IntelliJ IDEA.
 * User: timoteo
 * Date: 12/9/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
class Salesman(var id:Long, var name:String,var totalSales:BigDecimal) extends Id{

  override def toString() = super.toString() + " - " + totalSales
}
