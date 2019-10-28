package trafficTickets;


import java.util.Scanner;

/**  	
 * 
 * This is a driver to test the Ticket class
 * @author Professor Kartchner
 */

public class TicketTestDriver
{
	public static void main(String[] args)
	{
		Ticket ticket1, ticket2, ticket3;

		ticket1 = new Ticket("Bob Brown",36, 25, true, false);
		ticket2 = new Ticket("Betty Boop",66,45,false, true);
		//ticket3 = new Ticket("Edward Cullen",88,45);

		//test the getName
		if(!"Bob Brown".equals(ticket1.getName())) print("getName Error 1");
		if(!"Betty Boop".equals(ticket2.getName())) print("getName Error 2");

		//test the getSpeedLimit
		if(!(25==ticket1.getSpeedLimit())) print("getSpeedLimit Error 1");
		if(!(45==ticket2.getSpeedLimit())) print("getSpeedLimit Error 2");
		//if(!(45==ticket3.getSpeedLimit())) print("getSpeedLimit Error 3");

		//test setName
		ticket1.setName("Ronald Reagan");
		if(!"Ronald Reagan".equals(ticket1.getName())) print("setName Error 1");

	}
	
	public static void print(String message)
	{
		System.out.println(message);
	}
}

