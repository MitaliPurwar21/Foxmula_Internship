import java.util.Scanner;

public class Custom_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		try {
			if(isPrime(n) && n!=2)
				throw new CustomException("Number is invalid");
			else
				System.out.println();
		}
		catch(CustomException e) {
			System.out.println(e);
		}
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
