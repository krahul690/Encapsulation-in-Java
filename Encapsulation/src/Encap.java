class dog {
	private String name;
	private int Cost;

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setCost(int Cost) {
		this.Cost=Cost;
	}

	public int getCost() {
		return Cost;
	}

}

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		d.setname("sheru");
		d.setCost(20000);
		int cost = d.getCost();
		String s = d.getname();
		System.out.println(d.getCost());
		System.out.println("cost is: "+cost);
		System.out.println(d.getname());
	}

}
