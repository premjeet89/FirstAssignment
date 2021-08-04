package Assignment

object Assignment2 extends App{

  val numbers = Seq(2,4,6,7,10,3)
    val result = numbers.filter(x => x%2==1).sum
    println(result)
}
