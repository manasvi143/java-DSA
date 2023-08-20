package vehicle;

public class vehicle {
	
	private int maxSpeed;
	String colour;
	
	public vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getmaxSpeed() {
		return maxSpeed;
	}
	
	public void setmaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		
	}
	
	void print() {
	System.out.println("vehicle maxspeed => " + getmaxSpeed());
	System.out.println("vehicle colour => " + colour);
	}
}
