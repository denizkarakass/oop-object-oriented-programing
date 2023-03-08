package employee;

public class main {
    public static void main(String[] args) {

        employeer worker1 = new employeer("Deniz Karakaş", 1500, 36, 2020);
        double bonus1 = worker1.bonusCalculate();
        double tax1 = worker1.taxCalculate();
        double increase1 = worker1.salaryIncrease();
        System.out.println("Bonus is:" + bonus1 + " and Tax is:" + tax1 + " salary increase is:" + increase1);

    }
}
