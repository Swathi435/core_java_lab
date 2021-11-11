package core.java.lab6;
import java.util.Scanner;
public class CountChar {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
 System.out.println("Enter strings (use a space to separate them; hit enter to finish) : ");
     String str = input.nextLine();
   String [] wordsArray = str.trim().split(" ");
    System.out.println("The length of string is " + wordsArray.length);
     for(int i = 0 ; i < wordsArray.length; i++){
     char [] eachLetterinArray =  wordsArray[i].toCharArray();
      for(int j = 0,count = 0 ; j < eachLetterinArray.length; j++)
            if ( (eachLetterinArray[j]+'a'-97 >=65 && eachLetterinArray[j]+'a'-97 <=90 )
                       || (eachLetterinArray[j]+'a'-97 >=97 && eachLetterinArray[j]+'a'-97 <=122 )  ){

              count++;

            }

      char[] count = null;
	System.out.print(count);
  }
	}

	}




	             

