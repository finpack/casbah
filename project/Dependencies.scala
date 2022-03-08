/*
  * Copyright 2015 MongoDB, Inc.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

import sbt._

object Dependencies {
  val mongoJavaDriver  = "org.mongodb" % "mongo-java-driver" % "3.12.10"
  val slf4j            = "org.slf4j" % "slf4j-api" % "1.7.36"
  val junit            = "junit" % "junit" % "4.10" % "test"
  val slf4jJCL         = "org.slf4j" % "slf4j-jcl" % "1.7.36" % "test"

  def scalatime(scalaVersion: String) =
    scalaVersion match {
      case _ => "com.github.nscala-time" %% "nscala-time" % "2.30.0"
    }

  def scalatest(scalaVersion: String) =
    scalaVersion match {
      case _ => "org.scalatest" %% "scalatest" % "3.2.11"  % "test"
    }

  def specs2(scalaVersion: String) =
    scalaVersion match {
      case _ => Seq("org.specs2" %% "specs2-core" % "4.14.1" % "test",
        "org.specs2" %% "specs2-junit" % "4.14.1" % "test"
      )
    }

  def specs2Mock(scalaVersion: String) = {
    Seq("org.specs2" %% s"specs2-mock" % "4.14.1" % "test")
  }

  def scalaStyle(scalaVersion: String) =
    scalaVersion match {
      case "2.10.5" =>  Seq("org.scalastyle" %% "scalastyle" % "0.4.0"  % "test")
      case _   => Seq()
    }
}
