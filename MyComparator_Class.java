package Collection;

import java.util.Comparator;

public class MyComparator_Class implements Comparator<Students_obj> {

@Override
public int compare(Students_obj arg0, Students_obj arg1) {
	if(arg0.age>arg1.age) 
		return -1;
	else if (arg0.age<arg1.age)
		return 1;
	else
	   return 0;
}

}
