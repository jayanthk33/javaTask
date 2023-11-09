class AtmMain
{
public static void main(String args[])
{
	System.out.println("Main Running.....");
	Atm atm=new Atm();
	String[] branch=new String[5];
	branch[0]="BTM";
	branch[1]="Sivaji Nagar";
	branch[2]="Majestic";
	branch[3]="Silk board";
	branch[4]="JP Nagar";
	atm.setBranch(branch);
	
	String[] acs=new String[3];
	acs[0]="Bajaj";
	acs[1]="LG";
	acs[2]="Blue Star";
	atm.setAcs(acs);
	
	String[] cctvBrand=new String[5];
	cctvBrand[0]="Godrej";
	cctvBrand[1]="AV System";
	cctvBrand[2]="Secure eye";
	cctvBrand[3]="Zicom";
	cctvBrand[4]="Vintron";
	atm.setCctvBrand(cctvBrand);
	
	atm.show();
	System.out.println("Main Ending.....");
	
	
}

}