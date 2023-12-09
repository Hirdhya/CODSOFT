package internship;
import java.util.*;
public class Task2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter The Five Subject Marks :");
	System.out.println("Enter the marks for 1st subject ");
	int m1 = input.nextInt();
	System.out.println("Enter the marks for 2nd subject ");
	int m2 = input.nextInt();
	System.out.println("Enter the marks for 3rd subject ");
	int m3 = input.nextInt();
	System.out.println("Enter the marks for 4th subject ");
	int m4 = input.nextInt();
	System.out.println("Enter the marks for 5th subject ");
	int m5 = input.nextInt();
	int total = m1+m2+m3+m4+m5;
	float percentage = total/5;
	char grade='a';
	
	if(percentage>=90)
		grade='A';
	else if(percentage>=80)
		grade='B';
	else if(percentage>=70)
		grade='C';
	else if(percentage>=60)
		grade='D';
	else if(percentage>=40)
		grade='E';
	else
		grade='F';	
	
	System.out.println("Total marks "+total);
	System.out.println("Average marks "+percentage);
	System.out.println("Grade "+grade);
}
}

