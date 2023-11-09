class LaptopHead
{
	public static void main(String args[])
	{
		System.out.println("starting main method in LaptopHead");
		Laptop laptop=new Laptop();
		Hardware hardware=new Hardware();
		Hardware hardware1=new Hardware();
		Hardware hardware2=new Hardware();
		Hardware hardware3=new Hardware();
		Hardware[]  Harray={hardware1,hardware2,hardware3};
		Brand brand=new Brand();
		Owner owner=new Owner();
		City city=new City();
		City city1=new City();
		City city2=new City();
		City city3=new City();
		City city4=new City();
		City[] cities={city1,city2,city3,city4};
		Address address=new Address();
		hardware.setBrand(brand);
		owner.setPaddress(address);
		owner.setTaddress(address);
		address.setCity(city);
		laptop.setBrand(brand);
		laptop.setOwner(owner);
		laptop.show();
			
		System.out.println("ending main method in LaptopHead");
	}
}