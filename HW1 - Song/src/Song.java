/* 
 * Tiarnan Marsten 
 * 14 Oct, 2019 
 * CSE142 
 * Assignment 1
 */

public class Song {

	public static void main(String[] args) {
		horse();
	}
	
	public static void die() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}

	public static void swSpider() {
		System.out.println("She swallowed the spider to catch the fly,");
		die();
	}

	public static void swBird() {
		System.out.println("She swallowed the bird to catch the spider,");
		swSpider();
	}

	public static void swCat() {
		System.out.println("She swallowed the cat to catch the bird,");
		swBird();
	}

	public static void swDog() {
		System.out.println("She swallowed the dog to catch the cat,");
		swCat();
	}
	
	public static void swMonkey() {
		System.out.println("She swallowed the monkey to catch the dog,");
		swDog();
	}

	
	public static void fly() {
		System.out.println("There was an old woman who swallowed a fly.");
		die();
	}

	/**
	 * Prints the spider verse.
	 */
	public static void spider() {
		fly();
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		swSpider();
	}

	/**
	 * Prints the bird verse.
	 */
	public static void bird() {
		spider();
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		swBird();
	}

	/**
	 * Prints the cat verse.
	 */
	public static void cat() {
		bird();
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		swCat();
	}

	/**
	 * Prints the dog verse.
	 */
	public static void dog() {
		cat();
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		swDog();
	}

	/**
	 * Prints my custom verse. Monkey :O
	 */
	public static void monkey() {
		dog();
		System.out.println("There was an old woman who swallowed a monkey,");
		System.out.println("Swallowing a monkey is well, quite funky.");
		swMonkey();
	}

	/**
	 * Prints the horse verse.
	 */
	public static void horse() {
		monkey();
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
}
