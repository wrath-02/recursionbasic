package recursionbasic;

public class LengthOfString {
	public static int len(String s,int l) {
		if(s.equals(""))
			return l;
		
		return len(s.substring(1),l+1);
		
	}

	public static void main(String[] args) {
		String s="anshul";
		System.out.println(len(s,0));
	}

}
