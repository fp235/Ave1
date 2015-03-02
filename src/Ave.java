import java.util.Scanner;

public class Ave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2,n3,n4,n5,n6;
		
		
		 System.out.println("Enter five numbers from least to greatest");
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(",");
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();
		n3 = keyboard.nextDouble();
		n4 = keyboard.nextDouble();
		n5 = keyboard.nextDouble();
		n6 = n1+n2+n3+n4+n5;
		
		
		System.out.println("Your Sum is " + n6);
		System.out.println("Your Average is " + n6/5);
		
	}
}
	    


