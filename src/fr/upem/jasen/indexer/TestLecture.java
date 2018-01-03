
package fr.upem.jasen.indexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestLecture {
		
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("javalang.txt");
		Charset charset = StandardCharsets.UTF_8;
		BufferedReader reader = Files.newBufferedReader(path, charset);
		
		int c; 
		do {
			c = reader.read();
			System.out.print((char) c);
		} while(c != -1);
		
				
	}
}
