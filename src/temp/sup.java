package temp;

public class sup<Y>{
	private Y a;
	private Y b;
	
	public sup(Y a , Y b) {
		this.a = a;
		this.b = b;
		
	}
	
	public void setfirst(Y a) {
		this.a  = a;
		
	}
	
	public Y getfirst () {
		return a;
	}
	
	public void setsecond(Y b) {
		this.b  = b;
		
	}
	
	public Y getsecond () {
		return b;
	}
	
	
}