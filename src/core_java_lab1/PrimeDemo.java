package core_java_lab1;

public class PrimeDemo {
	public static void main(String[] args) {
		System.out.println("enter number");
		int num=50;
		System.out.println("list of prime numbers upto integer numbers");
		for(int i=2;i<=num;i++) {
			int count=2;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}

}


