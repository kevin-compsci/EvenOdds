//Kevin Nguyen
//Basic C (C files) program that outputs whether a given value is even or odd.

/*
How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "gcc *.c" to compile c files
	3.) type in "a.out" to run out file
*/

//include statements
#include <stdio.h>

//function definitions
int isEvenOdd(int value);

//main driver
int main() {
	//local declarations
	int value = 63;
	int v = isEvenOdd(value);
	//coditional to print report
	if(v == 1) {
		printf("%d is even\n", value);
	} else {
		printf("%d is odd\n", value);
	}
	return 0;
}

//function that checks even/odd by returning boolean 1 or 0 respectively
int isEvenOdd(int value) {
	if((value%2) == 0) {
		return 1;
	}
	return 0;
}