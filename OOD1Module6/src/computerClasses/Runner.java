package computerClasses;

public class Runner {
	
	private HardDrive hardDrive;
	private Processor processor;
	private Memory memory;
	

	public static void main(String[] args) {
		HardDrive hardDrive1 = new HardDrive("Seagate", 2048.0, 0);
		HardDrive hardDrive2 = new HardDrive("Dell", 3072.0, 500);
		
		Processor processor1 = new Processor("Intel Xeon", 2.93, 6);
		Processor processor2 = new Processor("Intel celeron", 2.9, 2);
		
		Memory memory1 = new Memory("Kingston", 4, 1600);
		Memory memory2 = new Memory("Corsair", 8, 1333);
		
		//print out using the getters
		System.out.println("The value of harDrive1 model is:" + hardDrive1.getModel());
		System.out.println("The processor model is:" + processor1.getModel());
		
		//changing the value of drive1
		hardDrive1.setUsedSpace(50);
		System.out.println(hardDrive1.getUsedSpace());
		
		

	}

}
