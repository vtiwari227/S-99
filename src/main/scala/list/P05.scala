package list

/*
  P05 (*) Reverse a list
  Example:
  scala: reverse(List(1,1,2,3,5,8))
  res0: List[Int] = List(8,5,3,2,1,1)
 */
object P05 extends App {
  def reverseBuiltin[A](ls: List[A]): List[A] = ls.reverse

  def reverseRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil => result
      case h :: tail => reverseR(h :: result, tail)
    }
    reverseR(Nil, ls)
  }

  def reverseFunctional[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) { (r, h) => h :: r}
}
