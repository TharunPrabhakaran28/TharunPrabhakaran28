package selenium;

public class reversee {
	
	public void rev() {
		
		String a = "aaaaa";
		String b = "";
		for(int i=a.length()-1;i>=0;i--) {
			
			b = b+a.charAt(i);
			
		}
		
		System.out.println(b);

	
if(b.equals(a)) {
		
		System.out.println("Palidrome");
	}else {
		
		System.out.println("not a palindrome");
	}
	
	
	

	} 
	
	public static void main(String[] args) {
		reversee obj = new reversee();
		obj.rev();
		
	}
}

