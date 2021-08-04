package Assignment

object AssignmentStdin4 extends App{

  //import scala.io.StdIn.readLine


    def weekDays1(n: Int): String =
    {
      val weekNum = n match
        {
        case 1|8|15|22 => "Monday"
        case 2|9|16|23 => "tuesday"
        case 3|10|17|24 => "wednesday"
        case 4|11|18|25 => "thursday"
        case 5|12|19|26 => "friday"
        case 6|13|20|27 => "saturday"
        case 7|14|21|28 => "sunday"
        case _ => "invalid date"
      }
      return weekNum
    }
    println("enter the week number: ")
    val weekNum = scala.io.StdIn.readInt()
    println(weekDays1(weekNum))

}
