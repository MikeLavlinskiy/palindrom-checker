import sbt._

object Dependencies {
  lazy val scalaTestVersion = "3.2.9"
  val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion % Test
}
