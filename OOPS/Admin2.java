package OOPS;

public class Admin2 extends User2 implements Exam{

	Result result;

    Admin2(String name, Result result) {
        super(name);
        this.result = result;
    }

    @Override
    public void StartExam() {
        System.out.println(name + " is monitoring the online exam.");
    }

    @Override
    void calculateResult() {

        System.out.println("Admin verified the result.");
    }
}
	

