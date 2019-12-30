/*
 * Tiarnan Marsten
 * 03 Dec, 2019
 * CSE142
 * Assignment 2
 */

public class SpaceNeedle {

	/** Size of the space needle. */
	public static final int SIZE = 4;

	/**
	 * Print the space needle.
	 * @param args
	 */
	public static void main(String[] args) {
		needlePoint();
		needleDomeTop();
		needleDomeMiddle();
		needleDomeBottom();
		needlePoint();
		needleBody();
		needleDomeTop();
		needleDomeMiddle();
	}

	/**
	 * Creates the point on top of the dome.
	 */
	public static void needlePoint() {
		
		for (int i = 0; i < SIZE; i++) {
			
			for (int j = 0; j < SIZE * 3; j++) {
				System.out.print(" ");
			}
			
			System.out.print("||");
			System.out.println();
		}
	}

	/** 
	 * Creates the top half of the dome. 
	 */
	public static void needleDomeTop() {
		
		for (int i = 0; i < SIZE; i++) {
			
			for (int j = 0; j < ((SIZE - 1) * 3) - (i * 3); j++) {
				System.out.print(" ");
			}
			
			System.out.print("__/");
			
			for (int k = 0; k < i * 3; k++) {
				System.out.print(":");
			}
			
			System.out.print("||");
			
			for (int l = 0; l < i * 3; l++) {
				System.out.print(":");
			}
			
			System.out.print("\\__");
			System.out.println();
		}
	}

	/**
	 * Creates the middle section between the top and the bottom
	 * of the dome.
	 */
	public static void needleDomeMiddle() {
		
		System.out.print("|");
		
		for (int i = 0; i < SIZE * 6; i++) {
			System.out.print("\"");
		}
		
		System.out.print("|");
		System.out.println();
	}

	/**
	 * Creates the bottom half of the dome.
	 */
	public static void needleDomeBottom() {
		
		for (int i = 0; i < SIZE; i++) {
			
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			
			System.out.print("\\_");
			
			for (int k = 0; k < (SIZE + (SIZE * 2) - 1) - (2 * i); k++) {
				System.out.print("/\\");
			}
			
			System.out.print("_/");
			System.out.println();
		}
	}

	/*
	 * Creates the body / middle section of the space needle.
	 */
	public static void needleBody() {
		
		for (int i = 0; i < SIZE * SIZE; i++) {
			
			for (int j = 0; j < SIZE * 2 + 1; j++) {
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			for (int k = 0; k < SIZE - 2; k++) {
				System.out.print("%");
			}
			
			System.out.print("||");
			
			for (int l = 0; l < SIZE - 2; l++) {
				System.out.print("%");
			}
			
			System.out.print("|");
			System.out.println();
		}
	}
}
