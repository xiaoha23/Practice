package codingbat;

public class MissingChar {

	public String missingChar(String str, int n) {
		String rs = "";
		if (n < str.length()) {
			rs = str.substring(0, n) + str.substring(n+1);
		}
		return rs;
	}
}
