/**
 * 
 * The Ticket Class has fields and multiple different methods for the violater who was speeding.
 * The fields and methods are used for the TicketDriver Class
 */


package trafficTickets;
import java.util.Random;

public class Ticket {
	/**
	 * 
	 *The fields used here help store information about the ticket. 
	 *The fields created her are private because they are only used within their class
	 * To store the name, I created a string field
	 * I created int fields for storing speed of violater and the speed limit on the road
	 * I also created boolean fields like workZone and SchoolZone that determine where the violation took place
	 * 
	 * 
	 * 
	 * 
	 */

	//Field names
	private String name;
	private int speed;
	private int speedLimit;
	private boolean workZone;
	private boolean schoolZone;
	long ticketNum;
	private boolean flag=false;
	
	
	/**
	 *
	 *Constructors are instance methods 
	 *This constructor takes the name,speed,speed Limit,school zone, work zone 
	 *
	 *
	 *
	 *
	 * @param name        asks for violaters name
	 * @param speed       asks  speed of the violater
	 * @param speedLimit  asks for speed limit
	 * @param workZone     ask if in workzone
	 * @param schoolZone    ask if in schoolzone
	 */
	
	
	//Constructors
	public Ticket(String name,int speed, int speedLimit,boolean workZone, boolean schoolZone)
 {
		this.name=name;
		this.speed=speed;
		this.speedLimit=speedLimit;
		this.workZone=workZone;
		this.schoolZone=schoolZone;
		
		
		
	}
	
	/**
	 * constructor that asks for name,speed,speedlimit
	 * 
	 * 
	 * @param name ask for name
	 * @param speed ask for speed
	 * @param speedLimit ask for speedlimit
	 */
	//Constructors
	public Ticket(String name, int speed, int speedLimit) {
		
		this.workZone=false;
		this.schoolZone=false;
		this.name=name;
		this.speed=speed;
		this.speedLimit=speedLimit;
	}
	
