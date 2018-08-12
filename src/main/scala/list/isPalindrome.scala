package list

/*
  P06(*) find out whether a list is a
  Example:
  scala> isPalindrome(List(1,2,3,2,1))
  res0: Boolean = true
 */
object isPalindrome {
  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
}
