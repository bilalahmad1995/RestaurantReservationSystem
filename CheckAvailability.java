import java.util.LinkedList;

public class CheckAvailability {

	public boolean checkAvailabilityForSmall(int time, LinkedList l){
		int iterator = 0;
		int count = 0;
		
		while(iterator < l.size())
		{
			smallTable st = (smallTable) l.get(iterator);
			if(st.getTime() == time){
				count++;
				
			}
			iterator++;
			
		}
		if(count >= 4)
		{
			System.out.println("Sorry tables are already reserved");
			return false;
		}
		else
			return true;
				
	}
	
	public boolean checkAvailabilityForMedium(int time, LinkedList l){
		int iterator = 0;
		int count = 0;
		
		while(iterator < l.size())
		{
			mediumTable mt = (mediumTable) l.get(iterator);
			if(mt.getTime() == time){
				count++;
				
			}
			iterator++;
			
		}
		if(count >= 8)
		{
			System.out.println("Sorry tables are already reserved");
			return false;
		}
		else
			return true;
				
	}
	
	public boolean checkAvailabilityForLarge(int time, LinkedList l){
		int iterator = 0;
		int count = 0;
		
		while(iterator < l.size())
		{
			largeTable lt = (largeTable) l.get(iterator);
			if(lt.getTime() == time){
				count++;
				
			}
			iterator++;
			
		}
		if(count >= 3)
		{
			System.out.println("Sorry tables are already reserved");
			return false;
		}
		else
			return true;
				
	}
	
	public boolean checkAvailabilityForExtraLarge(int time, LinkedList l){
		int iterator = 0;
		int count = 0;
		
		while(iterator < l.size())
		{
			extraLargeTable exlt = (extraLargeTable) l.get(iterator);
			if(exlt.getTime() == time){
				count++;
				
			}
			iterator++;
			
		}
		if(count >= 1)
		{
			System.out.println("Sorry tables are already reserved");
			return false;
		}
		else
			return true;
				
	}
	
}
