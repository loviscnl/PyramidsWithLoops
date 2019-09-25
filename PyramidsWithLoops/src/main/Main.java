/*
 * Nicholas Loviscek
 * loviscnl@mail.uc.edu
 * Printing pyramids using loops. It kind-of works.
 * Due: 9/26/2019
 * IS4010: Java Programming 
 * Description: What I really want is
        1
       222
      33333
     4444444
    555555555 
    
*/
package main;

public class Main {

public static void main(String[] args) {
	int odd = 1;  //declared variable for numbers per row
	int lines = 5;  //declared variable for number of lines
	int spaces = 4;  //declared variable for number of spaces
	for (int i = 1; i <= lines; i++)  // loop to get correct number of lines for the pyramid
	{ 
		for (int k=1; k<=spaces; k++)  // loop to get correct number of spaces to make the pyramid
		{System.out.print(" ");}
		
		for (int j = 1; j <= odd; j++)   // loop to have the correct number of numbers per row
		{System.out.print(i);}
		
			System.out.println();   // creates the 1,3,5,7,9 order of numbers per row
			odd = odd+2;
			spaces=spaces-1;
	}
  }
}

