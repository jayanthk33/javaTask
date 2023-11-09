class Owner
{
	
String name="Jay";
String email="jay333@gmail.com";
Address paddress;
Address taddress;
   
void setPaddress(Address paddress)
{
	this.paddress=paddress;
}
void setTaddress(Address taddress)
{
	this.taddress=taddress;
}

void show()
{
	System.out.println("Showing Information..");
	System.out.println("Name:"+this.name);
	System.out.println("email:"+this.email);
	
 if(this.paddress!=null)
	{
		this.paddress.show();
	}
 if(this.taddress!=null)
	{
		this.taddress.show();
	}
   	
	System.out.println("Ending Information");
	
}
}