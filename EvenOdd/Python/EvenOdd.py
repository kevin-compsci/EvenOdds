#
#Kevin Nguyen
#Basic Python program that outputs whether a given value is even or odd.
#
#How to run (linux):
#	1.) open command line and cd into directory folder of where this code is
#	2.) type in "python EvenOdd.py"

#import statements
import sys;
import array;

#function that checks even/odd by returning boolean 1 or 0 respectively
def isEvenOdd(value):
	if((value%2) is 0):
		return 1;
	return 0;

#main driver below
value = 331;
v = isEvenOdd(value);
#coditional to print report
if(v is 1):
	print str(value) + " is even";
else:
	print str(value) + " is odd";