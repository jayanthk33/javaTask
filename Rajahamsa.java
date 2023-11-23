class Rajahamsa extends Bus
{
	
	String busNum;
	String name;
	
	Rajahamsa()
	{
				System.out.println("no-arg const of AshokaLayland");
	}
	Rajahamsa(int noOfWheels,int noOfDoors,int noOfGears,int noOfSeats,String owner,String busNum,String name)
	{
		super(noOfWheels,noOfDoors,noOfGears,noOfSeats,owner);

		this.busNum=busNum;
		this.name=name;
	}
	void setDetails(String company,double Ticketcost,double carryCapacity,double busWeight,float busHeight)
	{
		super.setProperties(company,Ticketcost,carryCapacity,busWeight,busHeight);
	}
	
	@Override
	void carryPassenger()
	{
		System.out.println("bus is used to carry passenger-override");
	}
	@Override
	void carryLuggage()
	{
		System.out.println("bus is used to carry luggage-override");
	}
	@Override
	void carrySpareParts()
	{
				System.out.println("bus is used to carry spare parts -override");
	}
	@Override
	void openDoor()
	{
				System.out.println("bus is used to open door -override");
	}
	void carrySand()
	{
		System.out.println("truck is used to carry sand from one place another place");
	}
	void carryCement()
	{
				System.out.println("truck is used to carry cement bags");
	}
	void carryTank()
	{
				System.out.println("truck is used to carry water tank and many more");
	}
}