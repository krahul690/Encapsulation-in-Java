class Student
{
	private int age;  //instance var//data member
	private String name;
	private String city;
	
	//for outside package accessed create a method
	//setter--> set is compulsory,setting data upper data member
	//receive value from outside
	void setAge(int age) {
//		age=age; //this is shoding proble fror this we go for this keyword
		this.age=age;
	}
	
	//some other use my data inside a age
	//for this we use a getter-use get\
	//return who wants to use a data-->getters
	int getAge()
	{
		return age;
	}
}




public class firstpro {

	public static void main(String[] args) {
		 Student st = new Student();
//		 st.age=10; error age is private out side not accesed
//		 st.name="rahul";
//		 st.city="jalandhar"; 
		 
		 //for a method setAge we can use here
		 st.setAge(28);
		 int age=st.getAge(); //possible through getter
		 System.out.println("age is: "+age);
	}


}
