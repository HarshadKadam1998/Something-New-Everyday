package ioOperations;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedInputStreamExample 
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("ExBOAI.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		//new BufferedOutputStream(new FileOutputStream("ExBOAI.txt"));
		//new BufferedOutputStream(new FileOutputStream("buffered.txt"));
		String s = "This is an example of BufferedOutputStream and BufferedInputStream";
		byte b[] = s.getBytes();
		bout.write(b);
		/*
		 * The flush() flushes the data of one stream and send it into another.
		 * It is required if you have connected the one stream with another
		 */
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
  
		try {
			/*FileInputStream fin = new FileInputStream("buffered.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
*/			
			FileInputStream fin = new FileInputStream("ExBOAI.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}  
		 }  
	



