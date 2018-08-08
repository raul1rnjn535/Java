/**
 * 
 */
package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import team.Team;

/**
 * @author rahul
 *
 */
public class Input {
	
	public Input() {
		
	}
	public void takeInput(ArrayList<Team> teams, int teamCount) {
		try {
			System.out.println("Enter information as <TeamName Rank Parameter> : ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<teamCount;i++) {
				Team _team = new Team();
				String line = br.readLine();
				String[] strs = line.trim().split("\\s+");
				_team.setName(strs[0]);
				_team.setRank(Integer.parseInt(strs[1]));
				int[] _parameters = new int[strs.length - 2];
				for(int j=2; j< strs.length;j++) {
					_parameters[j-2] = Integer.parseInt(strs[j]);
				}
				_team.setParameters(_parameters);
				teams.add(_team);
			}
		}
		catch(Exception ex) {
			
		}
	}
}

