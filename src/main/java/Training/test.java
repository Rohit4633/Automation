package Training;

public class test {
	
	public static void main(String [] args ) {
		
		String s ="Rohit Mangla";
		String rev="";
		
		String[]t=s.split(" ");
		int k = t.length;
		
		for(int i=k-1;i>=0;i--) {
			
		
		rev= rev+" "+t[i];
		
		}
		System.out.println("rev the str:" +rev);
	}

}
