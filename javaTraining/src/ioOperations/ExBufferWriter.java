package ioOperations;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExBufferWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int i=0;
		int j = 0;
		File file = new File("Example.txt");
		// creates the file
		// creates a FileWriter Object
		
		
		FileWriter writer = new FileWriter(file);		
		BufferedWriter bw=new BufferedWriter(writer);
		
		char[] c={'J','A','V','A'};
		String str="This is an example for file reader or writer !!!";
		bw.write(65);
		bw.write(str);
		bw.write(c);
		bw.write(str, 0, str.length()/2);
		bw.flush();
		bw.close();
		// Creates a FileReader Object
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while ((i = br.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}

}



