
public class HeroHonda extends Bikes{
	public void engine() {
		System.out.println("Bikes have engine");
	}
	
	public void wheels() {
		System.out.println("Bikes have wheels");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HeroHonda obj= new HeroHonda();
       obj.handle();
       obj.seat();
       obj.engine();
       obj.wheels();
	}

}
