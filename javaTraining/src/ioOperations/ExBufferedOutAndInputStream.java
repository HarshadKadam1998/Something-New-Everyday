package ioOperations;
//Given By Teacher
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * BufferedOutputStream class uses an internal buffer to store data. 
 * It adds more efficiency than to write data directly into a stream. 
 * So, it makes the performance fast.
 * 
 */

public class ExBufferedOutAndInputStream {

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
			FileInputStream fin = new FileInputStream("src/myPackage/ExBufferedOutAndInputStream.java");
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
	


