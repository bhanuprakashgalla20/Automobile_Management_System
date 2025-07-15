package com.auto_mobile_managaement_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Vehical_Factory {
	Scanner sc=new Scanner(System.in);
	List<Vehical> list=new ArrayList<Vehical>();
	public boolean login()
	{
		System.out.println("enter the 10 digit mobile number....");
		long mobileNumber=sc.nextLong();
		boolean status=false;
		if(mobileNumber>6000000000l && mobileNumber<9999999999l)
		{
			int genarateOTP=genarateOTP();
			System.out.println("your otp:"+genarateOTP);
			
			System.out.println("enter otp");
			int enterOTP=sc.nextInt();
			
			if(enterOTP==genarateOTP)
			{
				System.out.println("\u001B[1m"+"\u001B[32m"+"login successful  🔓🔓🔓"+"\u001B[0m");
				status=true;
			}
			else
			{
				System.out.println("\u001B[1m"+"\u001B[31m"+"invalid otp ❌❌"+"\u001B[0m");
				System.out.println("please try again");
			}
		}
		else
		{
			System.out.println("\u001B[1m"+"\u001B[31m"+"invalid mobile number ❌❌"+"\u001B[0m");
			System.out.println("mobile number must have 10 digis");
		}
		return status;
	}
	private int genarateOTP()
	{
		Random random=new Random();
		int otp=random.nextInt(1000,9999);
		return otp;
	}
	public int menu()
	{
		System.out.println("\u001B[1m"+"\u001B[34m"+"1.Add a Vehical");
		System.out.println("\u001B[34m"+"2.Remove a vehical");
		System.out.println("\u001B[34m"+"3.Update the vehical");
		System.out.println("\u001B[34m"+"4.DIsplay vehical");
		System.out.println("\u001B[34m"+"5.search the vehical");
		System.out.println("\u001B[34m"+"6. exit"+"\u001B[0m");
		int choice=sc.nextInt();
		return choice;
	}
	
	public void addVehical()
	{
		System.out.println("enter the vehical type");
		String vehicalType=sc.next();
		System.out.println("enter the vehical brand");
		String vehicalBrand=sc.next();
		System.out.println("enter the vehical model");
		String vehicalModel=sc.next();
		System.out.println("enter the vehical color");
		String vehicalColor=sc.next();
		System.out.println("enter the vehical cost");
		double vehicalCost=sc.nextDouble();
		System.out.println("enter the Enginee Type");
		String engineType=sc.next();
		list.add(new Vehical(vehicalType, vehicalBrand,vehicalModel, vehicalColor, vehicalCost, engineType));
		System.out.println("vehical added successfully");
	}
	public void removeVehical()
	{
		System.out.println("enter the vehical type");
		String vehicalType=sc.next();
		System.out.println();
		System.out.println("enter the vehical brand");
		String vehicalBrand=sc.next();
		System.out.println("enter the vehical model");
		String vehicalModel=sc.next();
		
		Iterator<Vehical> vehicalIterater=list.iterator();
		boolean status=false;
		while(vehicalIterater.hasNext())
		{
			Vehical vehical=vehicalIterater.next();
			if(vehical.getVehicalType().equalsIgnoreCase(vehicalType) && vehical.getVehicalBrand().equalsIgnoreCase(vehicalBrand) && vehical.getVehicalModel().equalsIgnoreCase(vehicalModel)
					)
			{
				vehicalIterater.remove();
				status=true;
				break;
			}
		}
		if(status)
		{
			System.out.println("vehical removed successfully👌👌");
		}
		else
		{
			System.out.println("vehical not found");
		}
	}
	public void updateVehicalCost()
	{
		System.out.println("enter the vehical type");
		String vehicalType=sc.next();
		System.out.println("enter the vehical brand");
		String vehicalBrand=sc.next();
		System.out.println("enter the vehical model");
		String vehicalModel=sc.next();
		boolean status=false;
		for(Vehical vehical:list)
		{
			if(vehical.getVehicalType().equalsIgnoreCase(vehicalType) && vehical.getVehicalBrand().equalsIgnoreCase(vehicalBrand) && vehical.getVehicalModel().equalsIgnoreCase(vehicalModel)
					)
			{
				System.out.println("vehical present ");
				System.out.println("enter the new cost");
				double newCost=sc.nextDouble();
				vehical.setVehicalPrice(newCost);
				status=true;
				System.out.println("vehical updated successfully");
				System.out.println(vehical);
				break;
			}
		}
		if(!status)
		{
			System.out.println("vehical not found for enterd details");
		}
	}
	public void searchVehical()
	{
		System.out.println("enter the vehical brand");
		String vehicalBrand=sc.next();
		System.out.println("enter the vehical model");
		String vehicalModel=sc.next();
		boolean status=false;
		for(Vehical vehical:list)
		{
			if(vehical.getVehicalBrand().equalsIgnoreCase(vehicalBrand) && vehical.getVehicalModel().equalsIgnoreCase(vehicalModel)
					)
			{
				System.out.println("vehical found");
				status=true;
				break;
			}
		}
		if(!status)
		{
			System.out.println("vehical not found");
		}
	}
	
	public void displayVehicals()
	{
		System.out.println("\u001B[1m"+"\u001B[31m");
		System.out.printf("%90s ","----------AutoMObile Management System----------");
		System.out.println("\u001B[0m");
		System.out.println("\u001B[31m"+"---------------||------------------||---------------------||-------------------||---------------------||----------------"+"\u001B[0m");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s","vehicalType","vehicalBrand","vehicalModel","vehicalColor","vehicalPrice","engineType");
		System.out.println();
		System.out.println("\u001B[31m"+"\u001B[1m"+"---------------||------------------||---------------------||-------------------||---------------------||----------------"+"\u001B[0m");
		for(Vehical vehical:list)
		{
			System.out.println("\u001B[3m");
			System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s",vehical.getVehicalType(),vehical.getVehicalBrand(),vehical.getVehicalModel(),vehical.getVehicalColor(),vehical.getVehicalPrice(),vehical.getEngineType());
			System.out.println("\u001B[0m");
			System.out.println("---------------||------------------||---------------------||-------------------||---------------------||----------------");
		}
	}
	
	public void animateString(String string) throws InterruptedException
	{
		for(int i=0;i<=string.length()-1;i++)
		{
			System.out.print("\u001B[1m"+"\u001B[31m"+string.charAt(i)+"\u001B[0m");
			Thread.sleep(100);
		}
		System.out.println();
	}
}
