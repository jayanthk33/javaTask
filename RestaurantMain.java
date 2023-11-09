class RestaurantMain
{
public static void main(String args[])
{
	System.out.println("Main Running.....");
	Restaurant restaurant=new Restaurant();
	String[] specialItems=new String[5];
	specialItems[0]="Biryani";
	specialItems[1]="Shorma";
	specialItems[2]="Chiken nuggets";
	specialItems[3]="Salan";
	specialItems[4]="Chiken Shahi";
	restaurant.setSpecialItems(specialItems);
	restaurant.show();
	System.out.println("Main Ending.....");
	
	
}

}