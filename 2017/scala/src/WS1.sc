def str = "Malcolm vs david"

def fight(fighter:String):String = {
  val nr = 1
  val sum = nr + fighter
  println(sum)
  return "Malcolm"
}

fight("David"
)

def david = Option("David el bueno")
println(david)

def malcolm = None

println(s"El valor de malcolm es $malcolm")

case class Band(id:Long, nombre:String, rank:Int)

///public class.... private final ..... constructor... getter ... equals ... hashcode
// trait




var ambaiba = Band(1,"Ambaiba",1)

println(ambaiba)

ambaiba = ambaiba.copy(rank = 2)

List("test", "asdf")
Map("a" -> "test", "b" -> "some other test", "z" ->233)

println(Set("malcolm","malcolm","malcolm","david"))


def error(code:Int)={
  code match {
    case 404 => "Es error de dAvid"
    case 401 => "No sabemos"
    case _ => "David no sabe"
  }
}

List(1,2,4,404,1).foreach{ i => println(error(i))}

1 to 20 foreach{ it => println("Ambaiba")}


"David tiene una duda existencial".split(" ").filter(_ == "duda")


case class Comparsero(id:Int, nombre:String){
  def +(other: Comparsero): Comparsero ={
    this.copy(this.id + other.id)
  }
}

val davidElBueno = Comparsero(1,"david")
val davidElMalo = Comparsero(1,"david camacho")

println(s"Son iguales=${davidElBueno == davidElMalo}")
println(s"Son iguales=${davidElBueno == davidElBueno}")

println(davidElBueno + davidElMalo)

lazy val xxx = "triple x"

// private String xxx = null
// getXXX() if (xxx == null) synchronizer (xxxx = "dfdf") return xxxx;
