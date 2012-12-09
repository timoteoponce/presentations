package com.timoponce.mobile

import javax.ejb._
import javax.persistence._
import javax.ws.rs._
import javax.ws.rs.core.MediaType

//@Stateless
//@LocalBean
@Path("/services")
class RestServices{

	@GET
    @Produces(Array(MediaType.TEXT_PLAIN))
    //@Path("/sayHello")
    def sayHello() : String  = {
        return "Hello rest"
    }	
}
