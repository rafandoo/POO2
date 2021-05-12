package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataUtil {
		
    @SuppressWarnings("unused")
	private static Locale currentLocale;

    public DataUtil() {
        super();
        DataUtil.currentLocale = new Locale("pt", "BR");
    }

    public DataUtil(Locale locale) {
        super();
        DataUtil.currentLocale = locale;
    }
    
    public static String DataForStringXML(Date pDate) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String s = "";
        try {
            s = df.format(pDate);
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return s;
    }
    
    public static String DataHoraForStringPadraoH(Date pDate) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
        String s = "";
        try {
            s = df.format(pDate);
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return s;
    }
          
    public static Date RetornaHojeData(){
    	Date dt = new Date();
    	return dt;
    }

	public static Date StringParaData(String data) throws ParseException{
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
		java.util.Date dataUtil = df.parse(data);  		
		try {
			return dataUtil;
		} catch (Exception e) {
			return null;
		}	
	}
}