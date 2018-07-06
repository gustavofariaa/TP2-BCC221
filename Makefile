all:
	javac view/*.java

clean:
	rm view/*.class

run:
	java view.Menu
