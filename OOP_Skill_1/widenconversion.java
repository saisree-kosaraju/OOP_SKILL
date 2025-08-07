package OOP_Skill_1;

import java.util.Scanner;

public class widenconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		long b = a;
		float c = a;
		System.out.println("Original value: "+a);
		System.out.println("Widening value to long: "+b);
		System.out.println("Widening value to float: "+c);
		if((int) c==a) {
			System.out.println("No data is lost during widening");
		}else {
			System.out.println("Data is lost during widening");
		}

	}

}
