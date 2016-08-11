import org.joda.time.DateTime

/**
  * Created by Prashant Pillai on 8/7/2016.
  */
object HelloSBT extends App{
  val now = new DateTime()

  println("Hi SBT, the time is "+ now.toString("hh:mm aa"))

  val up = new Upper

  println(up.upper("Hello", "World"))

  val message = "Hello, World!!"

  println(message.contains("le"))


}
