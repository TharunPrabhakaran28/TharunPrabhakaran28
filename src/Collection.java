import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	public void list()
	{
	 ArrayList <Integer> arr = new ArrayList <Integer>();
	 arr.add(23);
	 arr.add(12);
	 arr.add(78);
	 arr.add(23);
	 arr.add(21);
	 
	 ArrayList <Integer> anothername =  new ArrayList<Integer>();
	 anothername.addAll(arr);
	 
	 System.out.println(anothername);
	 
	 
	 
	 System.out.println(anothername.get(2));
	 
	 anothername.remove(0);
	 System.out.println(anothername);
	 
	 System.out.println(anothername.indexOf(12));
	 
	 System.out.println(arr.isEmpty());
	 System.out.println(arr.lastIndexOf(23));
	 
	 
	
	
	 
	}
	
	public static void main(String[] args) {
		Collection obj = new Collection();
		obj.list();
	}

}
