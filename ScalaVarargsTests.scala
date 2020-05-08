package com.Learning.Scala

object ScalaVarargsTests {

  def main(args: Array[String]) {

    printAll("foo")
    printAll("Ousu", "Thyaga", "Vignesh", "Abin")

    //Note: Within the "printAll" function, the variable "names" is created as a Scala Array.
  }

  //the varargs syntax is adding the * symbol after the String declaration,

  def printAll(names: String*) {
    names.map(println)
  }
}
