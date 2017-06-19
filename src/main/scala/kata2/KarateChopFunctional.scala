package kata2

import scala.annotation.tailrec

class KarateChopFunctional {
}

object KarateChopFunctional {

  def chopFunctional(number: Int, array: Array[Int]): Int = {
    @tailrec
    def chopIt(left: Int, right: Int): Int = {
      if (left > right) {
        return -1
      }
      val pivot: Int = left + (right - left) / 2
      array(pivot) match {
        case mv if number < mv => chopIt(left, pivot - 1)
        case mv if number > mv => chopIt(pivot + 1, right)
        case _ => pivot
      }
    }

    chopIt(0, array.length - 1)
  }
}