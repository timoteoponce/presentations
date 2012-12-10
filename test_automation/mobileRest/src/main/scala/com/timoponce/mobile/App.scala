package com.timoponce.mobile

import com.timoponce.model.Salesman

/**
 * @author ${user.name}
 */
object App {

  var id:Int = _
  var id2:List[Salesman] = List(
    new Salesman(1,"Timoteo Ponce",10),
    new Salesman(2,"Marius Lang",15),
    new Salesman(1,"Ranjan Benz",250)
  )
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" + id +" - " + id2)
    println("concat arguments = " + foo(args))
  }

}
