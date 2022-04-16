class mindtree {
	
	public void occc() {

		String str = "tharun is a magician";
		char a= 'r';
		int count = 0;
		str = str.toLowerCase();
	
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)== a)
				{
					a++;
				}

				}
			System.out.print(count);


			}

	public static void main(String[] args) {
		
			mindtree obj = new mindtree();
			obj.occc();
	}






		}