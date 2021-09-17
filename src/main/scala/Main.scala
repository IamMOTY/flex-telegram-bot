import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.io.StdIn.readLine

object Main extends App {
  val bot = new RandomBot("2002905302:AAF-mk0UFfbVcziCS-Azfk2xxYEYDxUe5jg")
  val eol = bot.run()
  println("Press [ENTER] to shutdown the bot, it may take a few seconds...")
  scala.io.StdIn.readLine()
  bot.shutdown() // initiate shutdown
  // Wait for the bot end-of-life
  Await.result(eol, Duration.Inf)
}