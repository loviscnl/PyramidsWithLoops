/*
 * Nicholas Loviscek
 * loviscnl@mail.uc.edu
 * Printing pyramids using loops. It kind-of works.
 * Due: 9/26/2019
 * IS4010: Java Programming 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
    
    team then commit
*/
package main;

public class Main {

public static void main(String[] args) {
	int odd = 1;
	int lines = 5;
	int spaces = 4;
	for (int i = 1; i <= lines; i++) 
	{
		for (int k=1; k<=spaces; k++)
		{System.out.print(" ");}
		
		for (int j = 1; j <= odd; j++)
		{System.out.print(i);}
		
			System.out.println();
			odd = odd+2;
			spaces=spaces-1;
	}
  }
}

