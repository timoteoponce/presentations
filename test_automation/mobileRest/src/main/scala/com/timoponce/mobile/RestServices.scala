package com.timoponce.mobile

import javax.ws.rs._
import javax.ws.rs.core.MediaType
import org.apache.commons.lang.Validate

@Path("/services")
class RestServices {

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  @Path("/sayHello")
  def sayHello(): String = {
    return "Hello rest"
  }

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  @Path("/registerSale")
  def registerSale(@QueryParam("salesmanId") salesmanId:Int,
                   @QueryParam("clientId") clientId:Int,
                   @QueryParam("productId") productId:Int,
                   @QueryParam("comments") comments:String) : String = {
    notNull( Array[Any](salesmanId, clientId, productId, comments))
    val salesService = new SalesService
    return "Sale stored : " + salesService.register( salesmanId, clientId, productId, comments)
  }

  def notNull(args:Array[Any]){
    args.foreach(Validate.notNull)
  }
}
