/*
 * Nicholas Loviscek
 * loviscnl@mail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
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
		int lines = 5;
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
			
			
		}
	}
}
