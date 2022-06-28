class A{
  println("A")
  def run: Unit ={
    println("a run")
  }
}
class B extends A{
  println("B")
  override def run: Unit ={
    println("b run")
  }
}
class C extends B with D{
  println("C")
  override def run: Unit ={
    println("c run")
  }
}
trait D{
  println("D")

  def run(): Unit ={
  }
}

object MainObject {
  def main(args: Array[String]) = {
    new B().run
    new C().run
  }

}  