package packageOne;

import java.util.StringTokenizer;

class ExStringTokenizer {

	static String str = "This is m9/y core ja5va no/tes";

	public static void main(String args[]) {
		
		String[] a = str.split("/");
		System.out.println("**********Using Split()*********");
		System.out.println("No of tokens="+a.length);
		for (String s : a) {
			System.out.println(s);
			
		}
		
		StringTokenizer st = new StringTokenizer(str,"/");  // space is the default delimiter
		
		//StringTokenizer st = new StringTokenizer(str);
		int tokens = st.countTokens();
		System.out.println("=============Using StringTokenizer=========");
		System.out.println("No of Tokens :" + tokens);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
	}
}
