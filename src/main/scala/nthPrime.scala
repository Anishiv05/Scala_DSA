// time - O(n(log(log(n)))
// space - O(n)

object nthPrime {
  val size = 10000
  val ans = collection.mutable.ArrayBuffer[Int]()

  def seive() = {
    val prime = Array.fill(size)(true)

    for(i <- 2 to size-1 if prime(i)) {
      // mark multiples as false
      for(j <- i*i until size by i)
        prime(j) = false
    }

//    for(i <- 2 to size-1) {
//      if(prime(i))
//        ans += i
//    }
    ans ++= (2 until size).filter(prime).map(identity)

  }


  def main(args: Array[String]): Unit = {
    seive()
//    val i = StdIn.readInt()
//    println(ans(i-1))

    println(ans(2))
    println(ans(4))
    println(ans(10))
  }

}
