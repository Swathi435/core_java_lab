<<<<<<< HEAD
package core_java_lab1;
import java.util.Scanner;
public class CheckNumber {
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number: ");
			int num = scan.nextInt();
			
			if(CheckNumber.checkNumber(num)) {
				System.out.println("Number is  powers of two");
			}
			else {
				System.out.println("Number is not  powers of two");
			}
			
			scan.close();

		}
		public static boolean checkNumber(int num) {
			while(num%2==0) {
				num=num/2;
			}
			if(num==1) {
				return true;
			}
			else {
				return false;
			}
		}

	
			}


=======
package core_java_lab1;
import java.util.Scanner;
public class CheckNumber {
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number: ");
			int num = scan.nextInt();
			
			if(CheckNumber.checkNumber(num)) {
				System.out.println("Number is  powers of two");
			}
			else {
				System.out.println("Number is not  powers of two");
			}
			
			scan.close();

		}
		public static boolean checkNumber(int num) {
			while(num%2==0) {
				num=num/2;
			}
			if(num==1) {
				return true;
			}
			else {
				return false;
			}
		}

	
			}


>>>>>>> 3563646b00c65eb8dab6b557b87ab6e9e26ac958
