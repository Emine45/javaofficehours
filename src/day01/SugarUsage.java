package day01;

import java.util.Scanner;

public class SugarUsage {

	public static void main(String[] args) {

		/*
		   Write a Java program that asks to user 2 questions
           Question 1 = how many tea do you drink in a day?
           Question 2 = how many sugar do you use for a glass of tea?
           Calculate how many sugar does user use as kilogram in a year and in 40 years then print it on the console
           If user doesn’t use sugar print “Good Job, less sugar more health”
           (Hint 1 sugar = 2.7 gr)
		 */
		
		//1- Get from user
		 Scanner scan = new Scanner(System.in);
		 System.out.println("How many glasses of tea dod you drink in a day");
		 double tea = scan.nextDouble();
		 System.out.println("How many cubes of sugar dou you use for a glass of tea");
		 double sugar = scan.nextDouble();
		 
		 //2- Calculate usage
		 double usageYearly = tea * sugar * 2.7 *365/1000;
		 double usageFourthy = usageYearly * 40;
		 
		 int usageYearlyInt = (int) usageYearly;
		 int usageFourthyInt = (int) usageFourthy;
		 //3-Print result
		 // check special condition
		 if(sugar==0) {
			 System.out.println("Good Job,less sugar more healty");
		 }
		 System.out.println("Your yearly usage is = " + usageYearlyInt + "kg");
		 System.out.println("Your yearly usage is = " + usageFourthyInt + "kg");
		 
	}

}
