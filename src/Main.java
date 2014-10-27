package test;

import graphnode.G;
import java.io.*;
import java.util.*;


public class Main {
    static G graph = new G();

    public static void main(String[] args) {

    	// create graph
    	List<String> alist = new ArrayList<String>();
    	alist.add("B");
    	alist.add("C");
    	alist.add("D");
    	graph.addNode("A",alist);
    	List<String> blist = new ArrayList<String>();
    	blist.add("E");
    	blist.add("F");
    	graph.addNode("B",blist);
    	List<String> clist = new ArrayList<String>();
    	clist.add("G");
    	clist.add("H");
    	clist.add("I");
    	graph.addNode("C",clist);
    	List<String> dlist = new ArrayList<String>();
		dlist.add("J");
    	graph.addNode("D",dlist);
    	System.out.println();

    	System.out.println("getName:");
    	graph.setName("mygraph");
    	System.out.println(graph.getName());
    	System.out.println();

    	System.out.println("getChildren:");
    	graph.getChildren("B");
    	graph.getChildren("A");
    	graph.getChildren("D");
    	graph.getChildren("C");
    	System.out.println();

    	System.out.println("walkGraph:");
    	graph.walkGraph();
   
    }
}