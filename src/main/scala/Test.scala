/**
  * Created by Tiru on 2/23/2016.*/
/*

object Test{
  def print( x: Int) = (2,3)
  def main(args: Array[String]) {
    var x = 20
    var y = 30
    (x,y) = print(5)
  }
}
*/


/*
import util.control.Breaks._
import java.util.concurrent.CyclicBarrier

class A extends Runnable{
  def apply(){}
  def run();

}
object Test {

  def main(args: Array[String]): Unit = {
    var x = 0
      while (x < 30) {
        while (x < 15) {
          (1 until 10).map{
                      k =>
                        x = x+ 1
                        println(x)
                    }
          if (x == 15){
            println("breaking\n")
            return
          }
        }
        x = x-10
        println(s"still inside outer  x-> $x")
      }
    println("BYe ")
  }
}
*/
