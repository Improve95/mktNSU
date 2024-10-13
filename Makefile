dJar:
	rm lab.jar

c4: 
	# ../bin/flowc1 lab4v2.flow jar=lab

c5:
	../bin/flowc1 block2/lab5.flow jar=lab I=block2/arith

c6:
	../bin/flowc1 block2/lab6.flow jar=lab I=block2/arith

run:
	java -jar lab.jar

