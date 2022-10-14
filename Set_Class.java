package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Class {

	public Set_Class(String string, int i) {
		// TODO Auto-generated constructor stub
	}

 static boolean equals(){
		return true;
	}
	public Set_Class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set_Class obj = new Set_Class();
		obj.Set_Class_Methods();
		
	}

	
	public String toString() {
		return "Override";
	}

	private void Set_Class_Methods() {
		Set ls = new LinkedHashSet();
		ls.add("hi");
		//ls.add("hi");
		ls.add(null);
		ls.add(null);
		ls.add(2);
		ls.add(2);
		Set_Class ss1= new Set_Class("hii",200);
		Set_Class ss2= new Set_Class("hii",200);
		System.out.println(ss1.equals(ss2));
		
		boolean c=ls.retainAll(ls);
		
		ls.add("suma");
//      boolean b=ls.retainAll(ls);
//		System.out.println(ls);
//		ls.remove(5);
		ls.add(ss1);
		ls.add(ss2);
		
		System.out.println(ls);
		//System.out.println(b);
		System.out.println(c);
	}

}
