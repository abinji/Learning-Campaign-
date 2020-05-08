package com.Learning.Scala

object ScalaList {

  def main(args: Array[String]): Unit = {

    //Scala List object

    val a = List(1, 2, 3)
   // a.foreach {println}

    val x = List.range(0,10,2)
   // x.foreach {println}
    var sum =0
    x.foreach(sum += _)
    println(sum)

    val num = List[Number](1, 2.0, 33d, 0x1)
   // num.foreach(println)

    val str = List.fill(3)("foo")
    //str.foreach(println)

    val xsqr = List.tabulate(5)(n => n * n)
    //xsqr.foreach(println)

    val y = a:::x:::str
   // y.foreach(println)

    val concaty = List.concat(a,x)
    //concaty.foreach(println)

    val names = List("Thyaga", "Vigiee", "Abin")
    for (name <- names)
    println(name)

    val lower = names.map(_.toLowerCase)
    println(lower)

    val upper = names.map(_.toUpperCase)
    println(upper)

    for (name <- names if name.startsWith("V"))
    println(name)

    val z = List.range(0,10,1)
    val evens = z.filter(a => a % 2 == 0)
    println(evens)

    val xz = z.takeWhile(a => a < 6)
    println(xz)

    val zy = z.map(a => a * 2)
    println(zy)

  }
}