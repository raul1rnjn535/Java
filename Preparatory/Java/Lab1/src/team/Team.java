/**
 * 
 */
package team;

/**
 * @author rahul
 *
 */
public class Team {
	
	private String name;
	private int rank;
	private int[] parameters;
	private float[] parameterWeightage;
	public Team() {
		
	}
	public Team(Team team) {
		this.name = team.getName();
		this.rank = team.getRank();
		setParameters(team.getParameters());
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
	/**
	 * @return the parameters
	 */
	public int[] getParameters() {
		return parameters;
	}
	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(int[] parameters) {
		int arrayLength = parameters.length;
		this.parameters = new int[arrayLength];
		for(int i=0;i<arrayLength;i++) {
			this.parameters[i] = parameters[i];
		}
		setParameterWeights(parameters);
	}
	/**
	 * @return the parameterWeights
	 */
	public float[] getParameterWeights() {
		return parameterWeightage;
	}
	/**
	 * @param parameters the parameterWeights to set
	 */
	public void setParameterWeights(int[] parameters) {
		int arrayLength = parameters.length;
		this.parameterWeightage = new float[arrayLength];
		for(int i=0;i<arrayLength;i++) {
			this.parameterWeightage[i] = 1;
		}
	}
	/**
	 * @return the cumulative Score
	 */
	public float getCumulativeScore() {
		float cumulativeScore = 0;
		for(int i=0;i<parameters.length;i++) {
			cumulativeScore += (parameters[i]*parameterWeightage[i]);
		}
		return cumulativeScore;
	}
	
}
