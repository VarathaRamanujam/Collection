package Collection;

import java.util.*;

public class Map_Classs {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComparator_Class());
		tm.put( new Students_obj("Arun",20,10,"b.Tech"),new Mobile_obj("nova","e1",1000,4));
		tm.put( new Students_obj("Ram",19,15,"b.Tech-eee"),new Mobile_obj("Oppo","e3",12000,6));
		tm.put( new Students_obj("Deva",25,25,"b.Tech-mech"),new Mobile_obj("Vivo","e2",14000,8));
		tm.put( new Students_obj("Suriya",21,35,"b.Tech "),new Mobile_obj("LG","e5",15000,16));
		tm.put( new Students_obj("Arus",25,25,"b.Tech-mech"),new Mobile_obj("Iphone","e6",16000,64));
			
		//tm.put("hi", 12);
		//System.out.println(tm.getOrDefault(1, "dr"));
		//System.out.println(tm.entrySet());
        //System.out.println(tm);
		//System.out.println(tm.keySet());
		//System.out.println(tm.values());
		for(Object o:tm.entrySet())
			System.out.println(o);
		//Question : above 50rs Using entrySet
		
	}



}
