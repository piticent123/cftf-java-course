/**
 * Import statements can be used in 2 ways - importing 1 class,
 * or importing every class in an entire package (a folder).
 *
 * Here's an example, using a class called Scanner. Scanner reads
 * user input. To just import a scanner, we would put
 *
 * import java.util.Scanner;
 *
 * Note the capital S in Scanner - the import statement has to match
 * the class name exactly.
 *
 * Alternatively, you could put
 *
 * import java.util.*
 *
 * Using the wildcard (*) to import every class.
 *
 * Try importing the random class. It is in the same package (java.util).
 */

import java.util.Random;

public class Task {
	public static int getRandomNumber() {
		// Random.nextInt() gets a new random number, up to (but)
		// not including) the bound we tell it
		Random random = new Random();
		return random.nextInt(10);
	}
}