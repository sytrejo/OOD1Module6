package computerClasses;

public class Processor {
	
	private final String MODEL;
	private final double SPEED;
	private final int NUMBER_OF_CORES;
	
	
	//constructor
	public Processor(String model, double speed, int numberOfCores) {
		MODEL = model;
		SPEED = speed;
		NUMBER_OF_CORES = numberOfCores;
		
	}
	
	
	//getter
	public String getModel() {
		return MODEL;
	}
	
	public double getNumberOfCores() {
		return NUMBER_OF_CORES;
	}
	
	public double getSpeed() {
		return SPEED;
	}
	
	//methods
	public void processData(String data) {
		System.out.print("data process");
	}

}
