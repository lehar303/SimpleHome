package Leh;

import java.util.Scanner;

public class JavaHouseRunner {

	public static void main(String[] args) {
		int state;
		Scanner in = new Scanner(System.in);
		JavaHouse Leh = new JavaHouse();
		do {
			System.out.println("Have you woken Up?");
			System.out.println("1. SNOOZE");
			System.out.println("2.YES");
			System.out.println("3.HOLIDAY TODAY");
			state = in.nextInt();
			Leh.routine(state);
		} while (state == 1);

		in.close();

	}

}
