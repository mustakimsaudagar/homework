package practice_session;

public class Grade {
	
	public char  getGrade(int marks) {
		
		if (marks>=90) {
			return 'a';
		}else if (marks>=80){
			return 'b';
		}else if (marks>=70) {
			return 'c';
		}else if (marks>=60) {
			return 'd';
		}
		else {
			return 'f';
		}
	}
}
