import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		
		t1.add(87);
		t1.add(44);
		t1.add(12);
		t1.add(12);
	
		
		for (Object object : t1) {
			System.out.println(object);
		}
	}
}
