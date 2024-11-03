dj:
	rm lab.jar

c4: 
	# ../bin/flowc1 lab4v2.flow jar=lab

c5:
	../bin/flowc1 block2/lab5.flow jar=lab I=block2/arith

c6:
	../bin/flowc1 block2/lab6.flow jar=lab I=block2/arith

r6:
	java -jar lab.jar expr="7 8 + 15 *"

c7:
	../bin/flowc1 block2/lab7.flow jar=lab I=block2/arith

r7:
	java -jar lab.jar expr="7 + 8"

