class Laptop
{
	
Owner owner;
Hardware[] hardware;
Brand brand;
 
   
void setOwner(Owner owner)
{
	this.owner=owner;
}
void setHardware(Hardware[] hardware)
{
	this.hardware=hardware;
}
void setBrand(Brand brand)
{
	this.brand=brand;
}

void show()
{
	System.out.println("Showing Information..");
 
	if(this.hardware!=null)
	{
		for(int i=0;i<this.hardware.length;i++)
		{
			Hardware ref=this.hardware[i];
			System.out.println("hardware is :"+ref);
			
		}
	}
	System.out.println("owner: "+this.owner);
	
 if(this.brand!=null)
	{
		this.brand.show();
	}
	
	
if(this.owner!=null)
	{
		this.owner.show();
	}
		
	System.out.println("Ending Information");
	
}
}