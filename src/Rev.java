
public class Rev {
	
	public void String() {
		String str = "Tharun";
	     char[] a = str.toCharArray();
		for(int i= str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
		
	
	}
	
	public static void main(String[] args) {
		Rev obj = new Rev();
		obj.String();
	}

}

