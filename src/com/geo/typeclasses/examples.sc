import scala.math.Ordering

implicit val minOrdering = Ordering.fromLessThan[Int]{(n1, n2) => n1 < n2}
val maxOrdering = Ordering.fromLessThan[Int]((n1, n2) => n1 > n2)

List(3, 4, 2).sorted
List(3, 4, 2).sorted(maxOrdering)