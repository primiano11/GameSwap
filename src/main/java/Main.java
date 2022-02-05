import java.util.*;
	
	
	
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double rand = Math.random();
		System.out.println("Hello!  What is your name?"); 
		String firstName = in.next();
		System.out.println("Hi " +  firstName + "! How much money do you have?");
		double money = in.nextDouble();
		if (money > 0)
		{
			System.out.println("$" + money + " is enough.  Let's play!");
		
			

		System.out.printf("      ______        ______         ______ \n");
		System.out.printf("     /      \\      /      \\       /      \\\n");
		System.out.printf("    /        \\    /        \\     /        \\\n");
		System.out.printf("   /          \\  /    o     \\   /          \\\n");
		
		
		int upperBound = 3;
		int lowerBound = 1;
		int random = (int) ((Math.random() * (upperBound - lowerBound + 1)) + lowerBound);
		
		
		System.out.println("Shuffling...");
		System.out.printf("      ______        ______        ______ \n");
		System.out.printf("     /      \\      /      \\      /      \\\n");
		System.out.printf("    /        \\    /        \\    /        \\\n");
		System.out.printf("   /    1     \\  /    2     \\  /    3     \\\n");
		System.out.println("Pick a shell (1, 2 or 3):");
		int num = in.nextInt();
		if (random == 1)
		{
			System.out.printf("      ______        ______        ______ \n");
			System.out.printf("     /      \\      /      \\      /      \\\n");
			System.out.printf("    /        \\    /        \\    /        \\\n");
			System.out.printf("   /    o     \\  /          \\  /          \\\n");
		}
		if (random == 2)
		{
			System.out.printf("      ______        ______        ______ \n");
			System.out.printf("     /      \\      /      \\      /      \\\n");
			System.out.printf("    /        \\    /        \\    /        \\\n");
			System.out.printf("   /          \\  /    o     \\  /          \\\n");
		}
		if (random ==3)
		{
			System.out.printf("      ______        ______        ______ \n");
			System.out.printf("     /      \\      /      \\      /      \\\n");
			System.out.printf("    /        \\    /        \\    /        \\\n");
			System.out.printf("   /          \\  /          \\  /    o     \\\n");
		}
		if (num == random)
		{
			System.out.println("You win " +firstName);
		}
		else
		{
			System.out.println("You lose sucker!");
		}
		}
		else
		{
			System.out.println("Beat it deadbeat!  You can't play if you ain't got no money!");
		}
		
	}

}