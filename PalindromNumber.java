package third.lecture;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		s.close();
		int mod,sum=0;
		int temp=num;
		
		
		while(num>0) {
			mod=num%10;
			sum = (sum*10)+mod;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Number is Palindrom");
		}
		else {
			System.out.println("Number is not Palindrom");
		}
		
	}

}
