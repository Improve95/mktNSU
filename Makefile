dJar:
	rm lab.jar

c4: 
	flowc1 lab4v2.flow jar=lab

c5:
	flowc1 lab5/lab5.flow jar=lab I=lab5
	
run:
	java -jar lab.jar

