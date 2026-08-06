package OOPS;

public class Student2 extends User2 implements Exam {
	
	Result result;

    Student2(String name, Result result) {
        super(name);
        this.result = result;
    }

    @Override
    public void StartExam() {
        System.out.println(name + " started the online exam.");
    }

    @Override
    void calculateResult() {

        if (result.getMarks() >= 40)
            System.out.println("Student Result : PASS");
        else
            System.out.println("Student Result : FAIL");
    }
}

