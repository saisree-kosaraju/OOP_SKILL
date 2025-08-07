package OOP_Skill_1;

import java.util.Scanner;

public class narrowconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double value: ");
		a = sc.nextDouble();
		int b;
		b=(int)a;
		System.out.println("Double value of a is: "+a);
		System.out.println("Integer value of a is: "+b);

	}

}
