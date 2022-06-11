package computerClasses;

public class Memory {
	
	//attributes
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPEED;
	
	//constructor
	public Memory (String model, double capacity, double speed) {
		MODEL = model;
		CAPACITY = capacity;
		SPEED = speed;
	}
	
	//getter
	public String getModel() {
		return MODEL;
	}
	
	public double getCapacity() {
		return CAPACITY;
	}
	
	public double getSpeed() {
		return SPEED;
	}
	
	//setter don't need them because of the final keyword
	
	//methods
	public void storeData(String data) {
		System.out.print("data stored");
		
	}

}
