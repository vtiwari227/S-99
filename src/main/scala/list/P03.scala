package list
/*
  P03(*) find the Kth element of the list
  Example:
  scala> nth(2, List(1,1,2,3,5,8))
  res0: Int = 2
 */
object P03 {

  def nthBuiltin[A](n: Int, ls: List[A]): A =
    if (n >= 0) ls(n)
    else throw new NoSuchElementException

  def nthRecurisve[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _:: tail) => nthRecurisve(n-1, tail)
    case(_, Nil) => throw new NoSuchElementException
  }
}
