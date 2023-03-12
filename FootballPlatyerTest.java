
public class FootballPlatyerTest {

	public static void main(String[] args) {
		FootballPlayer zeynep = new FootballPlayer();
		zeynep.no = 10;
		zeynep.name = "Zeynep Hazneci";
		zeynep.minutes = 0;
		zeynep.inPlay = true;
		zeynep.numberOfGoals = 0 ;
		
		// Birinci maçta zeynep'in istatistikleri
		zeynep.play(100);
		zeynep.score();
		zeynep.score();
		zeynep.score();
		zeynep.score();
		
		System.out.println("Number of goals Zeynep scored:" 
			+zeynep.numberOfGoals	);  // number of goals 4
		System.out.println("Zeynep played totally "+ zeynep.minutes
			 + " minutes so far." );  //minute is 100

		// İkinci maçta zeynep'in istatistikleri
		zeynep.play(60);
		zeynep.score();
		
		System.out.println("Number of goals Zeynep scored:" 
				+zeynep.numberOfGoals	);  // number of goals 5
			System.out.println("Zeynep played totally "+ zeynep.minutes
				 + " minutes so far." );  //minute is 160
			
		System.out.println("*******************");
		
		
		
		// BAŞKA BİR FUTBOLCU OLUŞTUR VE ONUN İSTATİSTİKLERİNİ GİR
		FootballPlayer ece = new FootballPlayer();
		ece.no = 20;
		ece.name = "Ece Hazneci";
		ece.minutes = 0;
		ece.inPlay = true;
		ece.numberOfGoals = 0;
		
		// Birinci maçta ece'in istatistikleri
		ece.play(90);
		ece.score();
		ece.score();
	
		System.out.println("Number of goals Ece scored:" 
				+ece.numberOfGoals	);  // number of goals 2
			System.out.println("Ece played totally "+ ece.minutes
				 + " minutes so far." );  //minute is 90

		// İkinci maçta ece'in istatistikleri
		ece.play(45);
		ece.score();
		
		System.out.println("Number of goals Ece scored:" 
				+ece.numberOfGoals	);  // number of goals 3
			System.out.println("Ece played totally "+ ece.minutes
				 + " minutes so far." );  //minute is 135
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
