class FreeHead
{
   public static void main(String[] args)
   {
	   System.out.println("Starting main in FreeHead");
	   
	   Free free=new Free("Bag","offered",true);
	   free.displayInfo();
	   
	   Free free1=new Free("laptop","govt-issued",false);
	   free1.displayInfo();
	   
	   Free free2=new Free("car","purchased",true);
	   free2.displayInfo();
	   
	   Free free3=new Free("charger","box-piece",true);
	   free3.displayInfo();
	   
	   Free free4=new Free("Erphne","purchased",false);
	   free4.displayInfo();
	   
	   Free free5=new Free("mobile","gifted",true);
	   free5.displayInfo();
	   
	   Free free6=new Free("clothes","purchased",true);
	   free6.displayInfo();
	   
	   Free free7=new Free("ticket","govt-issued",true);
	   free7.displayInfo();
	   
	   Free free8=new Free("helmet","purchased",false);
	   free8.displayInfo();
	   
	   Free free9=new Free("Food","company-facility",true);
	   free9.displayInfo();
	   
	   Free free10=new Free("water","offered",false);
	   free10.displayInfo();
	   
	   Free free11=new Free("drinks","gifted",true);
	   free11.displayInfo();
	   
	   System.out.println("ending main in FreeHead");
	   
   }
}