package labsheet7

import scala.io.StdIn

object q2 {
  def main(args: Array[String]): Unit = {
    print("Enter the list of integers separated by commas: ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toInt).toList

    val Output = calculateSquare(InputList)
    println("\n" + Output)

  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }


}
