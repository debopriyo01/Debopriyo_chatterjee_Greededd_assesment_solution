package Constraction;

public class Driver {

	public static int totalFloors;
	public static int[] totalFloorSize;

	public static void main(String[] args) {
	
		Stack_implementetion myDriverObj = new Stack_implementetion();
		 myDriverObj.getInputs();
		myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
	}

}
