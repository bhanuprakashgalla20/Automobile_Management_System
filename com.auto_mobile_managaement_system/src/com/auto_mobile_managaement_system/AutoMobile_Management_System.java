package com.auto_mobile_managaement_system;

public class AutoMobile_Management_System
{
	public static void main(String[] args) throws InterruptedException
	{
		Vehical_Factory factory=new Vehical_Factory();
		factory.animateString("welcome to Akash Auto mobile servises");
		factory.animateString("Login to the appliction");
		
		boolean status=factory.login();
		if(status)
		{
			while(true)
			{
				int choice=factory.menu();
				switch(choice)
				{
				case 1:factory.addVehical();
				break;
				case 2:factory.removeVehical();
				break;
				case 3:factory.updateVehicalCost();
				break;
				case 4:factory.displayVehicals();
				break;
				case 5:factory.searchVehical();
				break;
				case 6:{
					System.exit(0);
				}
					
				}
			}
		}
	}
}
