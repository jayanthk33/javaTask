class BusStarter
{
	public static void main(String[] any)
	{
		
		Bus bus=new Bus();
		Bus bus1=new Bus(6,2,6,4,"Jayanth");
		bus1.setProperties("Rajahamsa",4500000d,100000d,200000d,22.3f);

		bus1.carryPassenger();
		bus1.carryLuggage();
		bus1.carrySpareParts();
		bus1.openDoor();
		bus1.closeDoor();
		bus1.fireExtinguisher();
		bus1.carryLiveStock();
		bus1.carryFuel();
		bus1.carryFurniture();
		bus1.usedForAnnouncement();
		bus1.carryLoggs();
  System.out.println("noOfDoors : "+bus1.noOfDoors);
  System.out.println("noOfWheels : "+bus1.noOfWheels);
  System.out.println("noOfGears : "+bus1.noOfGears);
  System.out.println("noOfSeats : "+bus1.noOfSeats);
  System.out.println("owner : "+bus1.owner);
  System.out.println("company : "+bus1.company);
  System.out.println("cost : "+bus1.Ticketcost);
  System.out.println("carryCapacity : "+bus1.carryCapacity);
  System.out.println("busWeight : "+bus1.busWeight);
  System.out.println("busHeight : "+bus1.busHeight);

		System.out.println("************************");
		
		Rajahamsa rajahamsa1=new Rajahamsa();
		Rajahamsa rajahamsa=new Rajahamsa(10,2,6,4,"kumar","2621","ecomate");
		rajahamsa.setDetails("ashokaleyland",4500000d,100000d,200000d,22.3f);
		rajahamsa.carryPassenger();
		rajahamsa.carryLuggage();
		rajahamsa.carrySpareParts();
		rajahamsa.openDoor();
		rajahamsa.carrySand();
		rajahamsa.carryCement();
		rajahamsa.carryTank();
		rajahamsa.fireExtinguisher();
		rajahamsa.carryLiveStock();
		rajahamsa.carryFuel();
		rajahamsa.carryFurniture();
		rajahamsa.usedForAnnouncement();
		rajahamsa.carryLoggs();
  System.out.println("Busnum : "+rajahamsa.busNum);
  System.out.println("Name : "+rajahamsa.name);
  
		
	}
}