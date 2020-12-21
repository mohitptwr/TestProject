package InterviewPrograms;

import java.util.HashSet;

 

class Common{
	private static void FindCommonElement(String str1[],String str2[]) {
		HashSet<String> set=new HashSet<String>();
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if(str1[i]==str2[j]) {
					//add common elements
					set.add(str1[i]);
					break;
				}
			}
		}
		for (String i : set) {
			System.out.println(i+" ");	
		}
	}
}
public class PrintCommonElementfromArray {

}
