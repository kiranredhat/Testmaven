package SmallPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOne {
	public IteratorOne() {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(5);
		list.add(3);
		
 		Iterator <Integer> itr =  list.iterator();
				while (itr.hasNext())
				{
					System.out.println(itr.next());
					int k = itr.next();
					System.out.println(k);

				}
				}
			
	
	public static void main(String[] args) {
	IteratorOne iitr= new IteratorOne();
		// TODO Auto-generated method stub

	
	
	}

}
