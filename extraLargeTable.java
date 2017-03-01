
public class extraLargeTable {

	private int maxCapacity = 12;
	private int time;
	private String personName;
	
	extraLargeTable(int maxCapacity, int time, String personName)
	{
		this.maxCapacity = maxCapacity;
		this.time = time;
		this.personName = personName;
		
		
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
