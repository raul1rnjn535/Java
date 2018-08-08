/**
 * 
 */
package compute;

import java.util.*;
import team.Team;
/**
 * @author rahul
 *
 */
public class Compute {
	
	public Compute() {
		
	}

	class SortByParameter implements Comparator<Team>{
		
		public int compare(Team a, Team b) {
			float _scoreA = a.getCumulativeScore();
			float _scoreB = b.getCumulativeScore();
			return _scoreA == _scoreB ? 0 : (_scoreA > _scoreB ? -1 : 1);
		}
	}
	
	public void playMatches(ArrayList<Team>teams, int teamCount) {
		Collections.sort(teams, new SortByParameter());
		ArrayList<Team> winner = new ArrayList<Team>();
		ArrayList<Team> loser = new ArrayList<Team>();
		ArrayList<String> _loser = new ArrayList<String>();
		while(teams.size() > 1) {
			int iterator = 0;
			while(iterator < teams.size()) {
				if(iterator%2 == 1) {
					_loser.add(teams.get(iterator).getName());
				}
				iterator++;
			}
			teams.removeIf(x -> _loser.contains(x.getName()));
		}
		System.out.print("The winner in the tournament is: " + teams.get(0).getName());
		return;
	}
}