	/**
	 * 
	 * @param name set the name of the user
	 */
	
	
	//Get name of user
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * 
	 * 
	 * 
	 * @return get name and returns name of the user
	 */
	//Set name of user
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param speed   set speed of user
	 */
	//Get speed of user
	public void setspeed(int speed) {
		this.speed=speed;
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * @return get speed of user and return speed
	 */
	//Set Speed of user
	public int getspeed() {
		return speed;
	}
	/**
	 * 
	 * 
	 * 
	 * @param speedLimit set the speed limit
	 */
	//Get speed limit of user
	public void speedLimit(int speedLimit) {
		this.speedLimit=speedLimit;
	}
	/**
	 * 
	 * 
	 * 
	 * @return get the speed limit and return speed limit
	 */
	//Set speed limit of user
	public int speedLimit() {
		return speedLimit;
	}
	/**
	 * 
	 * 
	 * 
	 * @param workZone set workzone to create object
	 */
	//Set workzone of user
	public void setworkZone(boolean workZone) {
		this.workZone=workZone;
	}
	/**
	 * 
	 * 
	 * 
	 * @return get work zone and return work zone
	 */
	//Get workzone of user
	public boolean getworkZone() {
		return workZone;
	}
	/**
	 * 
	 * 
	 * 
	 * @param schoolZone set school zoen and create object
	 */
	//Set schoolZone
	public void setschoolZone(boolean schoolZone) {
		this.schoolZone=schoolZone;
	}
	/**
	 * 
	 * 
	 * get school zone and return school zone
	 * @return return 
	 */
	//Get schoolZone
	public boolean getschoolZone() {
		return schoolZone;
	}
	
	/**
	 * 
	 * 
	 * method to calculate the fine of violater.
	 * it contains fields of overlimit with objects of speedlimit, speed, and zones
	 *Calculate the fine with if else if statements
	 * 
	 * return fine at the end of the method
	 * 
	 * @return
	 */
	
//Method to calculate fine of the violater
public double calculateFine() {
	int overlimit=(this.speed-this.speedLimit);
	double fine=0;
	
	if(overlimit>=1 && overlimit<=10) {
		fine=140.0;
		if(this.schoolZone) {
			fine=200.0;
		}
		if(this.workZone) {
			fine=250.0;
		}
		
	}
	else if(overlimit>=11 && overlimit<=20) {
		fine=195.0;
		
		if(this.schoolZone) {
			fine=300.0;
		}
		if(this.workZone) {
			fine=350.0;
		}
	}
	
	else if(overlimit>=21 && overlimit<=30) {
		fine=450.0;
		
	}
	else if(overlimit>=31 && overlimit<=40) {
		fine=495.0;
		
	}
	
	else if(overlimit>=41) {
		flag=true;
		fine=600.0;
		
	}
	
	return fine;
	
}

/**
 * 
 * Method to print everything to screen
 * Use the above objects to print to screen
 * 
 * 
 * @return
 */

//Method to print notice to screen
public String printNotice() {
	String zone="";
	if(this.schoolZone) {
		zone="school";
	}
	else if(this.workZone) {
		zone="work";
	}
	
	double fine =this.calculateFine();
	
	
	//Display Traffic Ticket Header to Screen
	String notice="";
	System.out.println("\n");
	System.out.println("Deparment of Motor Vehicles\n");
	System.out.println("Automated Traffic Enforcement\n");
	System.out.println("\n");


	 notice="Dear "+this.name+",\n";
	notice=notice+"\n";
	notice=notice+"Please pay the following speeding fine of $"+fine+ " to the DMVA within 10 days\n";
	notice=notice+"of recieveing this notice to avoid a driver's license suspension. You are being fined\n";
		notice=notice+ "for going "+this.speed+" MPH in a "+this.speedLimit+" MPH"+zone;
		notice=notice+"\n";
		notice=notice+"Ticket Type: "+this.DetermineTicketType()+"\n";
		notice=notice+"Ticket Number: "+this.DetermineTicketType() +"\n";
		notice=notice+"\n";
		notice=notice+"Returned checks are subject to a returned check fee of $35.00.\n";
		notice=notice+"\n";
		notice=notice+"Sincerely,\n";
		notice=notice+"Ksveh Vakili";


	return notice;
	
}

/**
 * 
 * 
 * Create a private method where it will randomly generate ticket number
 * Once randomly generated, return ticket number back to the method
 * @return
 */

//Private method to generate ticket number
private long generateTicketNum() {
	Random rand=new Random();
	int k=999999-1000000+1;
	int num=rand.nextInt()%k;
	long randomNumber=1000000+num;
	
	return randomNumber;
}
	

/**
 * 
 * Create a private method were it will generate the court date
 * Use the random number generator
 * return date back to courtdate method
 * 
 * 
 * 
 * @return
 */
	//Private method to generate court date
	 private int generateCourtDate()
	   {
	       Random days = new Random();
	       int k = 31 - 1 + 1;
	       int y = days.nextInt() % k;
	       return 31 + y;
	   }

	 /**
	  * 
	  * 
	  * create  a private method where it will display what ticket type 
	  * The ticket type is determined by the fine
	  * 
	  * @return
	  */
//Private method to generate ticket type
	private String DetermineTicketType() {
		return(flag==true) ? "MUST APPEAR" : "PAYABLE";
		
		
	}
	/**
	 * 
	 * 
	 * create  a string method @override
	 * in the string method call for methods of generate ticketnum,
	 * generate courtdate  and determine tickettype and return in
	 * 
	 * 
	 * 
	 */
	
		 @Override
	//Implement method toString
	public String toString() {
		 return "Ticket Number: "+generateTicketNum()+
		               " Date: "+generateCourtDate()+"/oct/2019"+
		               " Ticket Type: "+ DetermineTicketType() ;
	}
	}
