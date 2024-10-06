detete-jar:
	rm lab.jar

c4: detete-jar
	../bin/flowc1 lab4v2.flow jar=lab

c5: detete-jar
	
run:
	java -jar lab.jar

