package com.vj;

public class StringReverseClass {

	public boolean ifStringReverse(String str) {
		StringBuilder strBul = new StringBuilder(str);
		StringBuilder rev = strBul.reverse();
		String res = new String(rev);
		if (res.equals(str)) {
			return true;
		} else {
			return false;
		}
	}

	public Integer changeToInteger(String str) {
		if(str == null || str.isEmpty() || str.equals("")|| str.length()==0) {
			throw new IllegalArgumentException("Not Acceptable");
		}
		else {
			return Integer.parseInt(str);
		}
	}
}
