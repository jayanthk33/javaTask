class Free
{
	String why;
	String what;
	boolean freeForAll;
	
	Free(String why,String what,boolean freeForAll)
	{
		this.what=what;
		this.why=why;
		this.freeForAll=true;
	    System.out.println("Constructor invoked with string,string,boolean args");
	}
	
	void displayInfo()
	{
	  System.out.println("product is:"+this.what);
	  System.out.println("Reason is :"+this.why);
	  System.out.println(" freeForAll :"+this.freeForAll);
	}

}