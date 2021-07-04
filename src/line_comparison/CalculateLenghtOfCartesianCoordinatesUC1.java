package line_comparison;

import java.util.Scanner;

public class CalculateLenghtOfCartesianCoordinatesUC1 {

	public static void main(String[] args) {
		// Variables
		double x1, y1, x2, y2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1 :- ");
		x1 = sc.nextDouble();

		System.out.println("Enter the value of y1 :- ");
		y1 = sc.nextDouble();

		System.out.println("Enter the value of x2 :- ");
		x2 = sc.nextDouble();

		System.out.println("Enter the value of y2 :- ");
		y2 = sc.nextDouble();

		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance Between Two Lines are :- " + distance);
	}
}