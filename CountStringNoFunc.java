package third.lecture;

import java.util.Scanner;

public class CountStringNoFunc {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.nextLine();
		sc.close();
		name += '\n';
		char c;
		int count=0;
		while(name.charAt(count) != '\n') {
			count++;
		}
		if (count < 4) {
			System.out.println("The name is small");
		}
		else {
			System.out.println("The name is big");
		}
	}

}
