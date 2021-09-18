package third.lecture;

import java.util.Scanner;

public class CountString {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = sc.nextLine();
		sc.close();
		System.out.println("The name is "+name);
		
		if (name.length()<4) {
			System.out.println("Name is valild");
			
		}
		else {
			System.out.println("Name is unvalid");
		}
		
	}

}
