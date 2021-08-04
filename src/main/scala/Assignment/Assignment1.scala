package Assignment

import scala.io.StdIn.readLine

object Assignment1 {
   // val a=0;
    def fun(n: Int) = {
        for(a <- 1 to n) {
        println("MentorKonnet")
            }
    }
  def main(args: Array[String])
  {
    fun(3)
    println("enter the number: ")
    var Num = scala.io.StdIn.readInt()
    println(fun(Num))
     }

}
