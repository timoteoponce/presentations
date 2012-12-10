package com.timoponce.mobile

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Created with IntelliJ IDEA.
 * User: timoteo
 * Date: 12/10/12
 * Time: 12:13 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(classOf[JUnitRunner])
class SalesServiceTest extends FunSuite {

  val salesService: SalesService = new SalesService

  test("Invalid salesman are not allowed") {
    val result = salesService.register(
      -1, 1, 1, "test"
    )
    assert(result == "-1")
  }

  test("Invalid clients are not allowed") {
    val result = salesService.register(
      1, -1, 1, "test"
    )
    assert(result == "-1")
  }

  test("Invalid products are not allowed") {
    val result = salesService.register(
      1, 1, -1, "test"
    )
    assert(result == "-1")
  }
}
