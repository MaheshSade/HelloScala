

object Prepare {
  def main(args: Array[String]): Unit = {
    var e=new Emp(name="kldv",id = 4,salary = 424)
    e.salaryInc()
  }
}

 class Emp(id:Int,name:String){
   var salary:Float = 994

   def this(id:Int,name:String,salary:Float){
     this(id,name)
     this.salary=salary
     println("id: "+id,"Name: "+name,"salary: "+salary)

   }

   def salaryInc=()=>println("lkdfv")
//   {
//     salary = salary.+(salary.*(per./(100)))
//     println(per.toFloat/(100))
////     println(per.)
//     println("id: " + id, "Name: " + name, "salary: " + salary)
//   }
}