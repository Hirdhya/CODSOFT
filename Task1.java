package internship;
import java.util.Random;
import java.util.*;

public class Task1 {	
	public static void main(String[] args) {
		int k=0;
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		int counter=0;
		int maxAttempt=5;
		int play=-1;
		
		while(k==0) {
			Random r=new Random();
			int randomNumber=r.nextInt(101);
			flag=true;
			
			while(flag && counter<maxAttempt) {
				
				System.out.println("Enter the number ");
				int num=sc.nextInt();
				int score=0;
				
				if(num==randomNumber) {
					
					System.out.println("You guessed correct and your score is "+counter);
					System.out.println("Would you like to continue?? 1/0");
					 play=sc.nextInt();
					if(play==1) {
						flag=false;
					}else if(play==0) {
						break;
					}
					counter=0;
				}else if(num>randomNumber) {
					System.out.println("Your guessed number is greater");
					
				}else {
					System.out.println("Your guessed number is lower");
				}
				counter++;	
			}
			if(play==0) {
				break;
			}
			if(counter==maxAttempt) {
				System.out.println("you have exceeded maximum chances");
				break;
			}						
		}			
	}
}
