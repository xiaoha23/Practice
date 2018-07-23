package codingbat;

public class BackAround {
	public String backAround(String str) {
		String rs = "";
		if (str.length() >= 1) {
			char c = str.charAt(str.length()-1);
			rs = c + str + c;
		}
	return rs;	  
	}

}
