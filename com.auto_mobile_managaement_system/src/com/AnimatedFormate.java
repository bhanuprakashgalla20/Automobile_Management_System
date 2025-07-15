package com;

public class AnimatedFormate 
{
	private String vehicalType;
	private String vehicalBrand;
	private String vehicalModel;
	private String vehicalColor;
	private double vehicalPrice;
	private String engineType;
	public void display()
	{
		System.out.println("\u001B[1m"+"\u001B[31m");
		System.out.printf("%90s ","----------AutoMObile Management System----------");
		System.out.println("\u001B[0m");
		System.out.println("\u001B[31m"+"---------------||------------------||---------------------||-------------------||---------------------||----------------"+"\u001B[0m");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s","vehicalType","vehicalBrand","vehicalModel","vehicalColor","vehicalPrice","engineType");
		System.out.println();
		System.out.println("\u001B[31m"+"\u001B[1m"+"---------------||------------------||---------------------||-------------------||---------------------||----------------"+"\u001B[0m");
		
	}
	public static void main(String[] args) {
		System.out.println("\u001B[1m"+"Hellow world...");
		
		/*
		 * \u001B[1m-->bold
		 * \u001B[0m-->reset
		 * \u001B[31m-->red
		 * \u001B[32m-->green
		 * \u001B[33m-->yellow
		 * \u001B[34m-->blue
		 * \u001B[35m-->purple
		 * \u001B[36m-->cean
		 * \u001B[37m-->gray
		 * 
		 * 
		 * background color
		 * \u001B[41m-->red
		 * \u001B[42m-->green
		 * \u001B[43m-->yellow
		 * \u001B[44m-->blue
		 * \u001B[45m-->purple
		 * \u001B[46m-->cean
		 * \u001B[47m-->gray
		 */
		AnimatedFormate af=new AnimatedFormate();
		af.display();
	}
}
