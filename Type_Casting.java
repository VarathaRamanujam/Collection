package Collection;

import java.util.ArrayList;
import java.util.List;

public class Type_Casting {

	public static void main(String[] args) {
		Type_Casting obj = new Type_Casting();
		obj.Type_Casting_list();
	}

	private void Type_Casting_list() {
		List ls  = new ArrayList();
		ls.add("String");
		ls.add(78);
		ls.add("String");
		ls.add(78);
		String s="Suma_____";
		ls.add(s);
		
	//	System.out.println(ls);
		
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).getClass()==(String.class))
			  System.out.println(ls.get(i));
		}
	}

}
