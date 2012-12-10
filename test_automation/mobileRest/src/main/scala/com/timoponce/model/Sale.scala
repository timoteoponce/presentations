package com.timoponce.model

import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: timoteo
 * Date: 12/10/12
 * Time: 12:04 AM
 * To change this template use File | Settings | File Templates.
 */
class Sale(val id:Long,
           val date:Date,
           val salesman:Salesman,
           val client:Client,
           val product:Product,
           val cost:BigDecimal) {

}
