/**
 * 
 */
package tournament;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
import team.Team;
import input.Input;
import compute.Compute;
/**
 * @author rahul
 *
 */
public class Tournament {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no of teams playing in the tournament: ");
		try {
			int n = scanner.nextInt();
			boolean isPowerOfTwo = false;
			while(!isPowerOfTwo) {
				if(((n & (n-1))==0)) {
					isPowerOfTwo = true;
				}
				else {
					System.out.println("Wrong Input!!!Input should be a power of 2.");
					System.out.print("Enter the no of teams playing in the tournament: ");
					n = scanner.nextInt();
				}
			}
			
			ArrayList<Team> teams = new ArrayList<Team>();
			Input input = new Input();
			input.takeInput(teams, n);	
			Compute compute = new Compute();
			compute.playMatches(teams, n);
			return;
		}
		catch(Exception ex) {
			//throw ex;
		}
	}

}
