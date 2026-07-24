package Allquestions;

public class Electricity {

	public int bill () {
		
		int unit = 152 ;
		
		
		if (unit<100) {
			
			return 5*unit ;
			
			}
		else if (unit>100 && unit<200) {
			
			return 7*unit ;

		}
		
		else  {
			
			return 10*unit ;
		}
	}
}
