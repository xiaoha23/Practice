package codingbat;

public class Front3 {

	public String front3 (String str) {
		String rs = "";
		String front;
		if (str.length() < 3) {
			front = str;
		} else {
			front = str.substring(0, 3);
		}
		rs = front + front + front;
		return rs;
	}
}
