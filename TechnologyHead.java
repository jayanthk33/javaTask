class TechnologyMain
{
public static void main(String[] args)
{
	System.out.println("Main Running");
	Technology technology=new Technology();
	technology.display();
	
	Technology technology1=new Technology("sql","yes","Standard",10000.00,78,"html",true,"large",70,true,"small",true);
	technology1.display();
	
	Technology technology2=new Technology("jquery","yes","medium",11000.00,71,"html",true,"small",80,true,"large",true);
	technology2.display();
	
	Technology technology3=new Technology("servlet","yes","Standard",20000.00,78,"html",true,"large",74,true,"small",true);
	technology3.display();
	
	Technology technology4=new Technology("jdbc","yes","Standard",230000.00,78,"html",true,"large",75,true,"small",true);
	technology4.display();
	
	Technology technology5=new Technology("server","yes","Standard",40000.00,78,"html",true,"large",63,true,"small",true);
	technology5.display();
	
	Technology technology1=new Technology("sql","yes","Standard",350000.00,78,"html",true,"large",59,true,"small",true);
	technology1.display();
	
	Technology technology2=new Technology("jquery","yes","medium",11000.00,71,"html",true,"small",87,true,"large",true);
	technology2.display();
	
	Technology technology3=new Technology("servlet","yes","Standard",4000.00,78,"html",true,"large",85,true,"small",true);
	technology3.display();
	
	Technology technology4=new Technology("jdbc","yes","Standard",10000.00,78,"html",true,"large",70,true,"small",true);
	technology4.display();
	
	Technology technology5=new Technology("server","yes","Standard",20000.00,78,"html",true,"large",72,true,"small",true);
	technology5.display();
	
	
	System.out.println("Main Ending");
}


}