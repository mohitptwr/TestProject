package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h=new LinkedHashSet();
		
		h.add("M");
		h.add("O");
		h.add("H");
		h.add("I");
		h.add("T");
		
		System.out.println(h.add("T"));
		System.out.println(h);
		
	}

}
