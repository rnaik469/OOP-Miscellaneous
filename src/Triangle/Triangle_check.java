package Triangle;

import java.util.*;

public class Triangle_check {

	public static void main(String args[]) {
		Scanner get = new Scanner(System.in);
		Triangles triangle_check = new Triangles();//Instatiating Class Traingles
		System.out.println("Enter sides of first triangle");
		int side1 = get.nextInt();
		triangle_check.setSide1(side1);

		int side2 = get.nextInt();
		triangle_check.setSide2(side2);

		int side3 = get.nextInt();
		triangle_check.setSide3(side3);
		System.out.println(side1 + " " + side2 + " " + side3);
	
		System.out.println(triangle_check.getSide1());
		System.out.println(triangle_check.getSide2());
		System.out.println(triangle_check.getSide3());
		
		System.out.println("Is this triangle Scalene? \n" + triangle_check.isScalene(triangle_check.getSide1(),
				triangle_check.getSide2(), triangle_check.getSide3()));
		
		System.out.println("Is this triangle Isosceles? \n" + triangle_check.isIsosceles(triangle_check.getSide1(),
				triangle_check.getSide2(), triangle_check.getSide3()));
		
		System.out.println("Is this triangle Equilateral? \n" + triangle_check.isEquilateral(triangle_check.getSide1(),
				triangle_check.getSide2(), triangle_check.getSide3()));
		
		System.out.println("Is this triangle Right? \n" + triangle_check.isRight(triangle_check.getSide1(),
				triangle_check.getSide2(), triangle_check.getSide3()));

	}
}
