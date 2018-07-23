package codingbat;

public class FrontBack {

	public String frontBack(String str) {
		String rs = "";
		if (str.length() <= 1)
			return str;
		else {
			char front = str.charAt(0);
			char back = str.charAt(str.length()-1);
			String body = str.substring(1, str.length()-1);
			rs = back + body + front;
		}
			
		return rs;
				
	}
	
	
}
