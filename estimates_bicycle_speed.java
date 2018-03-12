/**********************************************************************************
 
//
// Title:      estimates bicycle speed 
// Course:     CSC 3020
// Homework:   2-3
// Author:     Gayatari patel
// Date:       28 September 2016
// Description:
//   This Java application will estimates bicycle speed
//
//**********************************************************************************
 */


package estimates_bicycle_speed;

//Import classes
import java.util.Scanner;

// class
public class estimates_bicycle_speed
{
	
    //----------------------------------------------------------------
    // main
    //----------------------------------------------------------------
    public static void main (String[] args)
    
    {
    	// variables
    	String enter=" ";
    	 int diameter;
    	 float rotation;
    	 int rotationPerMin;
    	 float totalspeed;
    	 Scanner keyboard = new Scanner(System.in);
    	 
    	//---------------------------------/ prints application header
    	 System.out.println("\nWelcome to count Bicycle speed");
         System.out.println("*************************************\n");
        System.out.println("\n***********  Enter 'y' to continue 'n' to quit");
        enter=keyboard.nextLine(); 
        while(enter !="n")   
        {
        	 
            // it will break program
        	if (enter.equals("n")) 
    		{
    			System.out.println("You quit the program");
    			break;
    		}
        	
        	// if else statement  for  diameter
        System.out.println("\nPlease Enter the wheel diameter in inches (in the range 10-50)");
		 diameter = keyboard.nextInt();
        if (diameter >50.00 || diameter <10.00)
    	{
        	System.out.println("ERROR: invalid input.");
        	System.out.println("Please Enter the wheel diameter in inches (in the range 10-50)");
      		 diameter = keyboard.nextInt();
    	}
        
        	System.out.println("Congrats! You entered a valid input!");
  		
        	// if else statement  for rotation per pedal
        System.out.println("Please enter rotations per pedal (rotation in the range 0.1-10)");
        rotation = keyboard.nextFloat();
        if (rotation > 10 || rotation < 0.1)
    	{
        	System.out.println("ERROR: invalid input.");
        	System.out.println("Please enter rotations per pedal (rotation in the range 0.1-10)");
             rotation = keyboard.nextFloat();
    	}
        
        	System.out.println("Congrats! You entered a valid input!");
        	
        	// if else statement  for  rotation per minute
        System.out.println("Please Enter pedal rotations per minute (in the range 1-120).  ");
        rotationPerMin=keyboard.nextInt();
        if (rotationPerMin >110 ||rotationPerMin<1)
        {
        	System.out.println("ERROR: invalid input.");
        	System.out.println("Please Enter pedal rotations per minute (in the range 1-120).  ");
            rotationPerMin=keyboard.nextInt();
        }
        
        System.out.println("Congrats! You entered a valid input!");
        // equation for speed
        totalspeed= (float) (diameter*rotation* rotationPerMin *Math.PI);
	       System.out.println();
	       // print result
         System.out.printf("%-45s%10d\n","Wheel diameter",+diameter);
         System.out.printf("%-45s%10.1f\n","number of Wheel roration per pedal",+rotation);
         System.out.printf("%-45s%10d\n","number of Pedal rotations per minute",+rotationPerMin);
        System.out.printf("%-45s%10.3f\n","Total speed",+totalspeed);
        System.out.println("\n End counting Bicycle speed");
        System.out.println("******************************\n");
        }
        
        keyboard.close();
        
    } 
}