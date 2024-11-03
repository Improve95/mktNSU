dj:
	rm lab.jar

c4: 
	flowc1 lab4v2.flow jar=lab

c5:
	flowc1 block2/lab5.flow jar=lab I=block2/arith

c6:
	flowc1 block2/lab6.flow jar=lab I=block2/arith

r6:
	java -jar lab.jar expr="34 5 + 5 *"

