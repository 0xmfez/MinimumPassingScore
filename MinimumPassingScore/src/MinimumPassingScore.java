import java.util.Scanner;

public class MinimumPassingScore {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double midterm,Assignments,finalexem;
		
	System.out.println("Enter midterm exam grade");
		midterm = input.nextDouble();
		
    System.out.println("Enter Programming Assignments & Quizzes grade");
    	Assignments = input.nextDouble();
    	
    	
    	finalexem = (50 - ((midterm * 0.25) +(Assignments * 0.35))) * 10 / 4;
    	
    	
    	if(finalexem<0) {
 		   System.out.println("You passed the course ");
 	   }
    	else if (finalexem>100) {
	    	System.out.println("You can't pass the course ");
	   }
	   
	   else {
	   System.out.println("The lowest score you need to pass : " + finalexem);
	   }
    	//1101101 1100110 1100101
	}

}