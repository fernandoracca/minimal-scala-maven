package rfq

import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class MainTest extends FunSuite {

  test("Simple") {
    val main = new Main()
    val result = main.x
    assert(result == "RFQ")
  }
}
