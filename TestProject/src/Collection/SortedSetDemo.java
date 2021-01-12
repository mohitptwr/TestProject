package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		
		t.add(5);
		t.add(18);
		t.add(1);
		t.add(56);
		t.add(78);
		
		System.out.println(t);	
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2) {
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		return I2.compareTo(I1);
	}
}
