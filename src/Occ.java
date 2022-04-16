
public class Occ {
	
	public void dup(){
		
		String str = "I am tharun and I am an automation tester for 2 years";
		
		char a = 'i';
		str = str.toLowerCase();
		int occurance =0;
		int b = str.length();
		
		
		for(int i = 0 ;i<str.length();i++) {
			
			if(str.charAt(i) == a)
			{
				occurance = occurance + 1;
				
			}
			
			
			
		}
		
		System.out.print(occurance);
			
				
		
		
		
	}
	
	public static void main(String[] args) {
		Occ obj = new Occ();
				obj.dup();
	}

}
