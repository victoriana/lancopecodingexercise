
1. and 2. 
DESCRIPTRION OF PROBLEM:
	Get acyclic graph's node children 
	and unique nodes on graph walk where graph is:
   A

     B

       E

       F

     C

       G

       H

       I

     D

       J



HOW TO RUN SOLUTION
   	ant clean
		# this will pristine up environment
	ant
		# this will:
		# compile GNode.java, G.java and the test Main.java
		# create dist/lacome.jar file
		# runs three tests to give the following results
		     [java] getName:
		     [java] mygraph
		     [java] 
		     [java] getChildren:
		     [java] B:[E, F]
		     [java] A:[B, C, D]
		     [java] D:[J]
		     [java] C:[G, H, I]
		     [java] 
		     [java] walkGraph:
		     [java] D,J,
		     [java] A,B,C,
		     [java] E,F,
		     [java] G,H,I,
		# generate javadoc




3. Count words code written in python
countwords.txt is a sample text file containing words
'word' defined as any unique character string delimited by whitespace or EOF
Assumption: python interpretor
To run code on a console :
	   python countwords.py words.txt
	   # you shoule get the following results
		and 2 
		unless 1 
		that 5 
		this 2 
		is 4 
		it 1 
		not 1 
		is 1 
		can't 1 
		if 1 
