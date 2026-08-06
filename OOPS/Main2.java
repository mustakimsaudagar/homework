package OOPS;

public class Main2 {

	public static void main(String[] args) {

        Result r = new Result();

        r.setMarks(75);

        Student2 s = new Student2("Mustakim", r);

        s.StartExam();
        s.calculateResult();

        System.out.println("----------------");

        Admin2 a = new Admin2("Suraj", r);

        a.StartExam();
        a.calculateResult();
    }

}
