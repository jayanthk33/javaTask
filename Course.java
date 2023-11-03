class Course{
   String institueName;
   String course;
   int noOfStudents;
   int noOfFaculties;
   String location;
   int noOfClassRooms;
   double rating;
   
   Course(String institueName,String course,int noOfStudents,int noOfFaculties,String location,int noOfRooms,double rating)
   {
	   this.institueName=institueName;
	   this.course=course;
	   this.noOfStudents=noOfStudents;
	   this.noOfFaculties=noOfFaculties;
	   this.location=location;
	   this.noOfClassRooms=noOfClassRooms;
	   this.rating=rating;
	   
   }
   
   void displayInfo()
   {
	   System.out.println("Starting displayInfo");
	   System.out.println(this.institueName);
	   System.out.println(this.course);
	   System.out.println(this.noOfStudents);
	   System.out.println(this.noOfFaculties);
	   System.out.println(this.location);
	   System.out.println(this.noOfClassRooms);
	   System.out.println(this.rating);
	   
	   
	   System.out.println("ending displayInfo");
	   
   }
}