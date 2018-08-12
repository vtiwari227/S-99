package list

object P01 extends App {
  def lastBuiltin[A](list: List[A]): A = list.last

  def lastRecursive[A](list: List[A]): A = list match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case  _  => throw new NoSuchElementException
  }

  val list = List(1,2, 3, 4)
  println(s"last element of the list is ${lastRecursive(list)}")
}
