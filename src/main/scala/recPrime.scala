
object recPrime {
  def isPrime(n: Int): Boolean = n match {
    case x if x <= 1 => false
    case 2 | 3 => true
    case _ =>
      val sqrt = math.sqrt(n).toInt
      !(2 to sqrt).exists(n % _ == 0)
  }

  def nthPrime(n: Int): Int = {
    if(n <=0)
      throw new IllegalArgumentException("Number should be greater than 0")

    @annotation.tailrec
    def loop(num: Int, count: Int): Int = num match {
      case _ if count == n => num - 1
      case _ if isPrime(num) => loop(num + 1, count + 1)
      case _ => loop(num + 1, count)
    }

    loop(2,0)
  }

  def main(args: Array[String]): Unit = {
    println(nthPrime(1))
    println(nthPrime(2))
    println(nthPrime(3))
    println(nthPrime(4))
    println(nthPrime(5))
    println(nthPrime(10))
  }

  }
