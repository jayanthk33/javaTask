class Bus
{
	int noOfWheels;
	String company;
	double Ticketcost;
	int noOfSeats;
	int noOfDoors;
	double carryCapacity;
	double busWeight;
	float busHeight;
	String owner;
	int noOfGears;
	
	Bus()
	{
		System.out.println("no-arg const of Bus");
	}
	Bus(int noOfWheels,int noOfDoors,int noOfGears,int noOfSeats,String owner)
	{
		this.noOfDoors=noOfDoors;
		this.noOfGears=noOfGears;
		this.noOfSeats=noOfSeats;
		this.noOfWheels=noOfWheels;
		this.owner=owner;
	}
	void setProperties(String company,double Ticketcost,double carryCapacity,double busWeight,float busHeight)
	{
		this.company=company;
		this.Ticketcost=Ticketcost;
		this.carryCapacity=carryCapacity;
		this.busHeight=busHeight;
		this.busWeight=busWeight;
	}
	void carryPassenger()
	{
		System.out.println("bus is used to carry passenger");
	}
	void carryLuggage()
	{
		System.out.println("bus is used to carry luggage");
	}
	void carrySpareParts()
	{
				System.out.println("bus is used to carry spare parts ");
	}
	void openDoor()
	{
				System.out.println("bus is used to open door");
	}
	void closeDoor()
	{
				System.out.println("bus is used to close door");
	}
	void fireExtinguisher()
	{
				System.out.println("bus is used for fire extinguisher");
	}
	void carryLiveStock()
	{
				System.out.println("bus is used to carry live stock");
	}
	void carryFuel()
	{
				System.out.println("bus is used to carry fuel");
	}
	void carryFurniture()
	{
				System.out.println("bus is used to carry furniture");
	}
	void usedForAnnouncement()
	{
				System.out.println("bus is used for announcement");
	}
	void carryLoggs()
	{
				System.out.println("bus is used to carry loggs");
	}


}