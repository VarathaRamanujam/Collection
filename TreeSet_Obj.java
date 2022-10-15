package Collection;

import java.util.*;

public class TreeSet_Obj  {

	public static void main(String[] args) {
//	        try {
			Set ts=new TreeSet(new MyComparator_Class());
//			ts.add(3);
//			ts.add(100);
//			ts.add(300);
//			ts.add(1100);
//			ts.add(37);
//			ts.add(1200);
//			
//			ts.add("hi");
//			ts.add("hii");
             
             
             ts.add(new Students_obj("Name",20,10,"b.Tech"));
             ts.add(new Students_obj("Ram",19,15,"b.Tech-eee"));
             ts.add(new Students_obj("Deva",25,25,"b.Tech-mech"));
             ts.add(new Students_obj("Suriya",21,35,"b.Tech ilaiya suma"));
             
//             Set tt=new TreeSet(new MyComparator_Class());
 //            System.out.println(ts);
//             System.out.println(tt);
             for(Object i :ts)
                 System.out.println(i);
   
//		    }catch (Exception e) {
//			     System.out.println("Please enter Similer Object");
//		}
		
	}

//	public int compare(Students_obj arg0, Students_obj arg1) {
//		if(arg0.age>arg1.age) {
//			return -1;
//		}else if (arg0.age<arg1.age)
//			return 1;
//		else
//		   return 0;
//	}

	

}
