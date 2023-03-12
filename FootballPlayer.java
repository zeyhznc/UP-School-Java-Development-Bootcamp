
public class FootballPlayer {
	int no;
	String name;
	boolean inPlay;
	int minutes;
	int numberOfGoals;
	
	public void play(int minutesToPlay){
		minutes = minutes + minutesToPlay;	
		
	}
	
	public void score(){
		numberOfGoals = numberOfGoals + 1; //Her score'da numberOfGoals'ü 1 artırıyoruz.
	
	}

	
}
