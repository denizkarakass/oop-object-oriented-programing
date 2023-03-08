package employee;

public class employeer {
    private int workHours, hireYear;
    private double salary;
    private String name;

    employeer(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double taxCalculate() {
        if (this.salary > 1000) {
            return 1000 * 0.03;
        }
        return 0.0;
    }

    public double bonusCalculate() {
        return this.workHours * 30;
    }

    public double salaryIncrease() {
        int year = 2023 - this.hireYear;
        if (year < 10) {
            return this.salary * 0.05;
        } else if (year < 20) {
            return this.salary * 0.1;
        }
        return this.salary;
    }

}
