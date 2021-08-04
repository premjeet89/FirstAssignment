package Assignment

object Assignment4 extends App {
  def weekDays(n: Int): String = {
      val days = n match {
      case 1|8|15|22 => "monday"
      case 2|9|16|23 => "tuesday"
      case 3|10|17|24 => "wednesday"
      case 4|11|18|25 => "thursday"
      case 5|12|19|26 => "friday"
      case 6|13|20|27 => "saturday"
      case 7|14|21|28 => "sunday"
      case _ => "invalid date"
    }
    return days
  }
println(weekDays(26))
}
