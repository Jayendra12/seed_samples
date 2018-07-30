import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 5, 11, 4, 1, 2, 5, 6 };

		// TreeSet set=new TreeSet<>(Arrays.asList(arr));
		/*
		 * TreeSet set=new TreeSet<>(); set.add(1); set.add(2); set.add(1);
		 * set.add(10); set.add(5); set.add(6); set.add(1); set.add(7);
		 * set.add(8); set.add(2); Iterator it=set.iterator();
		 * 
		 * while(it.hasNext()){ System.out.println(it.next()); }
		 */

		ArrayList list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Iterator it = list.iterator();
		for (int k = 0; k < list.size(); k++) {
			System.out.print(" "+list.get(k));
		}
        System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			int num = (int) list.get(i);
			System.out.println(num);
			for (int j = i+1; j < list.size(); j++) {
                  System.out.print(" "+" "+list.get(j));
                  
                  if(num==(int)list.get(j)){
                	  list.remove(j);
                  }
			}
		}
		System.out.println();
		for (int k = 1; k < list.size(); k++) {
			System.out.print(" "+list.get(k));
		}
	}
	

}
