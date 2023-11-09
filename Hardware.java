class Hardware
{
	
String name="cpu";
String type="wired";
Brand brand;
 
   
void setBrand(Brand brand)
{
	this.brand=brand;
}

void show()
{
	System.out.println("Showing Information..");
	System.out.println("Name"+this.name);
	System.out.println("Type"+this.type);
 
	
 if(this.brand!=null)
	{
		this.brand.show();
	}

	System.out.println("Ending Information");
	
}
}