package packageBankSystem;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/*import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;*/
public class javaDateValidator {
	
/*	public static boolean formatValidation(String strDate)
	   {

		if (strDate.trim().equals(""))
		{
		    return false;//
		}
		else
		{

		    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
		    sdfrmt.setLenient(false);
		    try
		    {
		        sdfrmt.parse(strDate); 
		        //return true;
		    }
		    catch (ParseException e)
		    {
		        return false;
		    }
		     Return true if date format is valid 
		    return true;
		}
	   }*/

	
	public static boolean isValidDate(String strDate)
	{
		//if(formatValidation(strDate)==true){
		String strArr[]=strDate.split("/");
		int dd,mm,yy,yyt;
		dd=Integer.parseInt(strArr[0]);

		mm=Integer.parseInt(strArr[1]);

		yy=Integer.parseInt(strArr[2]);
		
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
	    LocalDateTime now = LocalDateTime.now();
	    String year=(String)(dtf.format(now));
	    yyt=Integer.parseInt(year);
	    
		if(dd<1 || dd>31){
			return false;
		}else if(mm<1 || mm>12){
			return false;			
		}else if(yy<(yyt-170) || yy>yyt){
			return false;			
		}
			return true;
		//}else{return false;}
	}


}
