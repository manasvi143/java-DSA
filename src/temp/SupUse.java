package temp;

public class SupUse {

	public static void main(String[] args) {
		
		sup<Integer> p1 = new sup<>(12,34);
		p1.setfirst(45);
		p1.setsecond(89);
		
		System.out.println(p1.getfirst() + " " + p1.getsecond());

	}

}
