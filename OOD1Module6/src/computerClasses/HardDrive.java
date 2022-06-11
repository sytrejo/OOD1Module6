package computerClasses;

public class HardDrive {
	
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	
	//Constructor
	//Always public, Always name of the class, take in all the attribute
	public HardDrive (String model, double capacity, double usedSpace) {
		MODEL = model;
		CAPACITY = capacity;
		this.usedSpace = usedSpace;
	}
	
	
	//getter
	public String getModel() {
		return MODEL;
	}
	
	public double getCapacity() {
		return CAPACITY;
	}
	
	public double getUsedSpace() {
		return usedSpace;
		
	}
	
	//SETTErs don't need them because of the final keyword
//	public void setModel(String model) {
//		this.MODEL = model;
//	}
//	
//	public void setCapacity(double capacity) {
//		this.CAPACITY = capacity;
//	}
//	
	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}
	
	//METHODS
	public String readData(String file) {
		return "data from" + file;
	}
	
	public void writeData(String data, String file) {
		System.out.print("data written from" + file);
	}


}
