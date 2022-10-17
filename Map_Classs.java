package Collection;

import java.util.*;

public class Map_Classs     {

	public static void main(String[] args) {
		//System.out.println(Date.class);
		
//		TreeMap tm = new TreeMap(new MyComparator_Class());
//		tm.put( new Students_obj("Arun",20,10,"b.Tech"),new Mobile_obj("nova","e1",1000,4));
//		tm.put( new Students_obj("Ram",19,15,"b.Tech-eee"),new Mobile_obj("Oppo","e3",12000,6));
//		tm.put( new Students_obj("Deva",25,25,"b.Tech-mech"),new Mobile_obj("Vivo","e2",14000,8));
//		tm.put( new Students_obj("Suriya",21,35,"b.Tech "),new Mobile_obj("LG","e5",15000,16));
//		tm.put( new Students_obj("Arus",25,25,"b.Tech-mech"),new Mobile_obj("Iphone","e6",16000,64));
//			
//		//tm.put("hi", 12);
//		//System.out.println(tm.getOrDefault(1, "dr"));
//		//System.out.println(tm.entrySet());
//      //System.out.println(tm);
//		//System.out.println(tm.keySet());
//		//System.out.println(tm.values());
//		
//		for(Object o:tm.entrySet())
//			System.out.println(o);
//		 //Question : above 50rs Using entrySet
		
		
		Map_Classs obj = new Map_Classs();
		//obj.Simple_Prb_Above_50();
		//obj.Simple_Prb_Start();
		obj.Simple_Prb_Iterator();
		
	}

	
	private void Simple_Prb_Iterator() {  
		List lt = new ArrayList();
		lt.add(67);
		lt.add(46);
		lt.add(676);
		
		ListIterator tt = lt.listIterator();
		while(tt.hasPrevious() )
			System.out.println(tt.nextIndex());
	}


	private void Simple_Prb_Start() {
		Map ls = new LinkedHashMap();
		ls.put("Puri", 30);
		ls.put("Idly-4", 20);
		ls.put("Dosa", 30);
		ls.put("Poratta", 40);
		ls.put("Pongal", 35);
		ls.put("Puli Satham", 80);
		ls.put("Idly-8", 40);
		ls.put("Kall Dosa", 30);
		ls.put("Kuthu Poratta", 85);
		ls.put("Pongal-Vadai", 50);
		ls.put("Idi Apam", 50);
		
		Set s = new LinkedHashSet();
		s.addAll(ls.keySet());
		
		Iterator it = s.iterator();
		while(it.hasNext())
			if(it.next().toString().contains("Dosa"))
			 System.out.println(it);
		
		System.out.println();
		
		for(Object o:s) {
			String s1= o.toString(); 
			  if(s1.startsWith("K")  ||s1.startsWith("k"))
			      System.out.println(s1+" "+"Rs:"+ls.get(o));
		}System.out.println();
		for(Object o:s) {
			String s1= o.toString(); 
			  if(s1.contains("Dosa"))
			      System.out.println(s1+" "+"Rs:"+ls.get(o));
		}	
	}


	void Simple_Prb_Above_50() {
		LinkedHashMap ls = new <String , Integer> LinkedHashMap();
		ls.put("Puri", 30);
		ls.put("Idly-4", 20);
		ls.put("Dosa", 30);
		ls.put("Poratta", 40);
		ls.put("Pongal", 35);
		ls.put("Puli Satham", 80);
		ls.put("Idly-8", 40);
		ls.put("Kall Dosa", 30);
		ls.put("Kuthu Poratta", 85);
		ls.put("Pongal-Vadai", 50);
		//System.out.println(ls.get("Puri"));
		
//		Random rm = new Random();//Used to Create the Random number 
//		System.out.println(System.console());
//		System.out.println(rm.nextGaussian());
		
		Set s =new TreeSet ();
		s.addAll(ls.keySet());
		
		for(Object o:s) {
			if(40<=(int)ls.get(o)) {
				System.out.println(o+"\tRs"+ls.get(o));
			}
		}
		
	}


	

}
