package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Obj {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("String");
		Students_obj st1 = new Students_obj(null, 0, 0, null);
		//System.out.println(ls.get(0).getClass());
		ls.add(st1);
		Students_obj str2 =new Students_obj("Ram",20,1,"EEE");
		ls.add(str2);
//		ls.add( new Students_obj("Ram",20,1,"EEE"));
//		ls.add( new Students_obj("Deva",22,2,"MECH"));
//		ls.add( new Students_obj("Suriya",19,3,"BCA"));
//		ls.add( new Students_obj("Arun",23,4,"Mech"));
//		
//		ls.add(new Mobile_obj("Moto","e1",1000,2));
//		ls.add(new Mobile_obj("LG","e2",2000,4));
//		ls.add(new Mobile_obj("Samsung","e3",3000,6));
//		ls.add(new Mobile_obj("Vivo","e4",4000,8));
//		
//		ls.add(new Laptop_obj("Avita",40000,15.5));
//		ls.add(new Laptop_obj("Dell",30000,13.2));
//		ls.add(new Laptop_obj("HP",20000,11.5));
//		ls.add(new Laptop_obj("Black Berry",10000,10.9));
		
		//System.out.println(ls.get(0).getClass());
		ArrayList st = new ArrayList();
		List mo=new ArrayList();
		List lo=new ArrayList();
		
		
		for(Object o:ls) {
			if(o.getClass().equals(Students_obj.class))
				st.add(o);
			else if (o.getClass().equals(Mobile_obj.class))
				mo.add(o);
			else if (o.getClass().equals(Laptop_obj.class))
				lo.add(o);
			//System.out.println(o);
		}
	
	Object o1[] = st.toArray();
	System.out.println(o1[0].getClass());
		
		for(Object o:st) {
			//System.out.println(o);
			if(o.getClass().equals(String.class))
			System.out.println(o+"0");
		}
//		System.out.println(st.toArray());
//		System.out.println(mo);
//		System.out.println(lo);
	}

}
