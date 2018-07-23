package codingbat;

public class WarmUp1 {
	public boolean in1020(int a, int b) {
		
		  return (a <= 20 && a >= 10) || (b <=20 && b >= 10);
	}
	
	public boolean hasTeen(int a, int b, int c) {
		  if (a >= 13 && a <= 19)
			  return true;
		  if (b >= 13 && b <= 19)
			  return true;
		  if (c >= 13 && c <= 19)
			  return true;
					 
		return false;
	}


	public boolean loneTeen(int a, int b) {
	
		boolean aIsTeen = a <= 19 && a >= 13;
		boolean bIsTeen = b<= 19 && b>=13;
		return (aIsTeen && !bIsTeen) || (!aIsTeen && bIsTeen);
	}

	public String delDel(String str) {
		if (str.indexOf("del") == 1)
		  return str.replace("del", "");
		return str;
	}
	
	public boolean mixStart(String str) {
		return str.indexOf("ix") == 1;
	}
	
	public String startOz(String str) {
		String rs = "";
		if (str.startsWith("o"))
		rs = "o";
		if (str.length()>=2 && str.charAt(1) == 'z')
			rs +="z";
		return rs;  
	}

	public int intMax(int a, int b, int c) {
		int max = a >= b ? a : b;
		max = max >= c ? max : c;
		return max;
	}

	public int close10(int a, int b) {
		int aDiff = Math.abs(a - 10);
		int bDiff = Math.abs(b - 10);
		if (aDiff > bDiff)
			return b;
		if (aDiff < bDiff)
			return a;
		return 0;
	}

	public boolean in3050(int a, int b) {
		boolean in3040 = (a>=30 && a<=40) && (b>=30 && b<=40);
		boolean in4050 = (a>=40 && a<=50) && (b>=40 && b<=50);
		  return in3040 || in4050;
	}

	public int max1020(int a, int b) {
		boolean aIn = a >= 10 && a <= 20;
		boolean bIn = b >= 10 && b <= 20;
		if (aIn && bIn)
			return a > b ? a: b;
		if (aIn && !bIn)
			return a;
		if (!aIn && bIn)
			return b;
		  return 0;
	}
	
	public boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				count++;
		}
		  return count>=1 && count<=3;
	}
	
	public boolean lastDigit(int a, int b) {
		if (a >= 0 && b >= 0 && a % 10 == b % 10)
			return true;
		return false;
	}

	public String endUp(String str) {
		  return "";
	}




}
