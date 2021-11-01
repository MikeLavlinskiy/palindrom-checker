import scala.io.StdIn

object Main extends App {
  val palindromeService = new PalindromeService

  print("String for checking:")

  val string = StdIn.readLine();

  val pd = PalindromeData(string)

  val res = palindromeService.check(pd)

  if (res) {
    println("It is palindrome")

  } else {
    println("It is not palindrome")

  }

}
