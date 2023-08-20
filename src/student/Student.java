package student;-

public class Student {
	
	private int rollnum;
	public String name;
	public int age;
	
	public Student( String s, int rn ) {
		name = s;
		if(rn<=0) {
			return;
		}
		
		rollnum = rn;
		
	}
	
	
public void setrollnum(int rn) {
	
	if ( rn <=0 ) {
		return;
	}
	rollnum = rn;
}
public int getrollnum() {
	return rollnum;
}
public void print() {
	System.out.println(name + " " + rollnum);
}
}

Sysouy