package list

/*
  P04 (*) find the number of elements in the list
  Example:
  scala > length(List(1,1,2,5,8))
  res0: Int = 6
 */
object P04 extends App {

  def lengthBuiltin[A](ls: List[A]): Int = ls.length

  def lengthRecursive[A](ls: List[A]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) {(c, _) => c + 1}

  def lengthTailRecursive[A](ls: List[A]): Int = {
    def lengthR(result: Int, list: List[A]): Int = list match {
      case Nil => result
      case _ :: tail => lengthR(result + 1, tail)
    }
    lengthR(0, ls)
  }
}
