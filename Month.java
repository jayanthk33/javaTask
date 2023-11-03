class Month{
   String mname;
   int noOfDays;
   int noOfWeekEnds;
   int noOfHolidays;
   
   Month(String mname,int noOfDays,int noOfWeekEnds,int noOfHolidays)
   {
	   this.mname=mname;
	   this.noOfDays=noOfDays;
	   this.noOfWeekEnds=noOfWeekEnds;
	   this.noOfHolidays=noOfHolidays;
	   System.out.println("creating Month with String,int,int,int");
	 
   }
   
   void displayInfo(){
	   System.out.println("Starting displayInfo");
	   System.out.println(this.mname);
	   System.out.println(this.noOfDays);
	   System.out.println(this.noOfWeekEnds);
	   System.out.println(this.noOfHolidays);
	   
	   System.out.println("ending displayInfo");
   }


}