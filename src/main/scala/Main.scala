import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {

    println("enter a positive no : - \n")
    val input = StdIn.readLine().toInt
    if(input < 0) println("Invalid number")
    else
      println(prime(input))

  }

  def isPrime(i: Int): Boolean = {
    if (i <= 1) return false
    if (i == 2 || i == 3) return true
    if (i % 2 == 0 || i % 3 == 0) return false

    var num = 5
    while (num * num <= i) {
      if (i % num == 0 || i % (num + 2) == 0) return false
      num += 6
    }
    true
  }

  def prime(n: Int): Int = {
    var count = 0
    var i = 2
    while (count < n) {
      if (isPrime(i)) count += 1
      i += 1
    }
    i - 1
  }
}
