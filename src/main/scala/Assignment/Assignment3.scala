package Assignment

import scala.collection.mutable.ListBuffer

object Assignment3 extends App{

  val name = List("mentor", "konnect", "world")
  val newString = ListBuffer[String]()

  def finalString(name: List[String]) : ListBuffer[String] =
      {
            for(n <- name)
            {
              newString += "HELLO " + n.toUpperCase()

            }
        return newString

      }
      println(finalString(name))
         }
