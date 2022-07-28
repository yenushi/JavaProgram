import java.util.Scanner;

class KeyboardInput{
    System.out.println("Enter length: ");
		Scanner myscanner = new Scanner(System.in);
		
        int length = myscanner.nextInt();
		System.out.println("Enter width: ");
		int width = myscanner.nextInt();
		int perimeter = 2 * ( length + width );
		
        System.out.println("Perimeter: " + perimeter);

}

