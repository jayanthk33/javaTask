class Address
{
	
String street="Jcr";
long pincode=577501;
City city;

   
void setCity(City city)
{
	this.city=city;
}

void show()
{
	System.out.println("Showing Information..");
	System.out.println("City:-"+this.city);
	System.out.println("street:-"+this.street);
	System.out.println("pincodde:-"+this.pincode);

	
	
 if(this.city!=null)
	{
		this.city.show();
	}
	System.out.println("Ending Information");
	
}
}