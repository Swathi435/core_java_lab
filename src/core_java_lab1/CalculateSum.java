package core_java_lab1;
import java.util.Scanner;
public class CalculateSum {
public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum = sum+i;
			}
	    }
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		CalculateSum e = new CalculateSum();
		int res = e.calculateSum(n);
		System.out.println("sum of natural numbers which are divisible by 3 or 5 is : " + res);
		
		
		sc.close();
	}
	
}


