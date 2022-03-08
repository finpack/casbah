import sbt.Keys._

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.2.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")

//addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

Option(System.getProperty("scoverage")).getOrElse("false") match {
  case "true" => addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.3")
  case _ => libraryDependencies ++= Seq()
}

addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")
