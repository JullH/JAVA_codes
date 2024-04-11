package day06;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        new Empoloyee("jack", 6000.0);
        Work work = new Work("xiaoming", 5000.0);
        Manager manager = new Manager("xiao", 5000.0, 2000.0);
        Test test = new Test();
        test.showEmpAnnual(work);
        test.showEmpAnnual(manager);
        test.testWork(work);
        test.testWork(manager);
    }

    public void showEmpAnnual(Empoloyee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Empoloyee e) {
        if (e instanceof Work) {
            ((Work)e).work();
        } else if (e instanceof Manager) {
            ((Manager)e).manage();
        }

    }
}
