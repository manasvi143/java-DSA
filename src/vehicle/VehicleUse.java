package vehicle;

public class VehicleUse {

	public static void main(String[] args) {
		
//		vehicle v = new vehicle();
//		
//		v.setmaxSpeed(50);
//		v.colour = "red";
//		
//		v.print();
		
		car c = new car(1,60);
		
		c.noOfGears = 4;
		c.convertable = true;
		c.colour = "Tropical Mist";
		
		c.printCar();
		
	}

}
