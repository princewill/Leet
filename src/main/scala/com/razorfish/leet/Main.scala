package com.razorfish.leet

import com.razorfish.leet.Leet.Leetable

object Leet {

  trait Leetable[T] {
    def toLeet(in: T): String
  }

  def apply[T](in: T)(implicit leetable: Leetable[T]): String = leetable.toLeet(in)
}

object Main {
  def main(args: Array[String]): Unit = {
    implicit val leet = Solution

    val argsToConvert = args(0)
    val convertedString = Leet.apply(argsToConvert)
    val foo = s"$argsToConvert -> $convertedString"
    println(foo)

  }
}

object Solution extends Leetable[String] {

  override def toLeet(in: String): String = in flatMap {
      case 'a' | 'A' => "4"
      case 'e' | 'E' => "3"
      case 'i' | 'I' => "1"
      case 'o' | 'O' => "0"
      case 's' | 'S' => "5"
      case 't' | 'T' => "7"
      case anyChar   => s"$anyChar"
    }
}



