package line_comparison;

import java.util.Scanner;

public class CheckEqualityOfTwoLinesUC2 {

	public void checkEquality() {
		// Veriable
		double x1, y1, x2, y2;

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter The Value Of x1 :-");
		x1 = sc1.nextDouble();

		System.out.println("Enter The Value Of y1 :-");
		y1 = sc1.nextDouble();

		System.out.println("Enter The Value Of x2 :-");
		x2 = sc1.nextDouble();

		System.out.println("Enter The Value Of y2 :-");
		y2 = sc1.nextDouble();

		double distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance Between Two Lines Are :-" + distance1);

		// Veriable
		double p1, q1, p2, q2;

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The Value Of p1 :-");
		p1 = sc2.nextDouble();

		System.out.println("Enter The Value Of q1 :-");
		q1 = sc2.nextDouble();

		System.out.println("Enter The Value Of p2 :-");
		p2 = sc2.nextDouble();

		System.out.println("Enter The Value Of q2 :-");
		q2 = sc2.nextDouble();

		double distance2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("Distance Between Two Lines Are :-" + distance2);

		if (distance1 == distance2) {
			System.out.println("BOTH LINES ARE EQUAL");
		} else {
			System.out.println("BOTH LINES ARE NOT EQUAL");
		}

	}

	public static void main(String[] args) {
		CheckEqualityOfTwoLinesUC2 CheckEqualityOfTwoLinesUC2 = new CheckEqualityOfTwoLinesUC2();
		CheckEqualityOfTwoLinesUC2.checkEquality();
	}

}