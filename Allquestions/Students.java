package Allquestions;

public class Students {

	private String name ;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int marks ;
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String marks () {
		
		System.out.println("enter marks ");
		
		int marks = 45;
		
		if (marks>0 && marks<100) {
			
			return "validate marks" ;
		}else {
			
			return "error";
		}
	}
}
