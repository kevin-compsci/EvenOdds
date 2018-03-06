/*
Kevin Nguyen
Basic Java program that outputs whether a given number is even or odd.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java EvenOdd"
*/

//imports
import java.io.*;
import java.util.*;

//class
class EvenOdd {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		int testValue = 222323;
		Boolean v = isEvenOdd(testValue);
		//coditional to print report
		if(v) {
			System.out.println(testValue + " is Even");
		}
		else {
			System.out.println(testValue + " is Odd");
		}
	}

	//function that checks even/odd by returning boolean 1 or 0 respectively (True or False)
	public static Boolean isEvenOdd(int value) {
		//local declarations
		if((value%2) == 0) {
			return true;
		}
		return false;
	}
}