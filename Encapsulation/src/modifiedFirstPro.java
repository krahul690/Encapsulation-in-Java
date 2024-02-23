class abc
{
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private int age;  //instance var//data member
	private String name;
	private String city;
}



public class modifiedFirstPro {

	public static void main(String[] args) {
		 abc st = new abc();
//		 st.age=10; error age is private out side not accesed
//		 st.name="rahul";
//		 st.city="jalandhar"; 
		 
		 //for a method setAge we can use here
		 st.setAge(28);
		 int age=st.getAge(); //possible through getter
		 System.out.println("age is: "+age);
	}


}
