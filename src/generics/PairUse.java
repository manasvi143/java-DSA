package generics;

public class PairUse {

	public static void main(String[] args) {
		
		pair <Integer, String>  p1 = new pair <>(12, "Mj");
		
//		p1.setfirst(33);
//		int s = p1.getfirst();
//		
//		System.out.println(s);
		
//		pair<String> s1 = new pair<String>("chhavi","Manasvi");
//		
//		s1.setfirst("Aanya");
		
		p1.setsecond("Vaibhav");
		p1.setfirst(23);
		
//		System.out.println(p1.getfirst()+" , " + p1.getsecond());
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		pair<Integer , Integer > internalPair = new pair <> (a,b);
		pair<pair<Integer , Integer> , Integer> p3 = new pair <> (internalPair,c);
		
		System.out.println(p3.getsecond());
		System.out.println(p3.getfirst().getfirst());
		System.out.println(p3.getfirst().getsecond());
		

	}
	

}
