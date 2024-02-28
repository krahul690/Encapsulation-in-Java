class Test {
	private String Name;
	private int Sal;
	private String lName;

	// in a setter it is possible
	//here we can also use a constructor 
	//like public void Test(String Name, int Sal, String lName) {

	public  Test(String Name, int Sal, String lName) {
		this.Name = Name;
		this.Sal = Sal;
		this.lName = lName;
	}

	// but in a getters it is not possible bcoz we return only one value at a time
	public String getName() {
		return Name;
	}

	public int getSal() {
		return Sal;
	}

	public String getlName() {
		return lName;
	}

}

public class setterShortcut {

	public static void main(String[] args) {
		
		//for constructor
		Test t =new Test("rahul",1500,"kumar");
		
		//Test t =new Test();
//		t.setData("Rahul", 15000, "Kumar");
		
		System.out.println(t.getSal());
		System.out.println(t.getName());
		System.out.println(t.getlName());
		
	}

}
