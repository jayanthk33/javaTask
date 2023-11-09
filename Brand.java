class Brand
{
	
String name="Lenovo";
long origin=1990;
String ceoName="xiaozahan";
City[] cities;
   
void setCity(City[] cities)
{
	this.cities=cities;
}

void show()
{
	System.out.println("Showing Information..");
	System.out.println("Name:-"+this.name);
	System.out.println("ceoName:-"+this.ceoName);
	System.out.println("cities:-"+this.cities);
	
	
	if(this.cities!=null)
	{
		for(int i=0;i<this.cities.length;i++)
		{
			City ref=this.cities[i];
			System.out.println("cities is :"+ref);
			
		}
	}
	System.out.println("Ending Information");
	
}
}