class PalindromeService {
  def check(word: PalindromeData): Boolean = {
    val copy = word.a;
    val reversed = word.a.reverse
    copy.equals(reversed) && copy.nonEmpty
  }
}
