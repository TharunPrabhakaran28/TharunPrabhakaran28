
public class Calculator {

	
			 public static  void Calcu(int a , int b , String value) {
				
				if (value.equalsIgnoreCase("add")) {
					
					int c = a+b;
					System.out.println(c);
					
				} else if (value.equalsIgnoreCase("sub")) {
					int c = a-b;
					System.out.println(c);

				} else if (value.equalsIgnoreCase("mul")) {
					int c = a*b;
					System.out.println(c);
				}

			}
			
			public static void main(String[] args) {
				
				Calcu(4, 6, "mul");
				
			}

	
}
