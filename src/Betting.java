import java.util.Scanner;

public class Betting {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter initial amount:");
		int initialAmount=sc.nextInt();
		System.out.println("Enter result w/l:");
		String resultString=sc.nextLine();
		
		Betting.test(initialAmount,resultString);

	}

	public static void test(int initialAmount, String resultString) {
		System.out.println("enter how much amount to bet:");
		int bet=1;
		int leftAmount=0,a=2;
		
		//leftAmount=initialAmount-bet;
		
		if(resultString.equalsIgnoreCase("W")){
			initialAmount+=bet;
			System.out.println(initialAmount);
		}
		if(resultString.equalsIgnoreCase("L")){
			bet=a;
			initialAmount=initialAmount-2*bet;
			System.out.println(initialAmount);
			
			a=a*a;
			System.out.println(a);
			
		}
	}

}
