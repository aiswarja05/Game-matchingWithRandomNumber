package Random.Game;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//random number game
    	int count=0;
    	Random rand = new Random(); 
    	int value = rand.nextInt(12); 
    	System.out.println(value);
    	System.out.println("Enter number between (1-12) to match");	
    	Scanner scanner=new Scanner(System.in);
    	int x = scanner.nextInt();
    	
    	for (int i = 0; i < 12; i++) {
    		count++;
    	    if(x>value) {
    		  System.out.println("Your given number is greater than the random one ");
    		  System.out.println("Please enter small number than the previous one");
    		  x = scanner.nextInt();
    	  }
    	    else if(x<value) {
    		  System.out.println("Your given number is smaller than the random one ");
    		  System.out.println("Please enter a bigger number than the previous one");
    		  x = scanner.nextInt();
    	    }
    		else if(x==value){
    			System.out.println("Your number has matched");
    			break;
    		}
    	  }
    	System.out.println(count);
    }
}
