package Collection;

public class Students_obj {

	
	String name;
	int age;
	int roll;
	String UG;
	
	Students_obj(String name,int age,int roll,String UG){
		this.age=age;
		this.name=name;
		this.roll=roll;
		this.UG=UG;
	}
	
	public Students_obj() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setUG(String UG) {
		this.UG=UG;
	}
	public String getUG() {
		return UG;
	}
//	public static void main(String arg[]) {
//		Students_obj ob = new Students_obj();
//	}
	
	public String toString() {
		return "Age = "+age+",name = "+name+" \t,roll ="+roll+" \t,UG ="+UG +" ";
	}
}
