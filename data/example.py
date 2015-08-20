from lightning import Lightning
from numpy import random, ceil, array

lgn = Lightning()

x = random.randn(100) * 15
y = random.randn(100) * 15

viz = lgn.scatterstreaming(x, y)

for _ in range(100):
	x = random.randn(100) * 15
	y = random.randn(100) * 15
	viz.append(x, y)