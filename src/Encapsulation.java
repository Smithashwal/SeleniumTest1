
public class Encapsulation {
	
	public String name= "Test Automation";
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation encaps= new Encapsulation();
		String a= encaps.getName();
		System.out.println(a);
		
		encaps.setName("Selenium Testing");
		a= encaps.getName();
		System.out.println(a);
	}

}
