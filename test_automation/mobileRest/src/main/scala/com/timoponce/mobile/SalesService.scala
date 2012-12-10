package com.timoponce.mobile

import com.timoponce.model.{Sale, Client, Salesman, Product}
import javax.enterprise.deploy.spi.exceptions.ClientExecuteException
import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: timoteo
 * Date: 12/9/12
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
class SalesService {

  val salesmen: List[Salesman] = List(
    new Salesman(1,"Timoteo Ponce",10),
    new Salesman(2,"Marius Lang",15),
    new Salesman(1,"Ranjan Benz",250)
  )
  val clients: List[Client] = List(
    new Client(1,"Vladimir Albis"),
    new Client(2,"Eduardo Sandino"),
    new Client(3,"Gustavo Vera"),
    new Client(4,"Ramiro Sanchez")
  )
  val products: List[Product] = List(
    new Product(1,"yubikey",100,20),
    new Product(2,"b4",200,20),
    new Product(3,"cet",300,20),
    new Product(4,"arch",400,20)
  )
  var sales: List[Sale] = List()

  def register(salesmanId: Int, clientId: Int, productId: Int, comments: String): String = {
    val salesman = salesmen.find( s => s.id == salesmanId )
    val client = clients.find( c => c.id == clientId )
    val product = products.find( p => p.id == productId )

    var result:Long = -1
    if( salesman.nonEmpty && client.nonEmpty && product.nonEmpty){
      sales ::= new Sale(
                      System.nanoTime,
                      new Date(),
                      salesman.get,
                      client.get,
                      product.get,
                      product.get.price)
      result = sales.last.id
    }
    return result.toString
  }
}
