package Training;

public class d {

	public static void main(String[]args) {
		
		String s =("Ayush Mangla");
		
		String rev="";
		
		int len=s.length();
		
		for (int i=len-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
	}
}

