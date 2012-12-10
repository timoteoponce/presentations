package com.timoponce.model

/**
 * Created with IntelliJ IDEA.
 * User: timoteo
 * Date: 12/9/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
trait Id{
  var id: Long
  var name: String

  override def toString() = this.id + " - " + this.name
}
