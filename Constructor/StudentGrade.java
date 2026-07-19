package Constructor;

public class StudentGrade {

    int marks;

    public StudentGrade(int marks) {
        this.marks = marks;
    }

    public void display() {
        switch (marks / 10) {
            case 10, 9, 8 -> System.out.println('A'); 
            case 7        -> System.out.println('B'); 
            case 6        -> System.out.println('C'); 
            case 5        -> System.out.println('D'); 
            default       -> System.out.println('F'); 
        }
    }
}
