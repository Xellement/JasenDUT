package fr.upem.jasen.indexer;

import java.io.File;
import java.util.ArrayList;

public class Index {
	
	private ArrayList<Tokenizer> tokenList;
	private String rep;
	private String[] children;

	public Index(String repPath) {
		rep = repPath;
		tokenList = new ArrayList<>();
		children = new File(repPath).list();
		for(int i=0;i<children.length;i++){
			if(children[i].endsWith(".txt")) 
				tokenList.add(new Tokenizer(rep+"\\"+children[i]));			
		}
	}	
}
