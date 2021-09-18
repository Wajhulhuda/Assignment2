package third.lecture;

public class RevereseNumber {
	public static void main(String [] args) {
		
		int sum = 0, num = 987654321;
		System.out.println("The original number is "+num);
		
		while(num>0) {
			sum = (sum*10)+(num%10);
			num = num / 10;
		}
		System.out.println("The reverse number is "+sum);
	}

}
