package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {

		 /*
		   Ask user to enter 2 integer then find
           GCD (Greatest Common Divisor) and
           LCM (Least Common Multiple)
           (if user enter 30 and 40, GCD = 10 and LCM = 120)
		 */
		
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two positive integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		for (int i=1; i<=a ; i++){
			if (a%i == 0 && b%i == 0) {
				list.add(i);
			}			
		}
		int gcd = list.get(list.size()-1);
		int lcm = a*b/gcd;
		System.out.println("Greates Common Divisor of " + a + " and " + b + " is " + gcd  );
		System.out.println("Least Common Multiple of " + a + " and " + b + " is " + lcm  );
	}

}
