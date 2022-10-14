package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Type_Casting {

	public static void main(String[] args) {
		Type_Casting obj = new Type_Casting();
		//obj.Type_Casting_list();
		obj.Type_Casting_list_1();
	}

	private void Type_Casting_list_1() {
		List ls  = new ArrayList();
		ls.add("String");
		ls.add(null);
		ls.add(78);
		ls.add("String");
		ls.add(78);
		String s="Suma_____";
		ls.add(s);
		ls.add(null);
		
		for(Object o:ls)
			System.out.println(o);
		
		
		System.out.println();
		for(Object o :ls) {    // replace null
			try {
				if(o==(null)) 
					o="ff --repacle of null";
					//System.out.println(o);
			} catch (Exception e) {
				System.out.println(o);
			}System.out.println(o);
		}System.out.println();
		
		for(Object o :ls) { // without null
			try {
				if(o!=(null))
					//o="ff";
					System.out.println(o);
			} catch (Exception e) {
				System.out.println(o);
			}//System.out.println(o);
		}
			
		
		

	}

	private void Type_Casting_list() {
		List ls  = new ArrayList();
		ls.add("String");
		ls.add(78);
		ls.add("String");
		ls.add(78);
		String s="Suma_____";
		ls.add(s);
		List nl=new ArrayList();
		nl.addAll(ls);
		nl.add(45);
		
		//System.out.println(nl);
		nl.remove(0);
		//System.out.println(nl);
		System.gc();
		/*nl.removeAll(ls);
		System.out.println(nl);
		nl.clear();
		System.out.println(nl);*/
		//System.out.println(nl.lastIndexOf(ls));
	   Object [	] ob =nl.toArray();
//	   for(Object o:ob)
//		   System.out.println(o);
	   
	   List ll = new LinkedList(nl);
	   System.out.println(ll);
	   ll.add(3,2);
	   System.out.println(ll);
	   Object o=2;
	   ll.remove(o); 
	   System.out.println(ll);
	 
//		for(int i=0;i<ls.size();i++) { // muthu question
//			if(ls.get(i).getClass()==(String.class))
//			  System.out.println(ls.get(i));
//		}
	}
}
	