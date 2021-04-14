import java.util.Scanner;
public class Racket {

		Scanner s = new Scanner(System.in);
		
		String brand;
		String colour;
		int length;
		double weight; 
		
		//Create Setter Method
		public void setBrand() {
			System.out.print("Enter brand:");
			this.brand = s.next(); 
		}
		
		public void setColour() {
			System.out.print("Enter colour:");
			this.colour = s.next();
		}
		
		public void setLength() {
			System.out.print("Enter length:");
			this.length = s.nextInt();
		}
		
		public void setWeight() {
			System.out.print("Enter weight:");
			this.weight = s.nextDouble();
		}
		
		//Create Getter Method
		public String getBrand() {
			return this.brand;
		}
		
		public String getColour() {
			return this.colour;
		}
		
		public Integer getLength() {
			return this.length;
		}
		
		public double getWeight() {
			return this.weight;
		}
		
}
