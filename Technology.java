class Technology
{
     String name;
	 int scalability;
	 int noOfBranches;
	 String data;
	 boolean connectivity;
	 boolean availability;
	 String interviewMode;
	 String companyName;
	 int noOfVaccancies;
	 String jobRole;
	 int noOfStdPlaced;
	 double rating;
	 
	 Placement(String college,int noOfStudents,int noOfBranches,String jobLocation,boolean online,boolean offline,String interviewMode,String companyName,int noOfVaccancies,String jobRole,int noOfStdPlaced,double rating)
	 {
		 this.college=college;
		 this.noOfStudents=noOfStudents;
		 this.noOfBranches=noOfBranches;
		 this.jobLocation=jobLocation;
		 this.online=online;
		 this.offline=offline;
		 this.interviewMode=interviewMode;
		 this.companyName=companyName;
		 this.noOfVaccancies=noOfVaccancies;
		 this.jobRole=jobRole;
		 this.noOfStdPlaced=noOfStdPlaced;
		 this.rating=rating;
	 }
	 void displayInfo()
   {
	   System.out.println("Starting displayInfo");
	   System.out.println(this.college);
	   System.out.println(this.noOfStudents);
	   System.out.println(this.noOfBranches);
	   System.out.println(this.jobLocation);
	   System.out.println(this.online);
	   System.out.println(this.offline);
	   System.out.println(this.interviewMode);
	   System.out.println(this.companyName);
	   System.out.println(this.noOfVaccancies);
	   System.out.println(this.jobRole);
	   System.out.println(this.noOfStdPlaced);
	   System.out.println(this.rating);
	   
	   
	   System.out.println("ending displayInfo");
	   
   }
	 
	 
	 

}