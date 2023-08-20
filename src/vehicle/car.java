package vehicle;

public class car extends vehicle {
	
	
	int noOfGears;
	boolean convertable;
	int sNum;
	public car(int sNum,int maxSpeed) {
		super(maxSpeed);
		this.sNum = sNum;
	}
	
	void printCar(){
		
		super.print();
		System.out.println("car noOfGears => " +noOfGears);
		System.out.println("Car covertale => " +convertable);
		System.out.println("Car serial number =>" +sNum);
//		System.out.println("Car maxspeed => " + maxSpeed);
//		System.out.println("Car colour => " + colour);
		
	}
}
