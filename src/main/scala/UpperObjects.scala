/**
  * Created by Prashant Pillai on 8/8/2016.
  */
object UpperObjects {
  def main(args: Array[String]): Unit = {
      val output = args.map(_.toUpperCase()).mkString("[",",","]")
      println(output)
  }
}
