package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Obj {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("String");
		/*
		 * Students_obj st1 = new Students_obj(null, 0, 0, null);
		 * //System.out.println(ls.get(0).getClass()); ls.add(st1); Students_obj st2
		 * =new Students_obj("Ram",20,1,"EEE"); ls.add(st2);
		 * 
		 * int a; a=st1.age; a+=st2.age; int avg = a/2; System.out.println(avg);
		 */
		 
		
		ls.add( new Students_obj("Ram",20,1,"EEE"));
		ls.add( new Students_obj("Deva",22,2,"MECH"));
		ls.add( new Students_obj("Suriya",19,3,"BCA"));
		ls.add( new Students_obj("Arun",23,4,"Mech"));
		ls.add( new Students_obj("Vicky",27,4,"Mech"));
		
		ls.add(new Mobile_obj("Moto","e1",7000,2));
		ls.add(new Mobile_obj("LG","e2",2000,4));
		ls.add(new Mobile_obj("Samsung","e3",3000,6));
		ls.add(new Mobile_obj("Vivo","e4",14000,8));
		ls.add(new Mobile_obj("Oppo","e5",9000,8));
		
		ls.add(new Laptop_obj("Avita",40000,15.5));
		ls.add(new Laptop_obj("Dell",30000,13.2));
		ls.add(new Laptop_obj("HP",20000,11.5));
		ls.add(new Laptop_obj("Black Berry",10000,10.9));
		ls.add(new Laptop_obj("Asus",10000,10.9));
		
		//System.out.println(ls.get(0).getClass());
		ArrayList st = new ArrayList();
		List mo=new ArrayList();
		List lo=new ArrayList();
		
		
		for(Object o:ls) {
			int sum=0;
			if(o.getClass().equals(Students_obj.class)) {
				Students_obj s=(Students_obj)o;
				sum+=s.age;
				System.out.println(sum/ls.size());
			}
				
			else if (o.getClass().equals(Mobile_obj.class))
				mo.add(o);
			else if (o.getClass().equals(Laptop_obj.class))
				lo.add(o);
			
		}
		
//		AvgStudent(st);
//		HighestPrice(mo);
		SortByAlbpa(lo);
		int sum=0,avg=0;
		for(int i=0;i<st.size();i++) {
			sum+=((Students_obj) st.get(i)).age;
		}
		avg=sum/st.size();
		System.out.println(avg+" Average age of the Student");
		
//	Object o1[] = st.toArray();
//	System.out.println(o1[0]);	
//	for(Object o:st) 
//  System.out.println(o);		
//  System.out.println(st.toArray());
//	System.out.println(mo);
//	System.out.println(lo);
	}

	public static   void SortByAlbpa(List<Laptop_obj> lo) {
		  String s[]=new String[lo.size()];
		  for(int i=0;i<lo.size();i++) {
			  s[i]=lo.get(i).brand;
		  }
		  Arrays.sort(s);
		  System.out.println("Print the Brand in order");
		  for(int i=0;i<s.length;i++)
			  System.out.println(s[i]);
		  System.out.println();
	}

	 static void HighestPrice(List<Mobile_obj> mo) {
		int high=mo.get(0).price;
		int index=0;
		for(int i=1;i<mo.size();i++) {
			if(mo.get(i).getPrice()>high)
				high=mo.get(i).getPrice(); index=i;
		}
		System.out.println(mo.get(index));
		System.out.println(""+high+" Highest price of the Mobile");	
		System.out.println();
	}

	static void AvgStudent(ArrayList<Students_obj> st) {
		int sum=0,avg=0;
		for(int i=0;i<st.size();i++) {
			sum+=st.get(i).getAge();
		}
		avg=sum/st.size();
		System.out.println(avg+" Average age of the Student");
		System.out.println();
	}

}
