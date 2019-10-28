package trafficTickets;

import java.util.Scanner;

public class TicketDriver {

	public static void main(String[]args) {
		/**
		 * 
		 * create scanner object
		 * 
		 */
		
		Scanner keyboard= new Scanner(System.in);
	 
		/**
		 * 
		 * 
		 * variable to store name of violater as a string
		 * variable to enter speed of violater as an int
		 * variable to enter speed limit of violater as an int
		 * varibale to enter if in workzone as a string
		 * variable to enter if in schoolzone as a string
		 * variable for work as boolean
		 * variable for school as boolean
		 * 
		 */
		//varibale
		String name;
		int speed;
		int speedLimit;
		String workZone;
		String schoolZone;
		boolean work;
		boolean school;
		
		/**
		 * Print header on screen
		 * 
		 * 
		 * 
		 */
		//Program Header
		System.out.println("Ticket Manager");
		System.out.println("");
		
		/**
		 * 
		 * 
		 * Prompt user to enter name of the vilater
		 * And input name of violater
		 */
		
		//Prompt user to enter the name of the violater
		System.out.println("Enter the name of the violater:");
		name=keyboard.nextLine();
		
		
		/**
		 * 
		 * Prompt user to enter speed of violater greater than zero
		 * Input speed of violater
		 * If speed below 0, create while loop
		 * 
		 * 
		 */
		
		//Prompt user to enter the speed of the violater
		System.out.println("Enter the speed of the violater (>0): ");
		speed=keyboard.nextInt();
		
		//For invalid speed for violater
		while(speed<0) {
			System.out.println("Enter Postive Value.");
			speed=keyboard.nextInt();
		}
		
		/**
		 * 
		 * Prompt user to enter the speed limit
		 * Input speed limit
		 * If speed limit not within range, ask user to input again
		 * 
		 * 
		 * 
		 * 
		 */
		
		//Prompt user to enter the speed limit
		System.out.println("Enter the speed limit (>0,<=80): ");
		speedLimit=keyboard.nextInt();
		
		//For invalid speedLimit input
		if(speedLimit<0 || speedLimit>80) {
			System.out.println("Invalid Speed Limit.");
			speedLimit=keyboard.nextInt();
			
		}
		
		/**
		 * 
		 * Prompt user to ask if violation was in school zone
		 * If violation was in school zone enter Y
		 * If violation was not in school zone enter N
		 * Use if else statements
		 * 
		 */
		
		//Prompt user to ask if violation was in work zone
		System.out.println("Was this in a school zone (Y/N): ");
		schoolZone=keyboard.next();
	
		//Determine true or false for school zone
		if(schoolZone=="Y") {
			school=true;
		
		}
		else {
			school=false;
		}
		
		
		
		/**
		 * 
		 * Prompt user to enter the if violation was in workzone
		 * Input  Y for yes
		 * Input N for no
		 * Use if else statement to determine
		 * 
		 */
		
		//Prompt to ask user if violation was in work zone
			System.out.println("Was this in a work zone (Y/N): ");
			workZone=keyboard.next();
			
			//Determine true or false for work zone
			if(workZone=="Y") {
				work=true;
			}
			
			else {
				work=false;
			}
			
			/**
			 * 
			 * Call the ticket object with the parameters of...
			 * name,speed,speedlimit,work,school
			 * the double fine field make it equal to the calc fine object
			 * 
			 * 
			 * Use system.out to print the printnotice object which will display letter to screen
			 * 
			 */
			
			Ticket object= new Ticket(name,speed,speedLimit,work,school);
			double fine= object.calculateFine();
			
			System.out.println(object.printNotice());
		
			
		}
		
		
	}













