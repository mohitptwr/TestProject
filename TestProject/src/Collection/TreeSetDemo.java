package Collection;

import java.util.TreeSet;

import org.apache.commons.math3.analysis.function.Add;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("O");
		t.add("L");
		t.add("B");
		t.add("D");
		t.add("A");
		//t.add(new Integer(10));
		//t.add(null);
		System.out.println(t);
	}

}
