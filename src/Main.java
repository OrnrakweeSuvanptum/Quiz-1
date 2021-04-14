
public class Main {

	public static void main(String[] args) {
		Racket y = new Racket(); 
		y.setBrand();
		y.setColour();
		y.setLength();
		y.setWeight();
		
		System.out.println("Brand: " + y.getBrand());
		System.out.println("Colour: " + y.getColour());
		System.out.println("Length: " + y.getLength() + "mm");
		System.out.println("Weight: " + y.getWeight() + "g");
		System.out.println();
			
	}

}
