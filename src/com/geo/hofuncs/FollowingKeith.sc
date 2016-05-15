import com.geo.hofuncs._

val l = List(1, 2, 3, 4, 10)
val m = List(6, 7, 9, 11)

//def square(x: Int): Int = x * x
def square = (x: Int) => x * x

l.map(square)
l.map(x => x * x)

def f(x: Int): Option[Int] =
  if (x > 2 & x < 10) Some(x) else None

l.map(x => f(x))

l.zip(m)

def q(v: Int) = List(v - 1, v, v + 1)

q(3)

l.flatMap(x => q(x))

l.flatMap(x => f(x))

def g(x: Int): MOption[Int] =
  if (x > 2 && x < 10) MSome(x) else MNone

l.map(x => g(x))