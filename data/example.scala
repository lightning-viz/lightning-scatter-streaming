import org.viz.lightning._
import scala.util.Random

val lgn = Lightning()

var x = Array.fill(100)(Random.nextFloat() * 15)
var y = Array.fill(100)(Random.nextFloat() * 15)

val viz = lgn.scatterstreaming(x, y)

Range(100).forEach(
	x = Array.fill(100)(Random.nextFloat() * 15)
	y = Array.fill(100)(Random.nextFloat() * 15)
	lgn.scatterstreaming(x, y, viz)
)
