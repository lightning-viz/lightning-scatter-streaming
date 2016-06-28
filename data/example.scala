import org.viz.lightning._
import scala.util.Random

val lgn = Lightning()

var x = Array.fill(100)(Random.nextDouble() * 15)
var y = Array.fill(100)(Random.nextDouble() * 15)

val viz = lgn.scatterStreaming(x, y)

Range(0,100).foreach { _ =>
	x = Array.fill(100)(Random.nextDouble() * 15)
	y = Array.fill(100)(Random.nextDouble() * 15)
	lgn.scatterstreaming(x=x, y=y, viz=viz)
}
