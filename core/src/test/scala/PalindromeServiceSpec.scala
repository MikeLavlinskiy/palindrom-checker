import org.scalatest.flatspec._
import org.scalatest.matchers._
import org.scalatest._

class PalindromeServiceSpec extends AnyFlatSpec with should .Matchers {
  def victim() = new PalindromeService

  "PalindromeService" should "return true if word is palindrome" in {
    val pd = PalindromeData("aba")

    victim().check(pd) should be (true)
  }

  "PalindromeService" should "return false if word it is not palindrome" in {
    val pd = PalindromeData("abc")

    victim().check(pd) should be (false)
  }

  it should "return false for empty words" in {
    val pd = PalindromeData("")
    victim().check(pd) should be (false)
  }
}
