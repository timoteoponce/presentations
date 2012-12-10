package com.timoponce.model

/**
 * Created with IntelliJ IDEA.
 * User: timoteo
 * Date: 12/9/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
class Product(var id:Long,
              var name:String,
              var price:BigDecimal,
              var stock:Int ) extends Id{
}
