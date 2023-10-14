import java.util.Scanner;
import java.util.Random;

public class NumberGame{

	public static void main(String args[])
    { 
    		generateRandom();
    } 

    public static void generateRandom(){
   
    	Random rand=new Random();
    	int randomNum=rand.nextInt(11);

    	guess(randomNum);
    }

    public static void guess(int randomNum){
    	Scanner sc=new Scanner(System.in);

    	System.out.println("");
    	System.out.println("Number Guessing Game");
    	System.out.print("Guess A Number Between 0-10: ");
    	int guess=sc.nextInt();
    	System.out.println("");

    	while (guess<0 || guess>10){
    		System.out.print("Guess A Number Between 0-10: ");
    		guess=sc.nextInt();
    		System.out.println("");
    	}

    	int tries=0;
    	while(guess!=randomNum){
    		tries++;
    		System.out.println("Wrong Guess!");
    		System.out.print("Guess again: ");
    		guess=sc.nextInt();
    		System.out.println("");

    		while (guess<0 || guess>10){
    			System.out.print("Guess A Number Between 0-10: ");
    			guess=sc.nextInt();
    			System.out.println("");
    		}
    	}
		
    	System.out.println("Correct Answer. Congratulations!!!You Won The Game");
    	System.out.println("Wrong Tries: "+tries);
    	System.out.println("");

    	System.out.println("Press 1 to Play Again.");
    	System.out.println("Press 0 to Exit.");
    	int choice=sc.nextInt();

    	if(choice==1)
    		generateRandom();
    	else
    		return;
    }

}