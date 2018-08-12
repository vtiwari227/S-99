package list

/*
  P02 (*) find the last but one element of a list
  Example: scala > penultimate(List(1,2,3,4,5))
  res0: Int = 4
 */
object P02 {
  def penultimateBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  def penultimateRecursive[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _:: tail => penultimateRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
