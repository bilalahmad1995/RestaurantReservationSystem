import java.util.Scanner;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		int option;
		LinkedList extraLarge = new LinkedList();
		LinkedList large = new LinkedList();
		LinkedList medium = new LinkedList();
		LinkedList small = new LinkedList();	
		Scanner reader = new Scanner(System.in);
		
		while(true)	{
		option=reader.nextInt();
		
		if(option == 1)
		{
		CheckAvailability ckAv = new CheckAvailability();
		
			
		
		System.out.println("******* MAKE A RESERVATION ******* ");
		
	
		System.out.println("For how many people you want to make a reservation?");
		
			
		int no_of_people = reader.nextInt();
		
		System.out.println("Reservation Time?");				
		int time = reader.nextInt();
		
		System.out.println("Name to reserve for?");				
		String name = reader.next();
	
		
		if(no_of_people > 0 && no_of_people <= 2)
		{
			if(ckAv.checkAvailabilityForSmall(time, small)) 
			{
						
				smallTable sTable = new smallTable(no_of_people,time,name);
				small.add(sTable);
				
			}		
		}
		
		else if(no_of_people > 2 && no_of_people <= 4)
		{
			if(ckAv.checkAvailabilityForMedium(time, medium))
			{
			mediumTable mTable = new mediumTable(no_of_people,time,name);
			medium.add(mTable);
			}
			
		}
		
		else if(no_of_people > 4 && no_of_people <= 6)
		{
			if(ckAv.checkAvailabilityForLarge(time, large))
			{
			largeTable lTable = new largeTable(no_of_people,time,name);
			large.add(lTable);
			}
			
		}
		
		else if(no_of_people > 6 && no_of_people <= 12)
		   {
			if(ckAv.checkAvailabilityForExtraLarge(time, extraLarge)){
			extraLargeTable elTable = new extraLargeTable(no_of_people,time,name);
			extraLarge.add(elTable);
			
		   }
		   }
		}
		else if (option == 2)
		 {
			 int i = 0;
			
			 while (i<small.size())
			 {
				smallTable s = (smallTable) small.get(i);			
				System.out.println(s.getPersonName()); 
				i++;
			 }  i = 0;
			 while (i<medium.size())
			 {
				    mediumTable s = (mediumTable) medium.get(i);
					System.out.println(s.getPersonName()); 
					i++;
				 
			 }  i = 0;
			 while (i<large.size())
			 {
				 largeTable s = (largeTable) large.get(i);
					System.out.println(s.getPersonName()); 
					i++;
				 
			 }  i = 0;
			 while (i<extraLarge.size())
			 {
				 extraLargeTable s = (extraLargeTable) extraLarge.get(i);
					System.out.println(s.getPersonName());  
					i++;			 
			}
		 }
	   }	
	 }
  }

