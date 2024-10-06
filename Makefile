dJar:
	rm lab.jar

c4: 
	../bin/flowc1 lab4v2.flow jar=lab

c5:
	../bin/flowc1 lab5/src/lab5.flow jar=lab I=lab5/src
	
run:
	java -jar lab.jar

