package language.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CommentsInJava {

	// 1. Single line comments ===> //--->Cntrl+/ (comments/uncomment)
	// 2. Multiple line comments ===> /*....*/---> Cntrl+Shift+/ (comment) ,
	// Cntrl+Shift+\(uncomment)
	// 3. Documentation comments ===> /**......*/--->Alt+Shift+J

	/*
	 * The line refers to the main method. This is always going to act like a
	 * starting point for java execution. If there is no main method, we cannot
	 * execute any program. so, whenever we want to run the program, first you need
	 * to create a main method. Then,we need to write all the instructions inside
	 * the main method only.
	 */

	/**
	 * Thrown when an application tries to call an abstract method. Normally, this
	 * error is caught by the compiler; this error can only occur at run time if the
	 * definition of some class has incompatibly changed since the currently
	 * executing method was last compiled.
	 *
	 * @since 1.0
	 */
	/**
	 * Instances of the file descriptor class serve as an opaque handle to the
	 * underlying machine-specific structure representing an open file, an open
	 * socket, or another source or sink of bytes. The main practical use for a file
	 * descriptor is to create a {@link FileInputStream} or {@link FileOutputStream}
	 * to contain it.
	 * <p>
	 * Applications should not create their own file descriptors.
	 *
	 * @author manvitha.
	 * @since 1.0
	 */

	public static void main(String[] args) {

		System.out.println("good morning");

	}

}
